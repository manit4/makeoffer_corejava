package com.test.to;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class StudentTest {
	
	static Student student1;
	static Student student2;
	static Student student3;
	static Student student4;
	static Student student5;
	
	@BeforeClass
	public static void beforeClass() {
		
		student1 = new Student();     student1.name = "Manit";   student1.marks = 54;
		student2 = new Student();     student2.name = "Manit";   student2.marks = 40;
		student3 = new Student();     student3.name = "Manit";   student3.marks = 80;
		student4 = new Student();     student4.name = "Manit";   student4.marks = 60;
		student5 = new Student();     student5.name = "Manit";   student5.marks = 47;
	}
	
	@Test
	public void checkResult1() {
		
		assertEquals("Second Class", student1.checkResult());	
	}
	
	@Test
	public void checkResult2() {
		
		assertEquals("Third Class", student2.checkResult());
	}
	
	@Test
	public void checkResult3() {
	
		assertEquals("Matric Passed", student3.checkResult());	
	}
	
	@Test
	public void checkResult4() {
		
		assertEquals("First Class", student4.checkResult());
	}
	
	@Test
	public void checkResult5() {
		
		assertEquals("Third Class", student5.checkResult());	
	}

}
