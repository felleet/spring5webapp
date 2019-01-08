package com.example.spring5webapp.controllers;

import com.example.spring5webapp.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    String sayHello() {
        return greetingService.sayGreeting();
    }
}
