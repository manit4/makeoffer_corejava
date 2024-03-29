package com.dydata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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
		
		try {
			String status = roleService.createRole(role);
			return new ResponseEntity<>(status, HttpStatus.OK);
		}
		catch (Exception e) {
			System.out.println("insdie catch");
			e.printStackTrace();
			return new ResponseEntity<String>("Something Went Wrong", HttpStatus.BAD_REQUEST);
		}	
	}
}
