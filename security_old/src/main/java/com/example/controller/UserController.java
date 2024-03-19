package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.User;

@RestController
public class UserController {
	
	@GetMapping("/getMsg")
	public String msg() {
		
		return "Hello User";
	}
	
	@GetMapping("/getUser")
	public User getUser() {
		
		User user = new User("man@123", "123", "Manit", "Admin", true);
		
		return user;
	}

}
