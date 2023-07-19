package com.example.springdiexample.controller;

import com.example.springdiexample.service.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class SetterInjectedControllerTest {
    @Autowired
    SetterInjectedController controller;

//    @BeforeEach
//    void setUp() {
//        controller = new SetterInjectedController();
////        controller.setGreetingService(new GreetingServiceImpl()); Null pointer Exception
//    }

    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}