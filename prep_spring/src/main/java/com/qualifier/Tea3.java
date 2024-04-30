package com.qualifier;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
//@Primary
public class Tea3 implements Food {
	
	public Tea3() {
		System.out.println("inside Tea3 constr....");
	}

}
