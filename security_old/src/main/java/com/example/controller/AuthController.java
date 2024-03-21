package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.JWTRequest;
import com.example.dto.JWTResponse;
import com.example.helper.JWTHelper;
import com.example.service.CustomUserDetailsService;

@RestController
@CrossOrigin
public class AuthController {
	
	@Autowired
	AuthenticationManager authenticationManager;
	
	@Autowired
	CustomUserDetailsService customUserDetailsService;
	
	@Autowired
	JWTHelper jwtHelper;
	
	@PostMapping("/login")
	public ResponseEntity<JWTResponse> generateToken(@RequestBody JWTRequest jwtRequest) {
		
		System.out.println("credentials are "+jwtRequest.getUsername()+", "+jwtRequest.getPassword());
		
		String token = null;
		
		ResponseEntity<JWTResponse> responseEntity = null;
		
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(jwtRequest.getUsername(), jwtRequest.getPassword()));
			UserDetails userDetails = customUserDetailsService.loadUserByUsername(jwtRequest.getUsername());
			
			token = jwtHelper.generateToken(userDetails);
			
			System.out.println("generated token is "+token);
			
			responseEntity = new ResponseEntity<>(new JWTResponse(token, jwtRequest.getUsername()), HttpStatus.OK);
		}
		catch (Exception e) {
			System.out.println("insdie catch of login()....");
			responseEntity = new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);	
			e.printStackTrace();
		}
		
		return responseEntity;
	}
	
	
//	authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(jwtRequest.getUsername(), jwtRequest.getPassword()));
//	
//	UserDetails userDetails = customUserDetailsService.loadUserByUsername(jwtRequest.getUsername());
//	
//	String token = jwtHelper.generateToken(userDetails);
//	System.out.println("Token is "+token);

}
