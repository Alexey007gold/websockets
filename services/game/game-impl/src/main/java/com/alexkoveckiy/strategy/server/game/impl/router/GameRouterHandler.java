package com.alexkoveckiy.strategy.server.game.impl.router;

import com.alexkoveckiy.strategy.server.game.api.handler.GameRequestHandler;
import com.alexkoveckiy.strategy.server.router.factory.HandlerFactory;
import com.alexkoveckiy.strategy.server.router.handler.ByCommandRouterHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Alexey Koveckiy on 07.05.2017.
 */
@Component
public class GameRouterHandler extends ByCommandRouterHandler<GameRequestHandler> {

    @Autowired
    private GameHandlerFactory handlerFactory;

    @Override
    public String getName() {
        return "game";
    }

    @Override
    protected HandlerFactory<GameRequestHandler> getHandlerFactory() {
        return handlerFactory;
    }
}
