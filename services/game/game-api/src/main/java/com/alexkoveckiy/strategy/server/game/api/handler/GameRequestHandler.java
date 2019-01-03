package com.alexkoveckiy.strategy.server.game.api.handler;

import com.alexkoveckiy.strategy.server.protocol.RequestData;
import com.alexkoveckiy.strategy.server.protocol.ResponseData;
import com.alexkoveckiy.strategy.server.router.handler.AbstractRequestHandler;

/**
 * @author Alexey Koveckiy on 07.05.2017.
 */
public abstract class GameRequestHandler<T extends RequestData, R extends ResponseData> extends AbstractRequestHandler<T, R> {
}
