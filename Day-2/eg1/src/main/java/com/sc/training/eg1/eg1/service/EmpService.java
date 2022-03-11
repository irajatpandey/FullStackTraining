package com.sc.training.eg1.eg1.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.sc.training.eg1.eg1.model.Emp;

@Service
public class EmpService {
	
	public Set<Emp> getAll(){
		Set<Emp> emp = new HashSet();
		
		for(int i = 0; i < 5; i++) {
			emp.add(new Emp(i, "EmpName" + i));
		}
		return emp;
	}

}
