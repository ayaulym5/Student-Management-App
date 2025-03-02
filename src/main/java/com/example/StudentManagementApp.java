package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentManagementApp {
    public static void main(String[] args) {
        
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        
        StudentService studentService = context.getBean(StudentService.class);
        studentService.registerStudent(1, "Alice");
        studentService.registerStudent(2, "Mara");
        studentService.registerStudent(3, "Anel");
        studentService.registerStudent(4, "Aida");
        System.out.println("Retrieved: " + studentService.getStudentName(4));

        //Lazy Example
        StudentLoggerBean studentLoggerBean = context.getBean(StudentLoggerBean.class);
        studentLoggerBean.logStudentAction(" Created");
    }
}
