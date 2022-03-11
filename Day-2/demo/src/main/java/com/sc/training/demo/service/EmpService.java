package com.sc.training.demo.service;

import com.sc.training.demo.model.Employee;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class EmpService {

    public List<Employee> getAll(){

        List<Employee> e = new ArrayList();

        for(int i = 0; i < 10; i++){
            e.add(new Employee(i, "John" + i));
        }
        return e;
    }
}
