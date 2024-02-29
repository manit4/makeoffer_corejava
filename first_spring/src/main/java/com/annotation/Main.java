package com.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.exadata.Restaurant;

public class Main {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(com.annotation.config.SpringConfig.class);
		
		Restaurant restaurant = context.getBean("restaurant", Restaurant.class);
		
		restaurant.placeOrder();
		Restaurant restaurant2 = context.getBean("restaurant", Restaurant.class);
		Restaurant restaurant3 = context.getBean("restaurant", Restaurant.class);
	}

}
