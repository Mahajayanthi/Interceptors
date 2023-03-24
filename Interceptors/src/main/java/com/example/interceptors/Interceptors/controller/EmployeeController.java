package com.example.interceptors.Interceptors.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping("/welcome")
    public String hello()
    {
        return "Welcome to MBFS";
    }
}
