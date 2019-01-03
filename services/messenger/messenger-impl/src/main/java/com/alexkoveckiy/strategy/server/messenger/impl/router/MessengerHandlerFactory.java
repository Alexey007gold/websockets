package com.alexkoveckiy.strategy.server.messenger.impl.router;

import com.alexkoveckiy.strategy.server.messenger.api.handler.MessengerRequestHandler;
import com.alexkoveckiy.strategy.server.router.factory.RequestHandlerFactory;
import org.springframework.stereotype.Component;

/**
 * @author Alexey Koveckiy on 09.04.2017.
 */
@Component
public class MessengerHandlerFactory extends RequestHandlerFactory<MessengerRequestHandler> {
}
