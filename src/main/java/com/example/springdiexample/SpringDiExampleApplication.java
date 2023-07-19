package com.example.springdiexample;

import com.example.springdiexample.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiExampleApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringDiExampleApplication.class, args);

        MyController controller = context.getBean(MyController.class);
        System.out.println("In main method");
        System.out.println(controller.sayHello());
    }

}
