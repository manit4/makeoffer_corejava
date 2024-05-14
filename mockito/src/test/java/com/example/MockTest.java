package com.example;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.example.exceptions.UserAlreadyExistsException;
import com.example.repository.UserRepository;
import com.example.service.UserService;
import com.example.to.User;

public class MockTest {
	
	UserRepository userRepository;
	UserService userService;

	@Before
	public void setup() {
		
		userRepository = Mockito.mock(UserRepository.class);
		userService = new UserService(userRepository);
	}
	
//	@Test
//	public void addUser() {
//		
//		User user = new User("abcd", "1234", "Manii");
//		
//		Mockito.when(userRepository.saveUser(user)).thenReturn(1);
//		
//		assertEquals("User is saved", userService.addUser(user));
//	}
	
	@Test(expected = UserAlreadyExistsException.class)
	public void addUser() {
		
		User user = new User("abc", "123", "Manit");
		
		Mockito.when(userRepository.saveUser(user)).thenReturn(0);
		
		userService.addUser(user);
		
	}

}
