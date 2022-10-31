package com.example.vehicles.repositories.impl;

import com.example.vehicles.models.HelloEntity;
import com.example.vehicles.repositories.HelloRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

import java.util.List;

@ApplicationScoped
@Transactional
public class HelloRepositoryImpl implements HelloRepository {
    @Inject
    private EntityManager em;

    @Override
    @Transactional
    public void create(HelloEntity entity) {
        em.persist(entity);
        int a = 4;
    }
}
