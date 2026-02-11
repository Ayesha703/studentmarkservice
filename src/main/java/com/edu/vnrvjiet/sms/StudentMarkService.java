package com.edu.vnrvjiet.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class StudentMarkService {

    @Autowired
    private StudentMarkServiceRepository repo;

    public Student add(Student s) {
        return repo.add(s);
    }

    public Collection<Student> findAll() {
        return repo.findAll();
    }

    public Optional<Student> findById(Integer id) {
        return repo.findById(id);
    }

    public Student update(Student s) {
        return repo.update(s);
    }

    public Student deleteById(Integer id) {
        return repo.deleteById(id);
    }
}
