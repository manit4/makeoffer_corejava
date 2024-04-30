package com.annotation.entity;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Tea implements Shop {
	
	public String teaName = "Tea";
	
	public Tea() {
		System.out.println("hello tea");
	}

}
