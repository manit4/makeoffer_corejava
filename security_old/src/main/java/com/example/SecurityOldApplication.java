package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.entity.User;
import com.example.repository.UserRepository;


@SpringBootApplication
@CrossOrigin
public class SecurityOldApplication implements CommandLineRunner{
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	PasswordEncoder encoder;
	
	

	public static void main(String[] args) {
		SpringApplication.run(SecurityOldApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		String encrptedPassword = encoder.encode("345");
		
		User user = new User("kiran", encrptedPassword, "kiran", "Role_Admin", true);
		
		userRepository.save(user);
	}

}



//@SpringBootApplication
//public class SecurityOldApplication implements CommandLineRunner {
//	
//	@Autowired
//	UserRepository userRepository;
//	
//	@Autowired
//	PasswordEncoder encoder;
//
//	public static void main(String[] args) {
//		SpringApplication.run(SecurityOldApplication.class, args);
//		
//	}
//
//	@Override
//	public void run(String... args) throws Exception {
//		
//		String encrptedPassword = encoder.encode("234");
//		
//		System.out.println("encrypt pass is "+encrptedPassword);
//		
////		User user = new User("rong", encrptedPassword, "Rongjing", "Admin");
//		User user = new User("jang", encrptedPassword, "Jiangwei", "Employee");
//		
//		
//		userRepository.save(user);
//		
//	}
//
//}







//class SingletonTest {
//
//public static final SingletonTest instance = new SingletonTest();
//
//private SingletonTest() {
//	
//}
//
//public static SingletonTest getInstance() {
//	
//	return instance;
//}
//
//}

//@SpringBootApplication
//public class SecurityOldApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(SecurityOldApplication.class, args);
		
//		SingletonTest s1 = new SingletonTest();
//		SingletonTest s2 = new SingletonTest();
//		SingletonTest s3 = new SingletonTest();
//		SingletonTest s4 = new SingletonTest();
		
//		SingletonTest s1 = SingletonTest.getInstance();
//		SingletonTest s2 = SingletonTest.getInstance();
//		SingletonTest s3 = SingletonTest.getInstance();
//		SingletonTest s4 = SingletonTest.getInstance();
//		
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
//		System.out.println(s4);
//	}
