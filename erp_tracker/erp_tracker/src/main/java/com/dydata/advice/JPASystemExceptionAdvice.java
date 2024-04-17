package com.dydata.advice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.orm.jpa.JpaSystemException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.dydata.exception.RoleIdException;
import com.dydata.exception.RolesNotAvailableException;

@RestControllerAdvice//This is advice created
public class JPASystemExceptionAdvice {
	
	Logger logger = LoggerFactory.getLogger(JPASystemExceptionAdvice.class);
	
	@ExceptionHandler(JpaSystemException.class)
	public ResponseEntity<String> jpaExceptionAdvice(JpaSystemException ex) {
		
		logger.error("Exception has occured "+ex.getMessage());
		
		ResponseEntity<String> responseEntity = new ResponseEntity<>("Something Went Wrong", HttpStatus.BAD_REQUEST);
		
		return responseEntity;
	}
	
	@ExceptionHandler(RolesNotAvailableException.class)
	public ResponseEntity<String> noRoleAvailableExceptionAdvice(RolesNotAvailableException ex) {
		
		logger.error("Exception has occured "+ex.getMessage());
		
		ResponseEntity<String> responseEntity = new ResponseEntity<>("No Roles Available", HttpStatus.BAD_REQUEST);
		
		return responseEntity;
	}
	
	@ExceptionHandler(RoleIdException.class)
	public ResponseEntity<String> noRoleAvailableExceptionAdvice(RoleIdException ex) {
		
		logger.error("Exception has occured "+ex.getMessage());
		
		ResponseEntity<String> responseEntity = new ResponseEntity<>("RoleId is not Correct", HttpStatus.BAD_REQUEST);
		
		return responseEntity;
	}
	
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> formExceptionAdvice(MethodArgumentNotValidException ex) {
		
		System.out.println(ex.getBindingResult().getAllErrors());
		
		logger.error("Exception has occured "+ex.getMessage());
		
		Map<String, String> errorMap = new HashMap<>();
		
		for(ObjectError objectError : ex.getBindingResult().getAllErrors()) {
			
			errorMap.put(objectError.getCode(), objectError.getDefaultMessage());
		}
		
		return errorMap;
	
	}
	
	@ExceptionHandler(HttpMessageNotReadableException.class)
	public ResponseEntity<String> mappingEntityWithDataException(HttpMessageNotReadableException ex) {
		
		logger.error("Exception has occured "+ex.getMessage());
		
		ResponseEntity<String> responseEntity = new ResponseEntity<>("Bad Request Sent, Send Data in Right Manner", HttpStatus.BAD_REQUEST);
		
		return responseEntity;
	}
	
	

}
