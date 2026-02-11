package com.edu.vnrvjiet.sms;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class StudentMarkServiceRepository {

    private final Map<Integer, Student> db = new HashMap<>();

    public Student add(Student s) {
        db.put(s.getId(), s);
        return s;
    }

    public Collection<Student> findAll() {
        return db.values();
    }

    public Optional<Student> findById(Integer id) {
        return Optional.ofNullable(db.get(id));
    }

    public Student update(Student s) {
        db.put(s.getId(), s);
        return s;
    }

    public Student deleteById(Integer id) {
        return db.remove(id);
    }
}
