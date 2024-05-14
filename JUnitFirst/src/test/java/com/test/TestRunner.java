package com.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

	public static void main(String[] args) {
		
		Result result = JUnitCore.runClasses(First.class, Second.class);
		
		for(Failure failure : result.getFailures()) {
			
			System.out.println(failure);
		}
		
		System.out.println(result.wasSuccessful()+", "+result.getFailureCount()+", "+result.getIgnoreCount());
		
	}

}
