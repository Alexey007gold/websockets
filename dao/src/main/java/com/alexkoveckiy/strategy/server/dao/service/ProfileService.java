package com.alexkoveckiy.strategy.server.dao.service;

import com.alexkoveckiy.strategy.server.dao.api.BaseService;
import com.alexkoveckiy.strategy.server.dao.entity.ProfileEntity;
import com.alexkoveckiy.strategy.server.dao.repository.ProfileRepository;
import org.springframework.stereotype.Component;

/**
 * @author Alexey Koveckiy on 09.04.2017.
 */
@Component
public class ProfileService extends BaseService<ProfileEntity, ProfileRepository> {

    public ProfileEntity findByNickName(String nickname) {
        return repository.findByNickName(nickname);
    }
}
