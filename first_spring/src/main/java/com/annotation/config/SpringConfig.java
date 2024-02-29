package com.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.exadata.Tea;

@Configuration
@ComponentScan("com.exadata")
public class SpringConfig {
	
	@Bean
	@Scope(scopeName = "prototype")
	public Tea getTea() {
		
		System.out.println("inside getTea....");
		
		return new Tea();
	}

}
