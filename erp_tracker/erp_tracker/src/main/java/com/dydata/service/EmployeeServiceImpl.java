package com.dydata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dydata.entity.Employee;
import com.dydata.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public Employee add(Employee employee) {
		
		return employeeRepository.save(employee);

	}

}
