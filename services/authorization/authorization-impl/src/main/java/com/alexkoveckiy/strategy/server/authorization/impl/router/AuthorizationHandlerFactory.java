package com.alexkoveckiy.strategy.server.authorization.impl.router;

import com.alexkoveckiy.strategy.server.authorization.api.handler.AuthorizationRequestHandler;
import com.alexkoveckiy.strategy.server.router.factory.RequestHandlerFactory;
import org.springframework.stereotype.Component;

/**
 * @author Alexey Koveckiy on 10.04.2017.
 */
@Component
public class AuthorizationHandlerFactory extends RequestHandlerFactory<AuthorizationRequestHandler> {
}
