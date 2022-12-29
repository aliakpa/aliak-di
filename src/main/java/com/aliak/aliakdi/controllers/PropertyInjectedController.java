package com.aliak.aliakdi.controllers;

import com.aliak.aliakdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Autowired
    public GreetingService greetingService;

   public String getGreeting() {
       return greetingService.sayGreeting();
   }
}
