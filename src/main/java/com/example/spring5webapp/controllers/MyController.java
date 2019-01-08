package com.example.spring5webapp.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String hello() {
        System.out.println("Hello");
        return "hi!";
    }
}
