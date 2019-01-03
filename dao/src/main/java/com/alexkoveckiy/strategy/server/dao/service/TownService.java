package com.alexkoveckiy.strategy.server.dao.service;

import com.alexkoveckiy.strategy.server.dao.api.BaseService;
import com.alexkoveckiy.strategy.server.dao.entity.TownEntity;
import com.alexkoveckiy.strategy.server.dao.repository.TownRepository;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Alexey Koveckiy on 07.05.2017.
 */
@Component
public class TownService extends BaseService<TownEntity, TownRepository> {

    public List<TownEntity> findByWorldIdAndOwnerId(String worldId, String ownerId) {
        return repository.findByWorldIdAndOwnerId(worldId, ownerId);
    }
}
