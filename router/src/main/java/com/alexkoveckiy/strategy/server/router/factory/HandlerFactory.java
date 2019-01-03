package com.alexkoveckiy.strategy.server.router.factory;

import com.alexkoveckiy.strategy.server.protocol.Request;
import com.alexkoveckiy.strategy.server.router.handler.Handler;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Alexey Koveckiy on 09.04.2017.
 */
public abstract class HandlerFactory<T extends Handler> {

    @Autowired
    private List<T> handlers;

    private Map<String, T> handlerMap = new HashMap<>();

    @PostConstruct
    private void init() {
        for (T handler : handlers)
            handlerMap.put(handler.getName(), handler);
    }

    public T getHandler(Request<?> req) {
        return handlerMap.get(getRouteKey(req));
    }

    abstract protected String getRouteKey(Request<?> req);
}
