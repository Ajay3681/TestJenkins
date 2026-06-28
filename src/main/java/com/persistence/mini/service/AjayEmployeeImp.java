package com.persistence.mini.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class AjayEmployeeImp implements  Employee{
    @Override
    public double getSalary() {
        return 100;
    }

    @Override
    public String getEmployeeName() {
        return "Ajay";
    }
}
