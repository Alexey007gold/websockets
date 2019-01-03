package com.alexkoveckiy.strategy.server.authorization.impl.router;

import com.alexkoveckiy.strategy.server.authorization.api.handler.AuthorizationRequestHandler;
import com.alexkoveckiy.strategy.server.router.factory.HandlerFactory;
import com.alexkoveckiy.strategy.server.router.handler.ByCommandRouterHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Alexey Koveckiy on 10.04.2017.
 */
@Component
public class AuthorizationRouterHandler extends ByCommandRouterHandler<AuthorizationRequestHandler> {

    @Autowired
    private AuthorizationHandlerFactory handlerFactory;

    @Override
    public String getName() {
        return "authorization";
    }

    @Override
    protected HandlerFactory<AuthorizationRequestHandler> getHandlerFactory() {
        return handlerFactory;
    }
}
