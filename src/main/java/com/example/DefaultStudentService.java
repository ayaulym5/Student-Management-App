package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class DefaultStudentService implements StudentService {
    private final StudentRepository repository;

    @Autowired
    public DefaultStudentService(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public void registerStudent(int id, String name) {
        repository.addStudent(id, name);
        System.out.println("Student registered: " + name);
    }

    @Override
    public String getStudentName(int id) {
        return repository.getStudent(id);
    }
}
