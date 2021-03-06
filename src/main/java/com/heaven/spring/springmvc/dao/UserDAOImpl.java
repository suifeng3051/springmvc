package com.heaven.spring.springmvc.dao;

import com.heaven.spring.springmvc.model.EmployeeVO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {

	public List<EmployeeVO> getAllEmployees()
	{
		List<EmployeeVO> employees = new ArrayList<EmployeeVO>();
		
		EmployeeVO vo1 = new EmployeeVO();
		vo1.setId(1);
		vo1.setFirstName("Lokesh");
		vo1.setLastName("Gupta");
		employees.add(vo1);
		
		EmployeeVO vo2 = new EmployeeVO();
		vo2.setId(2);
		vo2.setFirstName("Raj");
		vo2.setLastName("Kishore");
		employees.add(vo2);
		
		return employees;
	}

	public EmployeeVO selectEmployeeVO(long employeeId) {
		EmployeeVO vo = new EmployeeVO();
		vo.setId(1);
		vo.setFirstName("Lokesh");
		vo.setLastName("Gupta");
		return vo;
	}
}