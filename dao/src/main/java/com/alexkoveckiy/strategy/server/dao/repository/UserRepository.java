package com.alexkoveckiy.strategy.server.dao.repository;

import com.alexkoveckiy.strategy.server.dao.api.BaseRepository;
import com.alexkoveckiy.strategy.server.dao.entity.UserEntity;

/**
 * Repository for {@link UserEntity} class
 *
 * @author Alexey on 09.04.2017.
 */
public interface UserRepository extends BaseRepository<UserEntity> {
    UserEntity findByLogin(String login);
    UserEntity findByLoginAndPassWord(String login, String password);
}
