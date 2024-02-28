package com.exadata;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


class Restaurant {
	
	String name;
	
	public void setName(String name) {
		this.name = name;
	}
	public Restaurant() {
		System.out.println("inside Rest constr...");
	}
}

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/exadata/spring-config.xml");
		
		Restaurant restaurant = context.getBean("restaurantBean", Restaurant.class);
		
		System.out.println(restaurant.name);
		restaurant.name = "BBB Chains";
		
		Restaurant restaurant2 = context.getBean("restaurantBean", Restaurant.class);
		System.out.println(restaurant2.name);
	}
}


//class Restaurant {
//	
//	Tea tea;
//
//	public void setTea(Tea tea) {
//		System.out.println("inside setTea()...");
//		this.tea = tea;
//	}
//
//	Restaurant() {
//		System.out.println("inside rest constr..");
//	}
//	
//	void placeOrder() {
//		System.out.println("inside placeOrder()....");
//		tea.prepareTea();
//	}
//}
//
//public class Main {
//	
//	public static void main(String[] args) {
//		
//		ApplicationContext context = new ClassPathXmlApplicationContext("com/exadata/spring-config.xml");
//		
//		Restaurant restaurant = context.getBean("restaurantBean", Restaurant.class);
//		
//		restaurant.placeOrder();
//	}
//}



//class Restaurant {
//	
//	Tea tea = new Tea();
//	
//	Restaurant() {
//		System.out.println("inside rest constr..");
//	}
//	
//	void placeOrder() {
//		System.out.println("inside placeOrder()....");
//		tea.prepareTea();
//	}
//}
//
//public class Main {
//	
//	public static void main(String[] args) {
//		
//		ApplicationContext context = new ClassPathXmlApplicationContext("com/exadata/spring-config.xml");
//		
//		Restaurant restaurant = context.getBean("restaurantBean", Restaurant.class);
//		
//		restaurant.placeOrder();
//	}
//}


//class Restaurant {
//	
//	Tea tea;
//	
//	Restaurant() {
//		System.out.println("inside rest constr..");
//	}
//	
//	void placeOrder() {
//		System.out.println("inside placeOrder()....");
//		tea.prepareTea();
//	}
//}
//
//public class Main {
//	
//	public static void main(String[] args) {
//		
//		ApplicationContext context = new ClassPathXmlApplicationContext("com/exadata/spring-config.xml");
//		
//		Restaurant restaurant = context.getBean("restaurantBean", Restaurant.class);
//		
//		restaurant.placeOrder();
//	}
//}


//class Restaurant {
//	
//	String name;
//	int age;
//	
//	Restaurant() {
//		System.out.println("inside Rest constr...");
//	}
//	
//	public Restaurant(String name) {
//		super();
//		this.name = name;
//	}
//
//	public Restaurant(String name, int age) {
//		super();
//		this.name = name;
//		this.age = age;
//	}
//
//	void prepareTea() {	
//		System.out.println("Your Tea is being prepared by "+name+" and the restaurant age is "+age);
//	}
//}
//
//public class Main {
//	
//	public static void main(String[] args) {
//		
//		ApplicationContext context = new ClassPathXmlApplicationContext("com/exadata/spring-config.xml");
//		
//		Restaurant restaurant = context.getBean("restaurantBean", Restaurant.class);
//		
//		restaurant.prepareTea();
//	}
//}


//class Restaurant {
//	
//	String name;
//	
//	Restaurant() {
//		System.out.println("inside Rest constr...");
//	}
//	
//	public Restaurant(String name) {
//		super();
//		System.out.println("inside parameterized constru....");
//		this.name = name;
//	}
//
//	void prepareTea() {	
//		System.out.println("Your Tea is being prepared by "+name);
//	}
//}
//
//public class Main {
//	
//	public static void main(String[] args) {
//		
//		ApplicationContext context = new ClassPathXmlApplicationContext("com/exadata/spring-config.xml");
//		
//		Restaurant restaurant = context.getBean("restaurantBean", Restaurant.class);
//		
//		restaurant.prepareTea();
//	}
//
//}



//class Restaurant {
//	
//	String name;
//	
//	Restaurant() {
//		System.out.println("inside Rest constr...");
//	}
//	
//	public void setName(String name) {
//		System.out.println("inside setter()...."+name);
//		this.name = name;
//	}
//
//	void prepareTea() {	
//		System.out.println("Your Tea is being prepared by "+name);
//	}
//}
//
//public class Main {
//	
//	public static void main(String[] args) {
//		
//		ApplicationContext context = new ClassPathXmlApplicationContext("com/exadata/spring-config.xml");
//		
//		Restaurant restaurant = context.getBean("restaurantBean", Restaurant.class);
//		
//		restaurant.prepareTea();
//	}
//
//}


//class Restaurant {
//	
//	String name;
//	
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	void prepareTea() {	
//		System.out.println("Your Tea is being prepared by "+name);
//	}
//}
//
//public class Main {
//	
//	public static void main(String[] args) {
//		
//		ApplicationContext context = new ClassPathXmlApplicationContext("com/exadata/spring-config.xml");
//		
//		Restaurant restaurant = context.getBean("restaurantBean", Restaurant.class);
//		
//		restaurant.prepareTea();
//	}
//
//}


//class Restaurant {
//	
//	String name = "Abc Chains";
//	
//	void prepareTea() {	
//		System.out.println("Your Tea is being prepared by "+name);
//	}
//}
//
//public class Main {
//	
//	public static void main(String[] args) {
//		
//		ApplicationContext context = new ClassPathXmlApplicationContext("com/exadata/spring-config.xml");
//		
//		Restaurant restaurant = context.getBean("restaurantBean", Restaurant.class);
//		
//		restaurant.prepareTea();
//	}
//
//}


//class Restaurant {
//	
//	String name;
//	
//	public Restaurant() {
//		System.out.println("inside Restaurant no-arg constructor....");
//	}
//	
//	void prepareTea() {	
//		System.out.println("Your Tea is being prepared...");
//	}
//}
//
//public class Main {
//	
//	public static void main(String[] args) {
//		
//		ApplicationContext context = new ClassPathXmlApplicationContext("com/exadata/spring-config.xml");
//		
//		Restaurant restaurant = new Restaurant();
//		
//		restaurant.prepareTea();
//		
//		
//		
//		
////		Restaurant restaurant = new Restaurant();
////		
////		restaurant.prepareTea();
//	}
//
//}
