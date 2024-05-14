package com.example.service;

import com.example.exceptions.UserAlreadyExistsException;
import com.example.repository.UserRepository;
import com.example.to.User;

public class UserService {
	
	private UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		
		this.userRepository = userRepository;
	}
	
	public String addUser(User user) {
		
		System.out.println("inside addUser() of UserService");
		
		int status = userRepository.saveUser(user);
		
		if(status == 1) {
			
			return "User is saved";
		}
		else {
			
			throw new UserAlreadyExistsException();
		}
	}

}

//public class UserService {
//	
//	private UserRepository userRepository = new UserRepository();
//	
//	public String addUser(User user) {
//		
//		System.out.println("inside addUser() of UserService");
//		
//		int status = userRepository.saveUser(user);
//		
//		if(status == 1) {
//			
//			return "User is saved";
//		}
//		else {
//			
//			throw new UserAlreadyExistsException();
//		}
//	}
//
//}
