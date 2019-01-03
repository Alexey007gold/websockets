package com.alexkoveckiy.strategy.server.router.factory;

import com.alexkoveckiy.strategy.server.protocol.Request;
import com.alexkoveckiy.strategy.server.router.handler.ByCommandRouterHandler;
import org.springframework.stereotype.Component;

/**
 * @author Alexey Koveckiy on 09.04.2017.
 */
@Component
public class ByCommandHandlerFactory<T extends ByCommandRouterHandler> extends HandlerFactory<T> {

    @Override
    protected String getRouteKey(Request<?> req) {
        return req.getHeader().getType();
    }
}
