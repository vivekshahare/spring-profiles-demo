package com.practice.model;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class Employee {

    public Employee() {
        System.out.println("Employee Bean is created");
    }
}
