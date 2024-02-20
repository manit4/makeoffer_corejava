package com.offer;

import com.offer.service.UserService;

public class Car extends UserService {
	
	String color = "Red";

	protected String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	void display() {
		
		System.out.println(color +", "+value);
		
	}
}



//public class Car {
//	
//	private String color = "Red";
//
//	protected String getColor() {
//		return color;
//	}
//
//	public void setColor(String color) {
//		this.color = color;
//	}
//	
//	
//
//}



//public class Car {
//	
//	private String color = "Red";
//
//	public String getColor() {
//		return color;
//	}
//
//	public void setColor(String color) {
//		this.color = color;
//	}
//	
//	
//
//}
