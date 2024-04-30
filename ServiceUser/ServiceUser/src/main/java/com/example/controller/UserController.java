package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.service.UserService;
import com.example.to.Contact;
import com.example.to.User;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	RestTemplate restTemplate;
	
	Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@GetMapping("/getUser/{userId}")
	public User getUser(@PathVariable String userId) {
		
		logger.info("inside getUser() of UserController ");
		
		User user = userService.getUser(userId);
		
//		Contact contact = restTemplate.getForObject("http://localhost:8082/contact/getContact/"+userId, Contact.class);
		Contact contact = restTemplate.getForObject("http://ServiceContact/contact/getContact/"+userId, Contact.class);
		user.setContact(contact);
		
		return user;
	}
	
}

























//Contact contact = restTemplate.getForObject("http://contact-service/contact/getContact/"+userId, Contact.class);