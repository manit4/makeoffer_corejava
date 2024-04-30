package com.qualifier;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Coffee3 implements Food {
	
	public Coffee3() {
		System.out.println("inside Coffee3 constr");
	}

}
