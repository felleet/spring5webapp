package com.example.spring5webapp.controllers;

import com.example.spring5webapp.services.GreetingService;

public class ContructorInjectedController {

    private GreetingService greetingService;

    public ContructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    String sayHello() {
        return greetingService.sayGreeting();
    }
}
