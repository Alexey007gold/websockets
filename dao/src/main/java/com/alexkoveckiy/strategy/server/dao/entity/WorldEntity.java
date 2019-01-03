package com.alexkoveckiy.strategy.server.dao.entity;

import com.alexkoveckiy.strategy.server.dao.api.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Alexey Koveckiy on 07.05.2017.
 */
@Entity
@Table(name = "world")
public class WorldEntity extends BaseEntity {

    @Column(name = "name")
    private String name;
    @Column(name = "speed")
    private Integer speed;

    public WorldEntity() {
    }

    public WorldEntity(String name, Integer speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public Integer getSpeed() {
        return speed;
    }
}
