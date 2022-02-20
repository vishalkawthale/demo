package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "employee")
public class EmployeeController {

    @GetMapping(value = "/add")
    public String addEmployee(){
        return "this is employee add method controller";
    }

    @GetMapping(value = "/get")
    public String getEmployee(){
        return "this getEmployee controller method";
    }

    @GetMapping(value = "/update")
    public String updateEmployee(){
        return "this is update employee controller method";
    }
}
