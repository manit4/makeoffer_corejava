package com.annotation.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value = "restaurantBean")
public class Restaurant {
	
	@Autowired
	//@Qualifier(value = "tea")
	public Shop shop;
	
	public String name = "Restaurant";
	
	public Restaurant() {
		
		System.out.println("hi");
	}

}
