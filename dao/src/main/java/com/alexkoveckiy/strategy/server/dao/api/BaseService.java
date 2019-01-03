package com.alexkoveckiy.strategy.server.dao.api;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Alexe on 08.04.2017.
 */
public abstract class BaseService<E extends BaseEntity, R extends BaseRepository<E>> {

    @Autowired
    protected R repository;

    public long count() {
        return repository.count();
    }

    public E save(E entity) {
        return repository.save(entity);
    }

    public Iterable<E> save(Iterable<E> entities) {
        return repository.save(entities);
    }

    public void delete(String id) {
        repository.delete(id);
    }

    public void delete(E entity) {
        repository.delete(entity);
    }

    public void delete(Iterable<E> entities) {
        repository.delete(entities);
    }

    public void deleteAll() {
        repository.deleteAll();
    }

    public Iterable<E> findAll() {
        return repository.findAll();
    }

    public Iterable<E> findAll(Iterable<String> ids) {
        return repository.findAll(ids);
    }

    public E findOne(String id) {
        return repository.findOne(id);
    }

    public boolean exists(String id) {
        return repository.exists(id);
    }
}
