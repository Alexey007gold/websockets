//package com.server.controller;
//
//import org.springframework.messaging.simp.stomp.StompHeaders;
//import org.springframework.messaging.simp.stomp.StompSession;
//import org.springframework.messaging.simp.stomp.StompSessionHandlerAdapter;
//
///**
// * Created by Alexe on 09.03.2017.
// */
//class MyStompSessionHandler extends StompSessionHandlerAdapter {
//
//    @Override
//    public void afterConnected(StompSession session, StompHeaders connectedHeaders) {
//        System.out.println("afterConnected");
//        session.send("/chat", "payload");
//    }
//}
