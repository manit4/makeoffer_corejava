package com.example;

import org.mockito.Mockito;

import com.example.repository.UserRepository;
import com.example.service.UserService;
import com.example.to.User;

//public class MockMain {
//	
//	private UserService userService;
//	private UserRepository userRepository;
//	
//	public static void main(String[] args) {
//		
//		MockMain mockMain = new MockMain();
//		mockMain.setup();
//		mockMain.shouldSaveUser();
//	}
//	
//	public void setup() {
//		
//		userRepository = Mockito.mock(UserRepository.class);
//		userService = new UserService(userRepository);
//	}
//	
//	private void shouldSaveUser() {
//		
//		User user = new User("abcd", "1234", "Mani");
//		
//		Mockito.when(userRepository.saveUser(user)).thenReturn(1);
//		
//		String result = userService.addUser(user);
//		
//		if(result.equals("User is saved")) {
//			
//			System.out.println("test is passed");
//			
//		}
//		else {
//			
//			System.out.println("test is failed");
//		}
//	}
//	
//	
//
//}







public class MockMain {
	
	private static UserRepository userRepository;
	private static UserService userService;
	
	public static void main(String[] args) {
		
		setup();
		shouldSaveUser();	
	}
	
	public static void setup() {
		
		//userRepository = new UserRepository();
		userRepository = Mockito.mock(UserRepository.class);
		userService = new UserService(userRepository);
	}
	
	public static void shouldSaveUser() {
		
		User user = new User("abcd", "1234", "Manit");
		
		Mockito.when(userRepository.saveUser(user)).thenReturn(1);
		
		String status = userService.addUser(user);
		
	}	
}
