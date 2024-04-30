package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.qualifier.Food;

@Service
public class Restaurant2 {
	
	@Autowired
	Tea2 tea2;
	
//	@Autowired
//	Tea3 tea3;
	
	@Autowired
	@Qualifier(value = "tea3")
	Food food;
	
	public Restaurant2() {
		System.out.println("inside Rest2 constru....");
	}
	
	public void placeOrder( ) {
		
		System.out.println("The Tea object is "+tea2+", "+food);
	}

}
