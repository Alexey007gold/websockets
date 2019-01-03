package com.alexkoveckiy.strategy.server.dao.entity;

import com.alexkoveckiy.strategy.server.dao.api.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * @author Alexey Koveckiy on 07.05.2017.
 */
@Entity
public class PlanetEntity extends BaseEntity {

    @Column(name = "world_id")
    private String worldId;
    @Column(name = "star_id")
    private String starId;
    @Column(name = "name")
    private String name;
    @Column(name = "x")
    private String x;
    @Column(name = "y")
    private String y;
    @Column(name = "width")
    private String width;
    @Column(name = "height")
    private String height;

    public PlanetEntity() {
    }

    public PlanetEntity(String worldId, String starId, String name, String x, String y, String width, String height) {
        this.worldId = worldId;
        this.starId = starId;
        this.name = name;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public String getWorldId() {
        return worldId;
    }

    public String getStarId() {
        return starId;
    }

    public String getName() {
        return name;
    }

    public String getX() {
        return x;
    }

    public String getY() {
        return y;
    }

    public String getWidth() {
        return width;
    }

    public String getHeight() {
        return height;
    }
}
