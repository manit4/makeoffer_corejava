package com.example.repository;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.example.exceptions.UserAlreadyExistsException;
import com.example.to.User;

public class UserRepositoryTest {
	
	private UserRepository userRepository;
	
	@Before
	public void initialize() {
		
		userRepository = new UserRepository();
	}

	@Test
	public void saveUser() {
		
		User user = new User("qwe", "567", "Kiran");
		
		assertEquals(1, userRepository.saveUser(user));
		
	}
	
	@Test
	public void saveUser2() {
		
		User user = new User("abc", "123", "Manit");
		
		assertEquals(0, userRepository.saveUser(user));
	}

}
