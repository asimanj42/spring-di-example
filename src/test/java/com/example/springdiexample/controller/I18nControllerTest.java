package com.example.springdiexample.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("AZE")
@SpringBootTest
class I18nControllerTest {


    @Autowired
    I18nController controller;

    @Test
    void sayHello(){
        System.out.println(controller.sayHello());
    }
}