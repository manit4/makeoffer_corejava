package com.exadata.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exadata.entity.User;
import com.exadata.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

//	public User addUser(User user) {
//		
//		return userRepository.save(user);
//	}

//	public boolean addUser(User user) {
//		
//		if(userRepository.existsById(user.getUsername())) {
//			return false;
//		}
//		else {
//			userRepository.save(user);
//			return true;
//		}
//	}

	public boolean addUser(User user) {

		boolean status = false;

		if (!userRepository.existsById(user.getUsername())) {

			userRepository.save(user);
			status = true;
		}

		return status;
	}

//	public boolean login(String username, String password) {
//		
//		boolean status = false;
//		
//		Optional<User> optional = userRepository.findById(username);
//		
//		if(optional.isPresent()) {
//			
//			User user = optional.get();
//			if(user.getPassword().equals(password)) {
//				status = true;
//			}
//		}
//		return status;
//		
//	}

//	public boolean login(String username, String password) {
//
//		boolean status = false;
//
//		User user = userRepository.findByUsernameAndPassword(username, password);
//		
//		if(user != null) {
//			
//			status = true;
//		}	
//		return status;
//	}
	
	public User login(String username, String password) {

		User user = userRepository.findByUsernameAndPassword(username, password);
		
		
		return user;
	}
	
	
	public List<User> findAllUsers() {
		
		return userRepository.findAll();
	}
	
	public void deleteByUsername(String username) {
		
		userRepository.deleteById(username);
	}	
	
	public User findById(String username) {
		
		Optional<User> optional = userRepository.findById(username);
		
		User user = null;
		
		if(optional.isPresent()) {
			
			user = optional.get();
		}
		return user;
	}
	
	public User updateUser(User user) {
		
		return userRepository.save(user);
	}
}

