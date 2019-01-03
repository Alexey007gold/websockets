package com.alexkoveckiy.strategy.server.dao.service;

import com.alexkoveckiy.strategy.server.dao.api.BaseService;
import com.alexkoveckiy.strategy.server.dao.entity.WorldEntity;
import com.alexkoveckiy.strategy.server.dao.repository.WorldRepository;
import org.springframework.stereotype.Component;

/**
 * @author Alexey Koveckiy on 07.05.2017.
 */
@Component
public class WorldService extends BaseService<WorldEntity, WorldRepository> {
}
