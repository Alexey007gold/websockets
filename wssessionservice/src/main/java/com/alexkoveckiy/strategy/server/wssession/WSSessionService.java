package com.alexkoveckiy.strategy.server.wssession;

import org.springframework.web.socket.WebSocketSession;

/**
 * Created by Alexe on 09.04.2017.
 */
public interface WSSessionService {

    void put(WebSocketSession session, String userId);
    WebSocketSession getSession(String userId);
    void remove(String userId);
}
