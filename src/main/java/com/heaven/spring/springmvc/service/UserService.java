package com.heaven.spring.springmvc.service;

import com.heaven.spring.springmvc.model.EmployeeVO;
import com.heaven.spring.springmvc.model.User;

import java.util.List;

public interface UserService
{
	public List<EmployeeVO> getAllEmployees();

	public List<EmployeeVO> getAllEmployeesByPage(long pageNo,long count);

	public EmployeeVO queryEmployeeVO(long employeeId);

	User findByUsername(String username);
}
