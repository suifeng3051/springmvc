package com.springmvc.demo.dao;

import com.springmvc.demo.model.EmployeeVO;

import java.util.List;

public interface UserDAO
{
	public List<EmployeeVO> getAllEmployees();

	EmployeeVO selectEmployeeVO(long employeeId);
}