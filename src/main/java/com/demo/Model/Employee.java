package com.demo.Model;

import java.util.List;

import org.apache.ibatis.type.Alias;
import org.springframework.aop.IntroductionAdvisor;

@Alias("Employee")
public class Employee {

	
	private Integer Id;
	private int Age;
	private String Sex;
	private int MinAge;
	private int MaxAge;
	private String Job;
	private String Phone;
	private String Branch;
	private float Salary;
	private String Password;
	public Employee() {
		
		// TODO Auto-generated constructor stub
	}
	public Employee(Integer Id,String Password)
	{
		super();
		this.Id=Id;
		this.Password=Password;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getSex() {
		return Sex;
	}
	public void setSex(String sex) {
		Sex = sex;
	}
	public int getMinAge() {
		return MinAge;
	}
	public void setMinAge(int minAge) {
		MinAge = minAge;
	}
	public int getMaxAge() {
		return MaxAge;
	}
	public void setMaxAge(int maxAge) {
		MaxAge = maxAge;
	}
	public String getJob() {
		return Job;
	}
	public void setJob(String job) {
		Job = job;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String branch) {
		Branch = branch;
	}
	public float getSalary() {
		return Salary;
	}
	public void setSalary(float salary) {
		Salary = salary;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
}