package com.dydata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.orm.jpa.JpaSystemException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dydata.entity.Employee;
import com.dydata.service.IEmployeeService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	IEmployeeService employeeService;

//	@PostMapping("/create")
//	public ResponseEntity<String> createEmployee(@RequestBody Employee employee) {
//		
//		ResponseEntity<String> responseEntity = null;
//		
//		try {
//			employeeService.add(employee);
//			responseEntity = new ResponseEntity<>("Created Successfully", HttpStatus.OK);
//		}
//		catch (HttpMessageNotReadableException e) {
//			
//			responseEntity = new ResponseEntity<>("Bad Request Sent, Send Data in Right Manner", HttpStatus.BAD_REQUEST);
//		}
//		catch (JpaSystemException e) {
//			responseEntity = new ResponseEntity<>("Employee Not Created", HttpStatus.INTERNAL_SERVER_ERROR);
//		}
//		
//		return responseEntity;
//	}
	
	@PostMapping("/create")
	public ResponseEntity<String> createEmployee(@RequestBody @Valid Employee employee) {
		
			employeeService.add(employee);
			return new ResponseEntity<>("Created Successfully", HttpStatus.OK);	
	}
}
