package com.example.springdiexample.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile({"AZE"," default"})
@Service("i18NService")
public class AzerbaijaniGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Salam Dünya";
    }
}
