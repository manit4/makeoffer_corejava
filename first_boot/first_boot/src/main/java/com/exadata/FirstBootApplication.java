package com.exadata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.google.Coffee;

@SpringBootApplication
@ComponentScan("com.google, com.exadata")
public class FirstBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstBootApplication.class, args);
	}
	
//	@Bean
//	public Coffee getCoffe() {
//		
//		return new Coffee();
//	}

}
