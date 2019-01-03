package com.alexkoveckiy.strategy.server.game.api.dto;

/**
 * @author Alexey Koveckiy on 07.05.2017.
 */
public class WorldDTO {

    private String name;

    private Integer speed;

    public WorldDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }
}
