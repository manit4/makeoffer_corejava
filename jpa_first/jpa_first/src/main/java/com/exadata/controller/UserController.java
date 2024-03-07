package com.exadata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.exadata.entity.User;
import com.exadata.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/register")
	public ModelAndView register(User user) {
		System.out.println("inside register()...."+user);
		
		ModelAndView modelAndView = null;
		
		boolean registerStatus = userService.addUser(user);
		
		if(registerStatus) {
			modelAndView = new ModelAndView("index");
			modelAndView.addObject("registerSuccessMsg", "RegistrationSuccessful, please login now!!");
		}
		else {
			modelAndView = new ModelAndView("index");
			modelAndView.addObject("registerErrorMsg", "Username Exists, please try with another Username");
		}
		
		return modelAndView;
	}
	
	@PostMapping("/login")
	public ModelAndView login(String username, String password) {
		
		System.out.println("credentials "+username+", "+password);
		
		boolean status = userService.login(username, password);
		
		ModelAndView modelAndView = null;
		
		if(status) {
			modelAndView = new ModelAndView("welcome");
			modelAndView.addObject("welcomeMsg", username);
			
			List<User> users = userService.findAllUsers();
			
			modelAndView.addObject("users", users);
		}
		else {
			 modelAndView = new ModelAndView("index");
			 modelAndView.addObject("loginErrorMsg", "Login Attempt Failed, please try again...");
		}
		
		return modelAndView;
	}
	
	@RequestMapping("/delete/{username}")
	public ModelAndView delete(@PathVariable String username) {
		
		System.out.println("the usernmae is "+username);
		
		userService.deleteByUsername(username);
		
		List<User> users = userService.findAllUsers();
		
		ModelAndView modelAndView = new ModelAndView("welcome");
		
		modelAndView.addObject("users", users);
		
		return modelAndView;
	}
	
	
}
