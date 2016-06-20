package com.heaven.spring.springmvc.dao;

import com.heaven.spring.springmvc.model.EmployeeVO;

import java.util.List;

public interface UserDAO
{
	public List<EmployeeVO> getAllEmployees();

	EmployeeVO selectEmployeeVO(long employeeId);
}