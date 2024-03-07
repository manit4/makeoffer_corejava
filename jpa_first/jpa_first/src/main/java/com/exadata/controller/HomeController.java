package com.exadata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.exadata.entity.User;
import com.exadata.service.UserService;

@Controller
public class HomeController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/")
	public String homePage() {
		
		System.out.println("inside homePage...");
		return "index";
	}
	
	@GetMapping("/registrationPage")
	public String getRegistrationPage() {
		System.out.println("inside registrationPage()");
		return "registration_page";
	}
	
//	@PostMapping("/register")
//	public String register(User user) {
//		System.out.println("inside register()...."+user);
//		
//		userService.addUser(user);
//		
//		return "index";
//	}
	
	
//	@PostMapping("/register")
//	public ModelAndView register(User user) {
//		System.out.println("inside register()...."+user);
//		
//		ModelAndView modelAndView = new ModelAndView("index");
//		modelAndView.addObject("registerSuccessMsg", "Registration Successful, please login now!!");
//		
//		
//		return modelAndView;
//	}
	
	
	
	
	
	
	

}
