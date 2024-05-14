package com.example;

import com.example.repository.UserRepository;
import com.example.service.UserService;
import com.example.to.User;




public class Main {
	
	private static UserService userService = new UserService();
	
	public static void main(String[] args) {
		
//		User user = new User("sc", "111", "ABC");
		User user = new User("abc", "123", "Manit");
		
		String status = userService.addUser(user);
		
		System.out.println(status);
	}

}



//public class Main {
//	
//	private static UserService userService = new UserService();
//	
//	public static void main(String[] args) {
//		
////		User user = new User("sc", "111", "ABC");
//		User user = new User("abc", "123", "Manit");
//		
//		String status = userService.addUser(user);
//		
//		System.out.println(status);
//	}
//
//}
