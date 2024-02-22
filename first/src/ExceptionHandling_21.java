import java.util.Scanner;

class AgeLessThan17 extends Exception {

	public AgeLessThan17(String msg) {
		super(msg);

	}
}


public class ExceptionHandling_21 {

	public static void main(String[] args) throws Exception {
		
			permissionCheck();

			System.out.println("Last Statement...");
		
	}

	static void permissionCheck() throws Exception {

		
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter your Age!!");

			int age = sc.nextInt();

			if (age < 18) {

				throw new AgeLessThan17("Somebody tried to Enter Age lower than 17");
			} else {

				System.out.println("Welcome to Party Club...");
			}
	}
}




//class AgeLessThan17 extends Exception {
//
//	public AgeLessThan17(String msg) {
//		super(msg);
//
//	}
//}

//public class ExceptionHandling_21 {
//
//	public static void main(String[] args) {
//		
//		try {
//			
//			permissionCheck();
//
//			System.out.println("Last Statement...");
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	static void permissionCheck() throws Exception {
//
//		
//			Scanner sc = new Scanner(System.in);
//
//			System.out.println("Enter your Age!!");
//
//			int age = sc.nextInt();
//
//			if (age < 18) {
//
//				throw new AgeLessThan17("Somebody tried to Enter Age lower than 17");
//			} else {
//
//				System.out.println("Welcome to Party Club...");
//			}
//	}
//}



//class AgeLessThan17 extends Exception {
//
//	public AgeLessThan17(String msg) {
//		super(msg);
//
//	}
//}
//
//public class ExceptionHandling_21 {
//
//	public static void main(String[] args) {
//		
//		permissionCheck();
//
//		System.out.println("Last Statement...");
//	}
//
//	static void permissionCheck() throws Exception {
//
//		
//			Scanner sc = new Scanner(System.in);
//
//			System.out.println("Enter your Age!!");
//
//			int age = sc.nextInt();
//
//			if (age < 18) {
//
//				throw new AgeLessThan17("Somebody tried to Enter Age lower than 17");
//			} else {
//
//				System.out.println("Welcome to Party Club...");
//			}
//	}
//}



//class AgeLessThan17 extends Exception {
//
//	public AgeLessThan17(String msg) {
//		super(msg);
//
//	}
//}
//
//public class ExceptionHandling_21 {
//
//	public static void main(String[] args) throws Exception {
//		
//		permissionCheck();
//
//		System.out.println("Last Statement...");
//	}
//
//	static void permissionCheck() {
//
//		try {
//			Scanner sc = new Scanner(System.in);
//
//			System.out.println("Enter your Age!!");
//
//			int age = sc.nextInt();
//
//			if (age < 18) {
//
//				throw new AgeLessThan17("Somebody tried to Enter Age lower than 17");
//			} else {
//
//				System.out.println("Welcome to Party Club...");
//			}
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//}

//class AgeLessThan17 extends Exception {
//	
//	public AgeLessThan17(String msg) {
//		super(msg);
//		
//	}
//}
//
//public class ExceptionHandling_21 {
//	
//	public static void main(String[] args) throws Exception {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter your Age!!");
//		
//		int age = sc.nextInt();
//		
//		if(age < 18 ) {
//			
//			throw new AgeLessThan17("Somebody tried to Enter Age lower than 17");
//		}
//		else {
//			
//			System.out.println("Welcome to Party Club...");
//		}
//		
//		System.out.println("Last Statement...");
//	}
//
//}

//class AgeLessThan17 extends RuntimeException {
//	
//	public AgeLessThan17(String msg) {
//		super(msg);
//		
//	}
//}
//
//public class ExceptionHandling_21 {
//	
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter your Age!!");
//		
//		int age = sc.nextInt();
//		
//		if(age < 18 ) {
//			
//			//throw new ArithmeticException();
//			//throw new StringIndexOutOfBoundsException();
//			throw new AgeLessThan17("Somebody tried to Enter Age lower than 17");
//		}
//		else {
//			
//			System.out.println("Welcome to Party Club...");
//		}
//		
//		System.out.println("Last Statement...");
//	}
//
//}
