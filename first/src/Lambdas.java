import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;


public class Lambdas {

public static void main(String[] args) {
	
	List<String> names = List.of("Rongjing", "Jangwei", "Kiran");
	List<String> newList = new ArrayList<String>();
	
	Consumer<List<String>> consumer = list -> {
		
		for(String name : list) {
		
			if(name.length() > 6) {
				newList.add(name);
			}
		}
	};
	consumer.accept(names);	
	
	for(String name : newList) {
		
		System.out.println(name);
	}
}
}


//public class Lambdas {
//	
//	public static void main(String[] args) {
//		
//		int value = 10;
//		
//		Supplier<Integer> supplier = () -> value; 
//		
//		System.out.println(supplier.get());
//		
//		
//	}
//}


//public class Lambdas {
//	
//	public static void main(String[] args) {
//		
//		List<String> names = List.of("Rongjing", "Jangwei", "Kiran");
//		
//		Consumer<List<String>> consumer = list -> {
//			
//			for(String name : list) {
//			
//				if(name.length() > 6) {
//					System.out.println("Your name is "+name+" and the characters count is "+name.length());
//				}
//				else {
//					System.out.println("Your name is "+name+" and the characters count is "+name.length());
//				}
//			}
//		};
//		
//		consumer.accept(names);	
//	}
//}

//public class Lambdas {
//	
//	public static void main(String[] args) {
//		
////		Function<Integer, Integer> function = val -> val + 50;
////		
////		System.out.println(function.apply(100));
//		
//		Function<Integer, String> function = val -> "The value enetered is "+val;
//		
//		System.out.println(function.apply(1000));
//		
//		
//	}
//}


//class Employe {
//	
//	String name;
//	double salary;
//}
//
//public class Lambdas {
//	
//	public static void main(String[] args) {
//		
//		Employe employee = new Employe();    employee.name = "Manit";  employee.salary = 8000;
//		
//		Predicate<Employe> predicate = emp -> emp.salary > 10000;
//		
//		System.out.println(predicate.test(employee));
//		
//		
//	}
//}


//public class Lambdas {
//	
//	public static void main(String[] args) {
//		
////		Predicate<String> predicate = val -> {
////			
////			boolean status = false;
////			if(val.length() > 5) {
////				status = true;
////			}
////			return status;
////		};
//		
//		Predicate<String> predicate = value -> value.length() > 5;
//		
//		boolean status = predicate.test("Rongjing");
//		System.out.println("Status is "+status);
//	}
//}


//@FunctionalInterface
//interface Cab {
//	
//	public String book(String source, String destination); 
//}
//
//
//public class Lambdas {
//	
//	public static void main(String[] args) {
//		
//		Cab cab = (source, destination) ->  "Your cab is booked from "+source+ " to "+destination;
//		String str = cab.book("Delhi", "Mumbai");
//		
//		System.out.println(str);
//	}
//}


//@FunctionalInterface
//interface Cab {
//	
//	public String book(String source, String destination); 
//}
//
//class Uber implements Cab {
//
//	@Override
//	public String book(String source, String destination) {
//		
//		return "Your cab is booked from "+source+ " to "+destination;
//	}
//	
//	
//}
//
//public class Lambdas {
//	
//	public static void main(String[] args) {
//		
//		Cab cab = new Uber();
//		String str = cab.book("Delhi", "Mumbai");
//		
//		System.out.println(str);
//	}
//}


//@FunctionalInterface
//interface Cab {
//	
//	public void book(String source, String destination); 
//}
//
//public class Lambdas {
//	
//	public static void main(String[] args) {
//		
//		Cab cab = (source, destination) -> System.out.println("Your cab is booked from "+source+" to "+destination);
//		cab.book("New Delhi", "Mumbai");
//		
//	}
//}

//interface Cab {
//	
//	public void book(String source, String destination); 
//}
//
//class Uber implements Cab {
//
//	@Override
//	public void book(String source, String destination) {
//		
//		System.out.println("Your cab is booked from "+source+" to "+destination);
//	}
//}
//
//public class Lambdas {
//	
//	public static void main(String[] args) {
//		
//		Cab cab = new Uber();
//		cab.book("New Delhi", "Mumbai");
//		
//	}
//}




//@FunctionalInterface//this annotation is used to tell other developers that this interface can have just
//					//1 abstract method and not more than 1 but you can have static and default methods
//					//as many as you wish. If you keep more than 1 abstract method in an interface then it is
//					//not a functional interface....
//interface Ab {
//	
//	void tyres();
//	void steeringWheel();//This is illegal since I have annotated Ab interface with @FunctionalInterface
//						//and function interface can have just 1 abstract method....
//	
//}
//
//
//public class Lambdas {
//	
//	public static void main(String[] args) {
//		
//	}
//
//}


//interface Ab {
//	
//	void tyres();
//	void steeringWheel();
//	static void climateControl() {//since java 1.8 onwards, you can have implementation to static methods as well
//								//as default methods....
//		System.out.println("inside climateControl()");
//	}
//	default void abs() {
//		System.out.println("inside abs()");
//	}
//}


//public class Lambdas {
//	
//	public static void main(String[] args) {
//		
//	}
//
//}
