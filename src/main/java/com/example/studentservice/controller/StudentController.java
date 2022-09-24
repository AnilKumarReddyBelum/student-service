package com.example.studentservice.controller;

import com.example.studentservice.model.Student;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("student")
public class StudentController {

  @PostMapping
  public Student create(@RequestBody Student student) {
    return student;
  }

  @PutMapping
  public Student update(@RequestBody Student student) {
    return student;
  }
}
