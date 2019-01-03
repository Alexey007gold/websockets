package com.alexkoveckiy.strategy.server.dao.repository;

import com.alexkoveckiy.strategy.server.dao.api.BaseRepository;
import com.alexkoveckiy.strategy.server.dao.entity.ProfileEntity;

/**
 * Repository for {@link ProfileEntity} class
 *
 * @author Alexey Koveckiy on 09.04.2017.
 */
public interface ProfileRepository extends BaseRepository<ProfileEntity> {
    ProfileEntity findByNickName(String nickname);
}
