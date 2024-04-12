package com.dydata.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dydata.entity.Role;
import com.dydata.exception.RolesNotAvailableException;
import com.dydata.service.IRoleService;

import jakarta.validation.Valid;

@RestController
@CrossOrigin
public class RoleController {
	
	Logger logger = LoggerFactory.getLogger(RoleController.class);
	
	@Autowired
	IRoleService roleService;
	
//	@PostMapping("/createRole")
//	public ResponseEntity<String> createRole(@RequestBody Role role) {
//		
//		logger.info("inside createRole");
//		
//		ResponseEntity<String> responseEntity = null;
//		
//		if(role.getRoleId() == null || role.getRoleId() == "") {
//			
//			throw new RoleIdException("RoleId must not be null");
//		}
//		
////		try {
////			String status = roleService.createRole(role);
////			responseEntity =  new ResponseEntity<>(status, HttpStatus.OK);
////		}
////		catch (JpaSystemException e) {
////			logger.error("Exception is occured....");
////			e.printStackTrace();
////			responseEntity = new ResponseEntity<>("Something Went Wrong", HttpStatus.BAD_REQUEST);
////		}	
////		return responseEntity;
//		
//		
//		
//		
//			String status = roleService.createRole(role);
//			return responseEntity =  new ResponseEntity<>(status, HttpStatus.OK);
//		
//		
//	}
	
	@PostMapping("/createRole")
	public ResponseEntity<String> createRole(@RequestBody @Valid Role role) {
		
		logger.info("inside createRole");
		
		ResponseEntity<String> responseEntity = null;
		
			String status = roleService.createRole(role);
			return responseEntity =  new ResponseEntity<>(status, HttpStatus.OK);
		
	}
	
	
	
	
//	@GetMapping("/allRoles")
//	public ResponseEntity<List<Role>> getAllRoles() {
//		
//		logger.info("insdie getAllRoles()");
//		
//		List<Role> roles = roleService.getAllRoles();
//		
//		return new ResponseEntity<>(roles, HttpStatus.OK);
//		
//	}
	
	@GetMapping("/allRoles")
	public ResponseEntity<List<Role>> getAllRoles() {
		
		logger.info("insdie getAllRoles()");
		
		List<Role> roles = roleService.getAllRoles();
		
		if(roles.isEmpty()) {
			
			throw new RolesNotAvailableException("Since No Roles Available in Database");
		}
		
		return new ResponseEntity<>(roles, HttpStatus.OK);
		
	}
	
	@DeleteMapping("delete/{roleId}")
	public ResponseEntity<String> deleteRole(@PathVariable String roleId) {
		
		roleService.deleteRole(roleId);
		
		ResponseEntity<String> responseEntity = null;
		
		try {
			responseEntity = new ResponseEntity<>("Role has Been Deleted Successfully", HttpStatus.OK);
		}
		catch (Exception e) {
			e.printStackTrace();
			responseEntity = new ResponseEntity<>("Something went wrong", HttpStatus.BAD_REQUEST);
		}
		
		return responseEntity;
		
	}
	
}
