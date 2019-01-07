package com.alexkoveckiy.strategy.server.config;

import com.alexkoveckiy.strategy.server.wsfrontend.controller.WSHandshakeInterceptor;
import com.alexkoveckiy.strategy.server.wsfrontend.controller.WSMessageHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

/**
 * Created by Oleksii_Kovetskyi on 1/7/2019.
 */
@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {
    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(handler(), "/ws")
                .setAllowedOrigins("*")
                .addInterceptors(new WSHandshakeInterceptor());
    }

    @Bean
    public WebSocketHandler handler() {
        return new WSMessageHandler();
    }
}
