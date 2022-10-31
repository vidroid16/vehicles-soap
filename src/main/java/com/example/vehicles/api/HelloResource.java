package com.example.vehicles.api;

import com.example.vehicles.models.Enums.VehicleType;
import com.example.vehicles.models.HelloEntity;
import com.example.vehicles.repositories.HelloRepository;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@ApplicationScoped
@Path("/hello")
public class HelloResource {
    @Inject
    private HelloRepository helloRepository;

    @GET
    @Produces("text/plain")
    @Consumes(MediaType.TEXT_PLAIN)
    public String hello() {
        HelloEntity helloEntity = new HelloEntity();
        helloEntity.setName("Random"+(int)(Math.random()*100));
        helloRepository.create(helloEntity);
        return VehicleType.valueOf("HELICOPTER").toString();
    }
}