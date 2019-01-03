package com.alexkoveckiy.strategy.server.authorization.impl.handler;

import com.alexkoveckiy.strategy.server.authorization.api.handler.AuthorizationRequestHandler;
import com.alexkoveckiy.strategy.server.authorization.api.message.AuthorizationResponseData;
import com.alexkoveckiy.strategy.server.authorization.api.message.RegisterRequestData;
import com.alexkoveckiy.strategy.server.dao.entity.ProfileEntity;
import com.alexkoveckiy.strategy.server.dao.entity.UserEntity;
import com.alexkoveckiy.strategy.server.dao.service.ProfileService;
import com.alexkoveckiy.strategy.server.dao.service.UserService;
import com.alexkoveckiy.strategy.server.protocol.Request;
import com.alexkoveckiy.strategy.server.protocol.Response;
import com.alexkoveckiy.strategy.server.protocol.ResponseFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.alexkoveckiy.strategy.server.protocol.ResponseFactory.Status.NOT_ACCEPTABLE;

/**
 * @author Alexey Koveckiy on 10.04.2017.
 */
@Component
public class RegisterRequestHandler extends AuthorizationRequestHandler<RegisterRequestData, AuthorizationResponseData> {

    @Autowired
    private UserService userService;

    @Autowired
    private ProfileService profileService;

    @Override
    public String getName() {
        return "register";
    }

    @Override
    protected Response<AuthorizationResponseData> process(Request<RegisterRequestData> req) throws Exception {
        if (userService.findByLogin(req.getData().getLogin()) != null)
            return ResponseFactory.createResponse(req, NOT_ACCEPTABLE, "Login is already taken!");

        if (req.getData().getLogin().trim().length() < 6)
            return ResponseFactory.createResponse(req, NOT_ACCEPTABLE, "Login should not be shorter than 6 symbols, and should not start or end with spaces");

        if (profileService.findByNickName(req.getData().getNickName()) != null)
            return ResponseFactory.createResponse(req, NOT_ACCEPTABLE, "Nickname is already taken!");

        if (req.getData().getLogin().trim().length() < 6)
            return ResponseFactory.createResponse(req, NOT_ACCEPTABLE, "Nickname should not be shorter than 6 symbols, and should not start or end with spaces");

        if (!isPasswordOk(req.getData().getPassword()))
            return ResponseFactory.createResponse(req, NOT_ACCEPTABLE, "Password should not be shorter than 6 symbols.");

        ProfileEntity profileEntity = profileService.save(new ProfileEntity(req.getData().getNickName()));
        UserEntity userEntity = userService.save(new UserEntity(profileEntity.getId(), req.getData().getLogin(), req.getData().getPassword()));

        return ResponseFactory.createResponse(req, new AuthorizationResponseData(userEntity.getId()));
    }

    private boolean isPasswordOk(String password) {
        return password.length() > 5;
    }
}
