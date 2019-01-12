package com.example.spring5webapp.services;

import com.example.spring5webapp.repositories.GreetingRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

public class PrimaryGermanGreetingService implements GreetingService {


    private final GreetingRepository repository;

    public PrimaryGermanGreetingService(GreetingRepository repository) {
        this.repository = repository;
    }

    @Override
    public String sayGreeting() {
        return repository.getGermanGreeting();
    }
}
