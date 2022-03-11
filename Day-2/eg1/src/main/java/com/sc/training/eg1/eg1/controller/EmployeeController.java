package com.sc.training.eg1.eg1.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sc.training.eg1.eg1.model.Emp;
import com.sc.training.eg1.eg1.service.EmpService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmpService empService;
	
	@GetMapping("/getallemps")
	public Set<Emp> getAll(){
		return empService.getAll();
	}
	
	
	
}
