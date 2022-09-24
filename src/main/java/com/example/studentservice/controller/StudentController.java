package com.example.studentservice.controller;

import com.example.studentservice.model.Student;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("student")
public class StudentController {

  @PostMapping
  public Student create(@RequestBody Student student) {
    return student;
  }
}
