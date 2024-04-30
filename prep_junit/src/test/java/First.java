import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class First {
	
	@BeforeClass
	public static void beforeClass() {
		
		System.out.println("Before class");
	}
	
	@Before
	public void beforeTest() {
		
		System.out.println("before test");
	}

	@Test
	public void test1() {
		
		System.out.println("test1");
	}
	@Test
	public void test2() {
		
		System.out.println("test2");
	}
	
	@After
	public void afterTest() {
		
		System.out.println("after test");
	}
	
	@AfterClass
	public static void afterClass() {
		
		System.out.println("after class");
	}

}
