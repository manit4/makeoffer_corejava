package com.exadata;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;



public class Tea {
	
	public Tea() {
		System.out.println("inside Tea constr....");
	}
	
	void prepareTea() {
		System.out.println("Tea is being prepared....");
	}
}




//@Component
//public class Tea {
//	
//	Tea() {
//		System.out.println("inside Tea constr....");
//	}
//	
//	void prepareTea() {
//		System.out.println("Tea is being prepared....");
//	}
//	
//	
//
//}
