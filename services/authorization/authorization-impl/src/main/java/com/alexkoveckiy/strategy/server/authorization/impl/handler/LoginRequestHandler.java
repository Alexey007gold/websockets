package com.alexkoveckiy.strategy.server.authorization.impl.handler;

import com.alexkoveckiy.strategy.server.authorization.api.handler.AuthorizationRequestHandler;
import com.alexkoveckiy.strategy.server.authorization.api.message.AuthorizationResponseData;
import com.alexkoveckiy.strategy.server.authorization.api.message.LoginRequestData;
import com.alexkoveckiy.strategy.server.dao.entity.UserEntity;
import com.alexkoveckiy.strategy.server.dao.service.UserService;
import com.alexkoveckiy.strategy.server.protocol.Request;
import com.alexkoveckiy.strategy.server.protocol.Response;
import com.alexkoveckiy.strategy.server.protocol.ResponseFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.alexkoveckiy.strategy.server.protocol.ResponseFactory.Status.NOT_FOUND;

/**
 * @author Alexey Koveckiy on 10.04.2017.
 */
@Component
public class LoginRequestHandler extends AuthorizationRequestHandler<LoginRequestData, AuthorizationResponseData> {

    @Autowired
    private UserService userService;

    @Override
    public String getName() {
        return "login";
    }

    @Override
    protected Response<AuthorizationResponseData> process(Request<LoginRequestData> req) throws Exception {

        UserEntity userEntity = userService.findByLoginAndPassWord(req.getData().getLogin(), req.getData().getPassword());

        if (userEntity == null)
            return ResponseFactory.createResponse(req, NOT_FOUND, "Incorrect login and/or password!");

        return ResponseFactory.createResponse(req, new AuthorizationResponseData(userEntity.getId()));
    }
}
