package com.example;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class StudentLoggerBean {
    public StudentLoggerBean() {
        System.out.println("StudentLoggerBean initialized");
    }

    public void logStudentAction(String action) {
        System.out.println("[Lazy Logger] " + action);
    }
}