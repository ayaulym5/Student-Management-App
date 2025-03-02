package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service
@Qualifier("Alternative")
public class AlternativeStudentService implements StudentService {
    private final StudentRepository repository;

    @Autowired
    public AlternativeStudentService(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public void registerStudent(int id, String name) {
        repository.addStudent(id, name);
        System.out.println("AlternativeService: Student registered - " + name);
    }

    @Override
    public String getStudentName(int id) {
        return repository.getStudent(id);
    }
}
