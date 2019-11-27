package com.demo.Service;

import org.springframework.stereotype.Service;

import com.demo.Model.Employee;
@Service
public interface EmployeeService {
Employee Login(Integer id,String password);
}
