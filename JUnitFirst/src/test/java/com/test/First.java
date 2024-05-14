package com.test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;



public class First {
	
	String s1 = "Rongjing";
	
	@Test
	public void test1() {
		
		System.out.println("inside test1 of First Test file");
		
//		fail();
		
		assertEquals("rongjing", s1);
	}
	
	@Test
	@Ignore
	public void test2() {
		
		System.out.println("inside test2 of First Test file");
		
	}
	
	
}

//class User {
//	
//	int age;
//	String name;
//}
//
//public class First {
//	
//	User user1, user2;
//	String s1, s2, s3;
//	
//	@Before
//	public void before() {
//		
//		user1 = new User();    user1.age = 25;   user1.name = "Manit";
//		user2 = new User();    user2.age = 31;   user2.name = "Manit";
//		
//		s1 = "Jaingwei";    s2 = "Rongjing";
//	}
//	
//	@Test
//	public void test1() {
//		
//		assertNotNull(user1);
//	}
//	@Test
//	public void test2() {
//		
//		assertNull(s3);
//	}
//	@Test
//	public void test3() {
//		
//		assertEquals(user1, user2);
//	}
//	@Test
//	public void test4() {
//		
//		assertTrue(user1.name.equals("Manit"));
//	}
//}

//public class First {
//	
//	static List<String> list;
//	static Scanner sc;
//	
//	@BeforeClass
//	public static void beforeClass() {
//		
//		list = new ArrayList();
//		sc = new Scanner(System.in);
//	}
//	
//	@Before
//	public void before() {
//		
//		System.out.println("How many names are you trying to Save in a list");
//		int size = sc.nextInt();
//
//		for (int i = 0; i < size; i++) {
//
//			System.out.println("Enter Name");
//			list.add(sc.next());
//		}
//	}
//	
//	@After
//	public void after() {
//		
//		list.clear();
//	}
//
//	@Test
//	public void test1() {
//
//		assertTrue(list.size() > 0);
//	}
//	
//	@Test
//	public void test2() {
//		
//		assertTrue(list.size() > 0);
//	}
//	
//	@AfterClass
//	public static void afterClass() {
//		
//		list = null;
//		sc = null;
//	}
//}




//public class First {
//
//	@Test
//	public void test1() {
//
//		List<String> list = new ArrayList();
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("How many names are you trying to Save in a list");
//		int size = sc.nextInt();
//
//		for (int i = 0; i < size; i++) {
//
//			System.out.println("Enter Name");
//			list.add(sc.next());
//		}
//
//		assertTrue(list.size() > 0);
//	}
//	
//	@Test
//	public void test2() {
//		
//		List<String> list = new ArrayList();
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("How many names are you trying to Save in a list");
//		int size = sc.nextInt();
//		
//		for(int i = 0; i < size; i++) {
//			
//			System.out.println("Enter Name");
//			list.add(sc.next());
//		}
//		
//		assertTrue(list.size() > 0);
//		}
//}

//public class First {
//	
//	@BeforeClass
//	public static void beforeClass() {
//		
//		System.out.println("inside beforeClass");
//	}
//	
//	@Before
//	public void before() {
//		
//		System.out.println("inside before");
//	}
//
//	@Test
//	public void test1() {
//		System.out.println("inside test1");
//		
//	}
//	
//	@Test
//	public void test2() {
//		
//		System.out.println("inside test2");
//	}
//	
//	@After
//	public void after() {
//		
//		System.out.println("inside after");
//	}
//	
//	@AfterClass
//	public void afterClass() {
//		System.out.println("inside afterClass");
//	}
//}
