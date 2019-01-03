package com.alexkoveckiy.strategy.server.wsfrontend.controller;

import com.alexkoveckiy.strategy.server.authorization.api.message.AuthorizationResponseData;
import com.alexkoveckiy.strategy.server.datamapper.DataMapper;
import com.alexkoveckiy.strategy.server.protocol.Request;
import com.alexkoveckiy.strategy.server.protocol.Response;
import com.alexkoveckiy.strategy.server.protocol.ResponseFactory;
import com.alexkoveckiy.strategy.server.router.router.FirstRouter;
import com.alexkoveckiy.strategy.server.wssession.WSSessionService;
import com.fasterxml.jackson.core.type.TypeReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import static com.alexkoveckiy.strategy.server.protocol.ResponseFactory.Status.BAD_REQUEST;
import static com.alexkoveckiy.strategy.server.protocol.ResponseFactory.Status.FORBIDDEN;

/**
 * Created by Alexe on 01.04.2017.
 */
@Component
public class WSMessageHandler extends TextWebSocketHandler {

    @Autowired
    private FirstRouter firstRouter;

    @Autowired
    private DataMapper dataMapper;

    @Autowired
    private WSSessionService wsSessionService;

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        Request<?> request = null;
        try {
            request = parseRequest(session, message);
            Response<?> response;
            if (request.getUserId() != null) {
                if (!request.getHeader().getType().equals("authorization"))
                    response = firstRouter.handle(request);
                else
                    response = ResponseFactory.createResponse(request, FORBIDDEN, "You are already logged in!");
            } else if (request.getHeader().getType().equals("authorization")) {
                response = handleAuthorization(session, request);
            } else
                response = ResponseFactory.createResponse(request, FORBIDDEN, "You are not logged in!");

            session.sendMessage(new TextMessage(dataMapper.dataToString(response)));
        } catch (Exception e) {
            session.sendMessage(new TextMessage(dataMapper.dataToString(ResponseFactory.createResponse(request, BAD_REQUEST))));
        }
    }

    @SuppressWarnings("unchecked")
    private Response<?> handleAuthorization(WebSocketSession session, Request<?> request) {
        Response<AuthorizationResponseData> res = (Response<AuthorizationResponseData>) firstRouter.handle(request);
        if (res.getStatus().getCode() == 200) {
            wsSessionService.put(session, res.getData().getUserId());
            session.getAttributes().put("user_id", res.getData().getUserId());
        }
        return res;
    }

    private Request<?> parseRequest(WebSocketSession session, TextMessage message) {
        Request<?> request = dataMapper.mapData(message.getPayload(), new TypeReference<Request<?>>() {});
        request.setUserId((String) session.getAttributes().get("user_id"));
        return request;
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) {
        Object userId = session.getAttributes().get("user_id");
        if (userId != null)
            wsSessionService.remove((String) userId);
    }
}
