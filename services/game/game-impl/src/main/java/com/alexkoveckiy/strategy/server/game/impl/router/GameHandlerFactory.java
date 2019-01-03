package com.alexkoveckiy.strategy.server.game.impl.router;

import com.alexkoveckiy.strategy.server.game.api.handler.GameRequestHandler;
import com.alexkoveckiy.strategy.server.router.factory.RequestHandlerFactory;
import org.springframework.stereotype.Component;

/**
 * @author Alexey Koveckiy on 07.05.2017.
 */
@Component
public class GameHandlerFactory extends RequestHandlerFactory<GameRequestHandler> {
}
