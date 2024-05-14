package com.test.service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.ArrayList;
import java.util.List;

import com.test.dto.User;
import com.test.to.Student;

public class UserService {

	List<User> list;

	public UserService() {

		list = new ArrayList<User>();

		User user1 = new User("abc", "123", "Manit");
		User user2 = new User("bcd", "234", "Kiran");
		User user3 = new User("cbd", "345", "Jaingwei");

		list.add(user1);
		list.add(user2);
		list.add(user3);
	}

//	public String findUser(String username) {
//		
//		String status = null;
//		
//		for(User value : list) {
//			
//			if(value.getUsername().equals(username)) {
//				status = "User Found";
//				break;
//			}
//		}
//		
//		if(status == null) {
//			throw new ArithmeticException("User not Found");
//		}
//		return status;
//	}

	public User findUser(String username) {

		User user = null;

		for (User value : list) {

			if (value.getUsername().equals(username)) {
				user = value;
				break;
			}
		}

		if (user == null) {
			throw new ArithmeticException("User not Found");
		}
		return user;
	}
}
