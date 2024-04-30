import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.annotation.entity.Restaurant;

public class Main {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(com.annotation.config.SpringConfig.class);
		
		System.out.println(context);
		
		Restaurant restaurant = context.getBean("restaurantBean", Restaurant.class);
		
		System.out.println(restaurant.shop+", "+restaurant.name);
	
	}

}
