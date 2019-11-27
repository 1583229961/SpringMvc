package com.demo.Dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.demo.Model.Employee;

@Mapper
public interface EmployeeMapper {
	
Employee selectEmployee(@Param("id")Integer id,@Param("password")String password);
}
