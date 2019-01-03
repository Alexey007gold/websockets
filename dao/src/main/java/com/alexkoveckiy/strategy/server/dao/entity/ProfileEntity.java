package com.alexkoveckiy.strategy.server.dao.entity;

import com.alexkoveckiy.strategy.server.dao.api.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Alexey on 09.04.2017.
 * Profile entity for data base
 */
@Entity
@Table(name = "profile")
public class ProfileEntity extends BaseEntity {

    @Column(name = "nick_name")
    private String nickName;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "birth_date")
    private Long birthDate;
    @Column(name = "description")
    private String description;

    public ProfileEntity() {
    }

    public ProfileEntity(String nickName) {
        this.nickName = nickName;
    }

    public ProfileEntity(String nickName, String name, String surname, Long birthDate, String description) {
        this.nickName = nickName;
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.description = description;
    }

    public String getNickName() {
        return nickName;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Long getBirthDate() {
        return birthDate;
    }

    public String getDescription() {
        return description;
    }
}
