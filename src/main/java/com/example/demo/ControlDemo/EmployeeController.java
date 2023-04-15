package com.example.demo.ControlDemo;

import java.util.List;

import org.springframework.http.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.EmployeeResult;
import com.example.demo.EmployeeService;
@RestController
@RequestMapping(value = "/emp", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class EmployeeController {
    private final EmployeeService employeeService;
    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping
    public ResponseEntity<List<EmployeeResult>> listAll() {
        return ResponseEntity.ok(employeeService.findEmployee());
    }
}