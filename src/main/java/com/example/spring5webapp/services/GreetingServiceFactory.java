package com.example.spring5webapp.services;

import com.example.spring5webapp.repositories.GreetingRepository;

public class GreetingServiceFactory {

    private GreetingRepository repository;

    public GreetingServiceFactory(GreetingRepository repository) {
        this.repository = repository;
    }

    public GreetingService createGreetService(String lang) {
        switch (lang) {
            case "en":
                return new PrimaryGreetingService(repository);
            case "de":
                return new PrimaryGermanGreetingService(repository);
            case "es":
                return new PrimarySpanishGreetingService(repository);
            default:
                return new PrimaryGreetingService(repository);
        }
    }
}
