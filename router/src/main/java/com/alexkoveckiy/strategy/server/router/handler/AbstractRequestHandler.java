package com.alexkoveckiy.strategy.server.router.handler;

import com.alexkoveckiy.strategy.server.datamapper.DataMapper;
import com.alexkoveckiy.strategy.server.protocol.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.ParameterizedType;

import static com.alexkoveckiy.strategy.server.protocol.ResponseFactory.Status.BAD_REQUEST;

/**
 * @author Alexey Koveckiy on 09.04.2017.
 */
public abstract class AbstractRequestHandler<T extends RequestData, R extends ResponseData> implements Handler {

    @Autowired
    private DataMapper dataMapper;

    private final Class<T> clazz = initClassField();

    @Override
    public Response<?> handle(Request<?> req) {
        Request<T> request = new Request<>();
        request.setHeader(req.getHeader());
        request.setData(dataMapper.convert(req.getData(), clazz));

        try {
            return process(request);
        } catch (Exception e) {
            return ResponseFactory.createResponse(request, ResponseFactory.Status.INTERNAL_SERVER_ERROR, e.getMessage());
        }
    }

    protected abstract Response<R> process(Request<T> req) throws Exception;

    @SuppressWarnings("unchecked")
    private Class<T> initClassField() {
        return (Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }
}
