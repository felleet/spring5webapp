package com.example.spring5webapp.services;


import com.example.spring5webapp.repositories.GreetingRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

public class PrimarySpanishGreetingService implements GreetingService{

    private final GreetingRepository repository;

    public PrimarySpanishGreetingService(GreetingRepository repository) {
        this.repository = repository;
    }

    @Override
    public String sayGreeting() {
        return repository.getSpanishGreeting();
    }
}
