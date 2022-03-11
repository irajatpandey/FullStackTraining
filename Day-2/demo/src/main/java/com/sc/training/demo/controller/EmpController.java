package com.sc.training.demo.controller;

import com.sc.training.demo.model.Employee;
import com.sc.training.demo.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpController {

    @Autowired
    EmpService empService;

    @GetMapping("/emp")
    public List<Employee> getAll(){
        return empService.getAll();
    }

}
