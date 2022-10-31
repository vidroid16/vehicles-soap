package com.example.vehicles.config;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@ApplicationScoped
public class CDIConfig {

//    @Produces
//    @PersistenceContext
//    private EntityManager makeEntityManager(){
//        EntityManagerFactory entityManagerFactory =
//                Persistence.createEntityManagerFactory("spring");
//        return entityManagerFactory.createEntityManager();
//    }

    @Produces
    @PersistenceContext(unitName = "spring")
    private EntityManager entityManager;
}
