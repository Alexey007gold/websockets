package com.alexkoveckiy.strategy.server.dao.api;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Base entity for database containing auto-generated id column
 *
 * Created by Alexey on 08.04.2017.
 */
@MappedSuperclass
public class BaseEntity {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    private String id;

    public String getId() {
        return id;
    }
}
