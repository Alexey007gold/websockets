package com.alexkoveckiy.strategy.server.wsfrontend.config;

import com.alexkoveckiy.strategy.server.authorization.impl.configuration.AuthorizationImplConfig;
import com.alexkoveckiy.strategy.server.dao.configuration.PersistenceJPAConfig;
import com.alexkoveckiy.strategy.server.datamapper.configuration.DataMapperConfig;
import com.alexkoveckiy.strategy.server.game.impl.configuration.GameImplConfig;
import com.alexkoveckiy.strategy.server.messenger.impl.configuration.MessengerImplConfig;
import com.alexkoveckiy.strategy.server.modelmapper.configuration.ModelMapperConfig;
import com.alexkoveckiy.strategy.server.router.configuration.RouterConfig;
import com.alexkoveckiy.strategy.server.wsfrontend.controller.WSHandshakeInterceptor;
import com.alexkoveckiy.strategy.server.wsfrontend.controller.WSMessageHandler;
import com.alexkoveckiy.strategy.server.wssession.configuration.WSSessionConfig;
import org.springframework.context.annotation.*;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

/**
 * Created by Alexe on 01.04.2017.
 */
@Configuration
@EnableWebSocket
@ComponentScan(basePackages = {"com.alexkoveckiy.strategy.server.wsfrontend"},
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, value = Configuration.class))
@Import({PersistenceJPAConfig.class,
        DataMapperConfig.class,
        AuthorizationImplConfig.class,
        MessengerImplConfig.class,
        RouterConfig.class,
        WSSessionConfig.class,
        GameImplConfig.class,
        ModelMapperConfig.class
})
public class Configurer implements WebSocketConfigurer {
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
