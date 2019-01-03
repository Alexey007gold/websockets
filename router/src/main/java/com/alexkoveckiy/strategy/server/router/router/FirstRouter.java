package com.alexkoveckiy.strategy.server.router.router;

import com.alexkoveckiy.strategy.server.router.factory.ByCommandHandlerFactory;
import com.alexkoveckiy.strategy.server.router.handler.ByCommandRouterHandler;
import com.alexkoveckiy.strategy.server.router.handler.ByTypeRouterHandler;
import com.alexkoveckiy.strategy.server.router.factory.HandlerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Alexey Koveckiy on 09.04.2017.
 */
@Component
public class FirstRouter extends ByTypeRouterHandler {

    @Autowired
    private ByCommandHandlerFactory handlerFactory;

    @Override
    public String getName() {
        return "first_router";
    }

    @Override
    protected HandlerFactory<ByCommandRouterHandler> getHandlerFactory() {
        return handlerFactory;
    }
}
