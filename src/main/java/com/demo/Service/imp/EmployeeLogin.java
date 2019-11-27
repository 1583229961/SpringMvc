package com.demo.Service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Dao.EmployeeMapper;
import com.demo.Model.Employee;
import com.demo.Service.EmployeeService;
@Service
public class EmployeeLogin implements EmployeeService {
	@Autowired
	EmployeeMapper mapper;
	
	@Override
	public Employee Login(Integer id, String password) {
		// TODO Auto-generated method stub
		
		Employee employee=mapper.selectEmployee(id,password);
		return employee;
	}

	
}
