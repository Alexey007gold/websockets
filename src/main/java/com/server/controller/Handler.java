package com.server.controller;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

/**
 * Created by Alexe on 01.04.2017.
 */
public class Handler extends TextWebSocketHandler {
    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        TextMessage returnMessage = new TextMessage(message.getPayload()
                + " received at server");
        session.sendMessage(returnMessage);
    }
}
