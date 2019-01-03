package com.alexkoveckiy.strategy.server.router.handler;

import com.alexkoveckiy.strategy.server.protocol.Request;
import com.alexkoveckiy.strategy.server.protocol.Response;
import com.alexkoveckiy.strategy.server.router.factory.HandlerFactory;

/**
 * @author Alexey Koveckiy on 09.04.2017.
 */
public abstract class AbstractRouterHandler<T extends Handler> implements Handler {

    @Override
    public Response<?> handle(Request<?> msg) {
        return getHandlerFactory().getHandler(msg).handle(msg);
    }

    protected abstract HandlerFactory<T> getHandlerFactory();
}
