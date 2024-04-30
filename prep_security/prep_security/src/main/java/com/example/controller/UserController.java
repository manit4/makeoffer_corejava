package com.example.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/all/")
public class UserController {
	
	@GetMapping("public")
	public String publicAPI() {
		
		return "I am Public User";
	}
	
	@GetMapping("registered")
	//@PreAuthorize(value = "Employee")
	public String registeredAPI() {
		
		return "I am Registered User";
	}
	
	@GetMapping("admin")
	//@PreAuthorize(value = "Admin")
	public String adminAPI() {
		
		return "I am Admin User";
	}
}
