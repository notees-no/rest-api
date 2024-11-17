package com.twitchclone.api.service;

import java.util.List;

import com.twitchclone.api.model.AbstractModels;

public interface Service<T extends AbstractModels> {
    T create(T entity);

    T update(T entity);

    void delete(Long id);

    T findById(Long id);

    List<T> findAll();
}