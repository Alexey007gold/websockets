package com.alexkoveckiy.strategy.server.messenger.impl.router;

import com.alexkoveckiy.strategy.server.messenger.api.handler.MessengerRequestHandler;
import com.alexkoveckiy.strategy.server.router.factory.HandlerFactory;
import com.alexkoveckiy.strategy.server.router.handler.ByCommandRouterHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Alexey Koveckiy on 09.04.2017.
 */
@Component
public class MessengerRouterHandler extends ByCommandRouterHandler<MessengerRequestHandler> {

    @Autowired
    private MessengerHandlerFactory handlerFactory;

    @Override
    public String getName() {
        return "messenger";
    }

    @Override
    protected HandlerFactory<MessengerRequestHandler> getHandlerFactory() {
        return handlerFactory;
    }
}
