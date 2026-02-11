package com.edu.vnrvjiet.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/sms") // base URL for all endpoints
public class StudentMarkServiceController {

    @Autowired
    private StudentMarkService service;

    // Add a new student
    @PostMapping("/addOne")
    public ResponseEntity<Student> addOne(@RequestBody Student student) {
        Student created = service.add(student);
        return ResponseEntity.ok(created);
    }

    // Update existing student
    @PutMapping("/updateOne")
    public ResponseEntity<Student> updateOne(@RequestBody Student student) {
        Student updated = service.update(student);
        return ResponseEntity.ok(updated);
    }

    // Get all students
    @GetMapping("/findAll")
    public ResponseEntity<Collection<Student>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    // Get student by ID
    @GetMapping("/findById/{id}")
    public ResponseEntity<Student> findById(@PathVariable Integer id) {
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Delete student by ID
    @DeleteMapping("/deleteById/{id}")
    public ResponseEntity<Student> deleteById(@PathVariable Integer id) {
        Student removed = service.deleteById(id);
        if (removed == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(removed);
    }
}
