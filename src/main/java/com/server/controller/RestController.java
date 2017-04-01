//package com.server.controller;
//
//import org.springframework.http.MediaType;
//import org.springframework.messaging.converter.StringMessageConverter;
//import org.springframework.messaging.simp.stomp.StompSessionHandler;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.socket.client.WebSocketClient;
//import org.springframework.web.socket.client.standard.StandardWebSocketClient;
//import org.springframework.web.socket.messaging.WebSocketStompClient;
//
///**
// * Created by Alexe on 08.03.2017.
// */
//@org.springframework.web.bind.annotation.RestController
//@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
//public class RestController {
//
//    @RequestMapping(path = "")
//    public String process() {
//        WebSocketClient webSocketClient = new StandardWebSocketClient();
//        WebSocketStompClient stompClient = new WebSocketStompClient(webSocketClient);
//        stompClient.setMessageConverter(new StringMessageConverter());
//
//        String url = "ws://localhost:8080/chat/info";
//        StompSessionHandler sessionHandler = new MyStompSessionHandler();
//        stompClient.connect(url, sessionHandler);
//
//        return "sd";
//    }
//}
