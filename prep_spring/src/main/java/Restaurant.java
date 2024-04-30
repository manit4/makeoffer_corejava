import org.springframework.stereotype.Component;

@Component
public class Restaurant {
	
	public Restaurant() {
		System.out.println("inside no-args Rest constr....");
	}


	
}



//public class Restaurant {
//	
//	public String name;
//	
//	public Restaurant() {
//		System.out.println("inside no-args Rest constr....");
//	}
//
//
//	
//}



//public class Restaurant {
//	
//	private Tea tea;
//	
//	public Restaurant(Tea tea) {
//		super();
//		this.tea = tea;
//		System.out.println("parameterized Rest constr....");
//	}
//
//
//
//	void placeOrder() {
//		
//		tea.prepareTea();
//	}
//}




//public class Restaurant {
//	
//	private Tea tea;
//	
//	public Restaurant() {
//		System.out.println("inside Rest no-args");
//	}
//	
//	public void setTea(Tea tea) {
//		this.tea = tea;
//		System.out.println("inside setter() of Rest");
//	}
//	
//	
//
//	void placeOrder() {
//		
//		tea.prepareTea();
//	}
//}




//public class Restaurant {
//	
//	private String restaurantName; 
//	
//	public Restaurant(String restaurantName) {
//		super();
//		this.restaurantName = restaurantName;
//		System.out.println("inside Paramerized constr...");
//	}
//
//
//
//
//	void placeOrder() {
//		
//		System.out.println("Your Order is Placed by "+restaurantName);
//	}
//}





//public class Restaurant {
//	
//	private String restaurantName; 
//	
//	public Restaurant() {
//		System.out.println("inside Restaurant no-arg constr....");
//	}
//	
//
//	public void setRestaurantName(String restaurantName) {
//		this.restaurantName = restaurantName;
//		System.out.println("inside setter()");
//	}
//
//	void placeOrder() {
//		
//		System.out.println("Your Order is Placed by "+restaurantName);
//	}
//}
