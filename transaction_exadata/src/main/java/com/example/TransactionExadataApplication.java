package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.service.UserService;

@SpringBootApplication
@EnableTransactionManagement
public class TransactionExadataApplication implements CommandLineRunner {
	
	@Autowired
	UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(TransactionExadataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		userService.addCompleteDetails();
		
	}

}
