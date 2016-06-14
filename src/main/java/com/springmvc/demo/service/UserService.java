package com.springmvc.demo.service;

import com.springmvc.demo.model.EmployeeVO;
import com.springmvc.demo.model.User;

import java.util.List;

public interface UserService
{
	public List<EmployeeVO> getAllEmployees();

	public List<EmployeeVO> getAllEmployeesByPage(long pageNo,long count);

	public EmployeeVO queryEmployeeVO(long employeeId);

	User findByUsername(String username);
}
