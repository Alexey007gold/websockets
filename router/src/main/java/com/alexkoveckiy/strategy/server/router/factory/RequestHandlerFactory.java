package com.alexkoveckiy.strategy.server.router.factory;

import com.alexkoveckiy.strategy.server.protocol.Request;
import com.alexkoveckiy.strategy.server.router.handler.AbstractRequestHandler;

/**
 * @author Alexey Koveckiy on 09.04.2017.
 */
public abstract class RequestHandlerFactory<T extends AbstractRequestHandler> extends HandlerFactory<T> {

    @Override
    protected String getRouteKey(Request<?> req) {
        return req.getHeader().getCommand();
    }
}
