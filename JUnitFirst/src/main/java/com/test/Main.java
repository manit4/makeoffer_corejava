package com.test;

import com.test.service.UserService;
import com.test.to.Student;

public class Main {
	
	public static void main(String[] args) {
		
//		Student s1 = new Student();    s1.name = "Manit";   s1.marks = 70;
//		
//		String result = s1.checkResult();
//		
//		System.out.println(result);
		
//		PrimeNumberChecker checker = new PrimeNumberChecker();
//		
//		System.out.println(checker.validate(21));
		
		
		UserService userService = new UserService();
		
		System.out.println(userService.findUser("xabc"));
		
	}

}
