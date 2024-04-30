package com.annotation.entity;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class HamBurger implements Shop {
	
	public HamBurger() {
		System.out.println("Hello HamBrurger....");
	}

}
