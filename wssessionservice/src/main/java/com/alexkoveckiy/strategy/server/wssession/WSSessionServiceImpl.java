package com.alexkoveckiy.strategy.server.wssession;

import org.springframework.stereotype.Component;
import org.springframework.web.socket.WebSocketSession;

import java.util.HashMap;
import java.util.Map;

/**
 * Implementation for {@link WSSessionService} interface
 * based on {@link HashMap}
 *
 * @author Alexey Koveckiy on 09.04.2017.
 */
@Component
public class WSSessionServiceImpl implements WSSessionService {

    private Map<String, WebSocketSession> userIdWebSocketSessionMap = new HashMap<>();

    @Override
    public void put(WebSocketSession session, String userId) {
        userIdWebSocketSessionMap.put(userId, session);
    }

    @Override
    public WebSocketSession getSession(String userId) {
        return userIdWebSocketSessionMap.get(userId);
    }

    @Override
    public void remove(String userId) {
        userIdWebSocketSessionMap.remove(userId);
    }


}
