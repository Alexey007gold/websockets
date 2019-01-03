package com.alexkoveckiy.strategy.server.dao.entity;

import com.alexkoveckiy.strategy.server.dao.api.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * @author Alexey Koveckiy on 07.05.2017.
 */
@Entity
public class StarEntity extends BaseEntity {

    @Column(name = "world_id")
    private String worldId;
    @Column(name = "name")
    private String name;
    @Column(name = "x")
    private Integer x;
    @Column(name = "y")
    private Integer y;

    public StarEntity() {
    }

    public StarEntity(String worldId, String name, Integer x, Integer y) {
        this.worldId = worldId;
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public String getWorldId() {
        return worldId;
    }

    public String getName() {
        return name;
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }
}
