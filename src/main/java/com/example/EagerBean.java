package com.example;

import org.springframework.stereotype.Component;

@Component
public class EagerBean {
    public EagerBean() {
        System.out.println("com.example.EagerBean initialized");
    }
}
