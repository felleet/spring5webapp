package com.example.spring5webapp.controllers;

import com.example.spring5webapp.services.GreetingServiceImpl;

public class SetterInjectedController {

    private GreetingServiceImpl greetingService;

    public void setGreetingService(GreetingServiceImpl greetingService) {
        this.greetingService = greetingService;
    }

    String sayHello() {
        return greetingService.sayGreeting();
    }
}
