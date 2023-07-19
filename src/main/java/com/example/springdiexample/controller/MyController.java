package com.example.springdiexample.controller;

import com.example.springdiexample.service.GreetingService;
import com.example.springdiexample.service.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
