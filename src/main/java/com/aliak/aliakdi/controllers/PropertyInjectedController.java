package com.aliak.aliakdi.controllers;

import com.aliak.aliakdi.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;

   public String getGreeting() {
       return greetingService.sayGreeting();
   }
}
