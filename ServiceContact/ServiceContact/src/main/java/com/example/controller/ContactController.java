package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.ContactService;
import com.example.to.Contact;

@RestController
@RequestMapping("/contact")
public class ContactController {
	
	@Autowired
	ContactService contactService;
	
	Logger logger = LoggerFactory.getLogger(ContactController.class);
	
	@GetMapping("/getContact/{userId}")
	public Contact getContact(@PathVariable String userId) {
		
		logger.info("inside getContact() of ContactController "+userId);
		
		return contactService.getContact(userId);
	}
}
