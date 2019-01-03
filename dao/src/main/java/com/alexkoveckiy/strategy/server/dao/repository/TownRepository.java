package com.alexkoveckiy.strategy.server.dao.repository;

import com.alexkoveckiy.strategy.server.dao.api.BaseRepository;
import com.alexkoveckiy.strategy.server.dao.entity.TownEntity;

import java.util.List;

/**
 * @author Alexey Koveckiy on 07.05.2017.
 */
public interface TownRepository extends BaseRepository<TownEntity> {
    List<TownEntity> findByWorldIdAndOwnerId(String worldId, String ownerId);
}
