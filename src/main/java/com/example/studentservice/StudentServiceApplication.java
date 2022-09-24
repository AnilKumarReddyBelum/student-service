package com.example.studentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class StudentServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(StudentServiceApplication.class, args);
  }

  @GetMapping
  public String hello() {
    return "Hello World!";
  }
}
