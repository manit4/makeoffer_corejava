package com.example.controller;

import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.helper.JWTHelper;
import com.example.model.JWTRequest;
import com.example.service.CustomUserDetailsService;

@RestController
public class JWTController {
	
	@Autowired
	AuthenticationManager authenticationManager;
	
	@Autowired
	CustomUserDetailsService customUserDetailsService;
	
	@Autowired
	JWTHelper jwtHelper;
	
	@PostMapping("/token")
	public String generateToken(@RequestBody JWTRequest request) {
		
		System.out.println(request.getUsername()+", "+request.getPassword());
		
		authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
		
		UserDetails userDetails = customUserDetailsService.loadUserByUsername(request.getUsername());
		
		String token = jwtHelper.generateToken(userDetails);
		
		return token;
	}

}
