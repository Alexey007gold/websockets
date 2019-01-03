package com.alexkoveckiy.strategy.server.authorization.api.handler;

import com.alexkoveckiy.strategy.server.protocol.RequestData;
import com.alexkoveckiy.strategy.server.protocol.ResponseData;
import com.alexkoveckiy.strategy.server.router.handler.AbstractRequestHandler;

/**
 * @author Alexey Koveckiy on 10.04.2017.
 */
public abstract class AuthorizationRequestHandler<T extends RequestData, R extends ResponseData> extends AbstractRequestHandler<T, R> {
}
