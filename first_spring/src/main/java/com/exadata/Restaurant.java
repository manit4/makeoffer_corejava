package com.exadata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class Restaurant {
	
	@Autowired
	Tea tea;
	
	public Restaurant() {
		System.out.println("inside Rest constr....");
	}
	
	public void placeOrder() {
		
		tea.prepareTea();
	}
}
