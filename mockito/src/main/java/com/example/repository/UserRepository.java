package com.example.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.exceptions.UserAlreadyExistsException;
import com.example.to.User;

public class UserRepository {
	
	List<User> users;
	
	public UserRepository() {
		
		users = new ArrayList<User>();
		
		User user1 = new User("abc", "123", "Manit");
		User user2 = new User("bcd", "234", "Manu");
		User user3 = new User("cde", "345", "Jaingwei");
		
		users.add(user1);   users.add(user2);    users.add(user3);
	}
	
	public int saveUser(User user) {
		
		System.out.println("inside saveUser() of UserRepository...."+users.size());
		
		if(!users.contains(user)) {
			System.out.println("insdie notequal contains()");
			users.add(user);
			return 1;
		}
		
		else {
			
			return 0;
		}
		
	}
}

//public class UserRepository {
//	
//	List<User> users;
//	
//	public UserRepository() {
//		
//		users = new ArrayList<User>();
//		
//		User user1 = new User("abc", "123", "Manit");
//		User user2 = new User("bcd", "234", "Manu");
//		User user3 = new User("cde", "345", "Jaingwei");
//		
//		users.add(user1);   users.add(user2);    users.add(user3);
//	}
//	
//	public int saveUser(User user) {
//		
//		System.out.println("inside saveUser() of UserRepository...."+users.size());
//		
//		if(!users.contains(user)) {
//			System.out.println("insdie notequal contains()");
//			users.add(user);
//			return 1;
//		}
//		
//		else {
//			
//			return 0;
//		}
//		
//	}
//}
