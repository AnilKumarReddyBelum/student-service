package com.example.studentservice.controller;

import com.example.studentservice.model.Employee;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("emp")
public class EmpController {

  @PostMapping
  public Employee create(@RequestBody Employee employee) {
    return employee;
  }
}
