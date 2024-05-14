package com.test.to;

public class Student {
	
	public String name;
	public int marks;
	
	public String checkResult() {
		
		if(marks < 40)
			return "Just Passed";
		else if(marks >= 40 && marks< 50)
			return "Third Class";
		else if(marks >= 50 && marks< 60)
			return "Second Class";
		else if(marks >= 60 && marks< 70)
			return "First Class";
		
		return "Matric Passed";
	}
}
