package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.to.User;

@Service
public class UserService {
	
	private List<User> users;
	
	public UserService() {
		
		users = new ArrayList<>();
		
		User user1 = new User("jian1", "Jaingwei", 999999, null);
		User user2 = new User();   user2.setUserId("rong2");  user2.setName("Rongjing");  user2.setPhone(88888);
		User user3 = User.builder().name("Gary").userId("gar3").phone(777777).build();
		
		users.add(user1);   users.add(user2);    users.add(user3);
	}
	
	public User getUser(String userId) {
		
		User returnedUser = null;
		
		for(User user : users) {
			
			if(user.getUserId().equals(userId)) {
				
				returnedUser = user;
				break;
			}
		}
		
		return returnedUser;
		
	}
	
	

}
