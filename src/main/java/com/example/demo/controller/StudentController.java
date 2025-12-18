package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService stdser;

    @PostMapping("/add")
    public Student addStudent(@RequestBody Student st) {
        return stdser.poststudent(st);
    }

    @GetMapping("/all")
    public List<Student> getAll() {
        return stdser.getAllStudents();
    }

    @GetMapping("/{id}")
    public Optional<Student> getById(@PathVariable Long id) {
        return stdser.getById(id);
    }

    @PutMapping("/update/{id}")
    public Student update(@PathVariable Long id, @RequestBody Student st) {
        return stdser.updateData(id, st);
    }
}
