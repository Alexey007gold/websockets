package com.alexkoveckiy.strategy.server.dao.service;

import com.alexkoveckiy.strategy.server.dao.api.BaseService;
import com.alexkoveckiy.strategy.server.dao.entity.UserEntity;
import com.alexkoveckiy.strategy.server.dao.repository.UserRepository;
import org.springframework.stereotype.Component;

/**
 * @author Alexey Koveckiy on 09.04.2017.
 */
@Component
public class UserService extends BaseService<UserEntity, UserRepository> {

    public UserEntity findByLogin(String login) {
        return repository.findByLogin(login);
    }

    public UserEntity findByLoginAndPassWord(String login, String password) {
        return repository.findByLoginAndPassWord(login, password)
;    }
}
