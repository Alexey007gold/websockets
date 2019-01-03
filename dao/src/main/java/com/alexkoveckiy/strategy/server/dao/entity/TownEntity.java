package com.alexkoveckiy.strategy.server.dao.entity;

import com.alexkoveckiy.strategy.server.dao.api.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * @author Alexey Koveckiy on 07.05.2017.
 */
@Entity
public class TownEntity extends BaseEntity {

    @Column(name = "world_id")
    private String worldId;
    @Column(name = "star_id")
    private String starId;
    @Column(name = "planet_id")
    private String planetId;
    @Column(name = "owner_id")
    private String ownerId;
    @Column(name = "name")
    private String name;
    @Column(name = "x")
    private String x;
    @Column(name = "y")
    private String y;

    public TownEntity() {
    }

    public TownEntity(String worldId, String starId, String planetId, String ownerId, String name, String x, String y) {
        this.worldId = worldId;
        this.starId = starId;
        this.planetId = planetId;
        this.ownerId = ownerId;
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public String getWorldId() {
        return worldId;
    }

    public String getStarId() {
        return starId;
    }

    public String getPlanetId() {
        return planetId;
    }

    public String getOwnerId() {
        return ownerId;
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
}
