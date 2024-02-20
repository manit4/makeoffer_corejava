package com.offer;//If a class is part of the package then package statement must be the first statement...

//import com.offer.service.*;
//import com.offer.service.UserService;


import com.offer.service.*;


public class Main extends UserService{
	
	public static void main(String[] args) {
		
		
		
	}
	
	void display() {
		
		System.out.println(value);//In this program, I am trying to access the protected member from the
								//different package and directly access is illegal but here I am accessing
								//by making the class Main as subclass(Child) of the UserService(Parent)
	}
}




//public class Main {
//	
//	public static void main(String[] args) {
//		
//		UserService service = new UserService();
//		
//		System.out.println(service.value);//Thsi is illegal since I am trying to access the protected
//							//member from the public class but in different package...
//		
//		
//		
//	}	
//}




//public class Main {
//	
//	public static void main(String[] args) {
//		
//		Car car = new Car();
//		
//		System.out.println(car.getColor());//Here I am tryiny to access the protecetd memeber of the same
//						//package....
//		
//		
//		
//	}	
//}



//import com.offer.service.*;
//
//public class Main {
//	
//	public static void main(String[] args) {
//		
//		
//		UserService service = new UserService();//so here I am trying to create object of default class
//							//from the different package which is denied of "default" keyword...
//		
//		
//	}	
//}



//
//public class Main {
//	
//	public static void main(String[] args) {
//		
//		
//		
//		Car car = new Car();
//		
//		//System.out.println(car.color);//This is illegal since I am trying to access the private variable
//						//out of its class. In short, I am tryimg to access the private "color" property of
//						//Car class from the Main class since private members can be accessed from its
//						//own class....
//		System.out.println(car.getColor());
//		
//	}	
//}




//public class Main {//Here the fully qualified name of the Main class is "com.offer.Main"...
//	
//	public static void main(String[] args) {
//		
//		UserService service = new UserService();
//		
//		System.out.println(service.value);//This is illegal since I am trying to access "value" variable
//							//from the UserService class and UserService class is in different package and the 
//							//variable "value" has default access modifier, the default access modifier has access
//							//only in its own package...
//		
//	}	
//}



//public class Main {//Here the fully qualified name of the Main class is "com.offer.Main"...
//	
//	public static void main(String[] args) {
//		
//		Car car = new Car();
//		
//		System.out.println(car.color);
//		
//	}
//
//	
//}
