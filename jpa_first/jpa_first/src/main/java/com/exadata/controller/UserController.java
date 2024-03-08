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

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

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
	
//	@PostMapping("/login")
//	public ModelAndView login(String username, String password, HttpServletRequest request) {
//		
//		System.out.println("credentials "+username+", "+password);
//		
//		boolean status = userService.login(username, password);
//		
//		ModelAndView modelAndView = null;
//		
//		if(status) {
//			
//			HttpSession session = request.getSession();
//			
//			session.setAttribute("sessionData", "I am sessiondata");
//			
//			
//			modelAndView = new ModelAndView("welcome");
//			modelAndView.addObject("welcomeMsg", username);
//			
//			List<User> users = userService.findAllUsers();
//			
//			modelAndView.addObject("users", users);
//		}
//		else {
//			 modelAndView = new ModelAndView("index");
//			 modelAndView.addObject("loginErrorMsg", "Login Attempt Failed, please try again...");
//		}
//		
//		return modelAndView;
//	}
	
	
	
	@PostMapping("/login")
	public ModelAndView login(String username, String password, HttpServletRequest request) {
		
		System.out.println("credentials "+username+", "+password);
		
		User user = userService.login(username, password);
		
		ModelAndView modelAndView = null;
		
		if(user != null) {
			
			HttpSession session = request.getSession();
			
			//session.setAttribute("sessionData", "I am sessiondata");
			session.setAttribute("user", user);
			
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
	
	@RequestMapping("/updatePage/{username}")
	public ModelAndView updatePage(@PathVariable String username, HttpServletRequest request) {
		
		System.out.println("username is "+username);
		
		HttpSession session = request.getSession(false);
		
		ModelAndView modelAndView = null;
		
		if(session != null) {
			User user = userService.findById(username);
			
			modelAndView = new ModelAndView("update_user");
			modelAndView.addObject("user", user);
		}
		else {
			modelAndView = new ModelAndView("index");
			modelAndView.addObject("authorizedMsg", "You are not authorized, please login again");
		}
		
		
		
		return modelAndView;
	}
	
	@RequestMapping("/update")
	public ModelAndView update(User user, HttpServletRequest request) {
		
		System.out.println(user);
		
		HttpSession session = request.getSession();
		User currentUserSession = (User) session.getAttribute("user");
		if(!currentUserSession.getRole().equals("Admin")) {
			
			user.setRole(currentUserSession.getRole());
		}
		
		User updatedUser = userService.updateUser(user);
		session.setAttribute("user", updatedUser);
		List<User> users = userService.findAllUsers();
		
		ModelAndView modelAndView = new ModelAndView("welcome");
		modelAndView.addObject("updateSuccessMsg", "User is updated Successfull");
		modelAndView.addObject("users", users);
		return modelAndView;
		
	}
	
}
