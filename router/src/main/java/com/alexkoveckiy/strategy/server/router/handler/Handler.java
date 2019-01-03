package com.alexkoveckiy.strategy.server.router.handler;

import com.alexkoveckiy.strategy.server.protocol.Request;
import com.alexkoveckiy.strategy.server.protocol.Response;


/**
 * Handler interface
 *
 * @author Alexey Koveckiy on 09.04.2017.
 */
public interface Handler {
    String getName();
    Response<?> handle(final Request<?> req);
}
