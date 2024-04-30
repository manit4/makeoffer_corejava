import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.Restaurant2;


public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		Restaurant2 restaurant2 = context.getBean("restaurant2", Restaurant2.class);
		
		restaurant2.placeOrder();
	}

}



//public class Main {
//	
//	public static void main(String[] args) {
//		
//		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//		
//		Restaurant restaurant = context.getBean("restaurant", Restaurant.class);
//		
//		System.out.println(restaurant.name);
//		
//		restaurant.name = "Abc Chains";
//		
//		Restaurant restaurant2 = context.getBean("restaurant", Restaurant.class);
//		
//		System.out.println(restaurant2.name);
//		
//		
//		
//	}
//
//}




//public class Main {
//	
//	public static void main(String[] args) {
//		
//		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//		
//		Restaurant restaurant = context.getBean("restaurant", Restaurant.class);
//		Tea tea = context.getBean("tea", Tea.class);
//		
//		restaurant.placeOrder();
//		tea.prepareTea();
//		
//	}
//
//}

