package com.aliak.aliakdi.controllers;

import com.aliak.aliakdi.services.GreetingService;

public class ConstructorInjectedController {
    private final GreetingService greetingService;


    public ConstructorInjectedController (GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
