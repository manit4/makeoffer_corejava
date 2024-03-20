package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.JWTRequest;
import com.example.helper.JWTHelper;
import com.example.service.CustomUserDetailsService;

@RestController
public class AuthController {
	
	@Autowired
	AuthenticationManager authenticationManager;
	
	@Autowired
	CustomUserDetailsService customUserDetailsService;
	
	@Autowired
	JWTHelper jwtHelper;
	
	@PostMapping("/login")
	public String generateToken(@RequestBody JWTRequest jwtRequest) {
		
		System.out.println("credentials are "+jwtRequest.getUsername()+", "+jwtRequest.getPassword());
		
		String token = null;
		
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(jwtRequest.getUsername(), jwtRequest.getPassword()));
			UserDetails userDetails = customUserDetailsService.loadUserByUsername(jwtRequest.getUsername());
			
			token = jwtHelper.generateToken(userDetails);
			
			System.out.println("generated token is "+token);
		}
		catch (Exception e) {
			System.out.println("insdie catch of login()....");
			e.printStackTrace();
		}
		
		return token;	
	}
	
	
//	authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(jwtRequest.getUsername(), jwtRequest.getPassword()));
//	
//	UserDetails userDetails = customUserDetailsService.loadUserByUsername(jwtRequest.getUsername());
//	
//	String token = jwtHelper.generateToken(userDetails);
//	System.out.println("Token is "+token);

}
