package com.alexkoveckiy.strategy.server.messenger.api.handler;

import com.alexkoveckiy.strategy.server.protocol.RequestData;
import com.alexkoveckiy.strategy.server.protocol.ResponseData;
import com.alexkoveckiy.strategy.server.router.handler.AbstractRequestHandler;

/**
 * @author Alexey Koveckiy on 09.04.2017.
 */
public abstract class MessengerRequestHandler<T extends RequestData, R extends ResponseData> extends AbstractRequestHandler<T, R> {
}
