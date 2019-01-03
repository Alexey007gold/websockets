package com.alexkoveckiy.strategy.server.dao.entity;

import com.alexkoveckiy.strategy.server.dao.api.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Alexey on 09.04.2017.
 * User entity for data base
 */
@Entity
@Table(name = "user")
public class UserEntity extends BaseEntity {

    @Column(name = "profile_id")
    private String profileId;
    @Column(name = "login")
    private String login;
    @Column(name = "password")
    private String passWord;

    public UserEntity() {
    }

    public UserEntity(String profileId, String login, String passWord) {
        this.profileId = profileId;
        this.login = login;
        this.passWord = passWord;
    }

    public String getProfileId() {
        return profileId;
    }

    public String getLogin() {
        return login;
    }

    public String getPassWord() {
        return passWord;
    }
}
