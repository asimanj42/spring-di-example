package com.example.springdiexample.controller;

import com.example.springdiexample.service.GreetingServiceImpl;
import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PropertyInjectedControllerTest {
    @Autowired
    PropertyInjectedController controller;

//    @BeforeEach
//    void setUp() {
//        controller = new PropertyInjectedController();
//        controller.greetingService = new GreetingServiceImpl();
//    }

    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}