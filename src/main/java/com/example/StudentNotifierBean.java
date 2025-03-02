package com.example;
import org.springframework.stereotype.Component;

@Component
public class StudentNotifierBean {
    public StudentNotifierBean() {
        System.out.println("StudentNotifierBean initialized");
    }

    public void notifyStudent(int id, String message) {
        System.out.println("Notification for Student " + id + ": " + message);
    }
}