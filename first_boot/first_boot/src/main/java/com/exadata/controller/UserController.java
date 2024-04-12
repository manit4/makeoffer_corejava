package com.exadata.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exadata.dto.User;

//@Controller//If the response is in html then the class must be annotated with @Controller
@RestController//If the response is in plain text/json/xml then the class must be annotated with @RestController
				//and the mapping methods are called as Rest-Endpoints
public class UserController {
	
	@RequestMapping("/msg")
	public String getessage() {//This is rest end-point...
		System.out.println("inside getMessage mapping method...");
		
		return "hello class jenkins....";
	}
	
	@RequestMapping("/getUser")
	public User getUser() {
		
		System.out.println("inside getUser mapping method....");
		
		User user = new User(101, "Jiangwei", 111111);
		
		return user;
	}
	
	@RequestMapping("getAllUsers")
	public List<User> getAllUsers() {
		
		User user1 = new User(100, "Jiangwei", 111111);
		User user2 = new User(101, "Gary", 222222);
		User user3 = new User(102, "Manisai", 333333);
		
		List<User> users = new ArrayList<User>();
		
		users.add(user1);   users.add(user2);  users.add(user3);
		
		return users;
	}

}
