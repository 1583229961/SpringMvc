package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.demo.Model.Employee;
import com.demo.Service.EmployeeService;
import com.demo.Service.imp.EmployeeLogin;

import ch.qos.logback.core.status.Status;
@Controller
public class EmployeeController {
@Autowired
EmployeeService employeeService;

@RequestMapping(value = "/hello.do")
public String hello(){
    System.out.println("接收到请求 ，Hello");
    return "hi";
}
@RequestMapping(value = "/login.do",method = RequestMethod.GET)
public String login(){
    return "Login";
}

@ResponseBody
@RequestMapping(value = "/login.do",method = RequestMethod.POST)
public Employee login(@RequestBody Employee employee)
{
	
	Employee employee1=employeeService.Login(employee.getId(),employee.getPassword());
	System.out.println(employee1.getPassword());
	return employee1;
	
	
}




}
