package com.dydata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dydata.entity.Role;
import com.dydata.service.IRoleService;

@RestController
@CrossOrigin
public class RoleController {
	
	@Autowired
	IRoleService roleService;
	
	@PostMapping("/createRole")
	public ResponseEntity<String> createRole(@RequestBody Role role) {
		
		ResponseEntity<String> responseEntity = null;
		
		try {
			String status = roleService.createRole(role);
			responseEntity =  new ResponseEntity<>(status, HttpStatus.OK);
		}
		catch (Exception e) {
			System.out.println("insdie catch");
			e.printStackTrace();
			responseEntity = new ResponseEntity<>("Something Went Wrong", HttpStatus.BAD_REQUEST);
		}	
		return responseEntity;
	}
	
	@GetMapping("/allRoles")
	public ResponseEntity<List<Role>> getAllRoles() {
		
		List<Role> roles = roleService.getAllRoles();
		
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
