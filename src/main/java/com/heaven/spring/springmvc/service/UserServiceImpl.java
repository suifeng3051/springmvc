package com.heaven.spring.springmvc.service;

import com.heaven.spring.springmvc.dao.UserDAO;
import com.heaven.spring.springmvc.model.EmployeeVO;
import com.heaven.spring.springmvc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDAO dao;
	
	public List<EmployeeVO> getAllEmployees()
	{
		return dao.getAllEmployees();
	}

	public List<EmployeeVO> getAllEmployeesByPage(long pageNo, long count) {
		return dao.getAllEmployees();
	}

	public EmployeeVO queryEmployeeVO(long employeeId) {

		return dao.selectEmployeeVO(employeeId);
	}

	public User findByUsername(String username) {
		User user=new User();
		user.setName("wang");
		user.setAccountNo("1234");
		return user;
	}
}
