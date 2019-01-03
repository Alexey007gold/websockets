package com.alexkoveckiy.strategy.server.wsfrontend.client;

import org.java_websocket.client.WebSocketClient;
import org.java_websocket.drafts.Draft_17;
import org.java_websocket.handshake.ServerHandshake;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

/**
 * Created by Alexe on 02.04.2017.
 */
public class JavaWebSocket extends WebSocketClient {

    private static JavaWebSocket javaWebSocket;

    public static void main(String[] args) {
        try {
            javaWebSocket = new JavaWebSocket(new URI("ws://localhost:8080/ws"));
            javaWebSocket.connect();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    public JavaWebSocket(URI serverURI) {
        super(serverURI, new Draft_17(), null, 0);
    }

    public JavaWebSocket(URI serverURI, Map<String,String> headers) {
        super(serverURI, new Draft_17(), headers, 0);
    }

    @Override
    public void onOpen(ServerHandshake serverHandshake) {
//        //registration
//        javaWebSocket.send("{\"header\":{\"type\":\"authorization\",\"command\":\"register\"}, \"data\":{\"login\":\"alexey\",\"nick_name\":\"alexey007\",\"password\":\"10244201\"}}");

        //login
        javaWebSocket.send("{\"header\":{\"type\":\"authorization\",\"command\":\"login\"}, \"data\":{\"login\":\"alexey\",\"password\":\"10244201\"}}");

        //registration
        javaWebSocket.send("{\"header\":{\"type\":\"messenger\",\"command\":\"test\"}}");
    }

    @Override
    public void onMessage(String s) {
        System.out.println(s);
    }

    @Override
    public void onClose(int i, String s, boolean b) {
        System.out.println("closed");
    }

    @Override
    public void onError(Exception e) {

    }
}
