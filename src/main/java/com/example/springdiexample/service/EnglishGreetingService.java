package com.example.springdiexample.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ENG")
@Service("i18NService")
public class EnglishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello world";
    }
}
