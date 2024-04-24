import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;



class LessThan17NotAllowed extends Exception {

	public LessThan17NotAllowed(String message) {

		super(message);
	}
}

public class PrepException {

	public static void main(String[] args) throws LessThan17NotAllowed{

		Scanner sc = new Scanner(System.in);

		System.out.println("Please Enter your Age!!");

		int age = sc.nextInt();

		
			boolean status = validAge(age);
			
			if (status) {
				System.out.println("welcome to Town Carnival");
			} else {
				System.out.println("Not allowed");
			}
		
	}

	public static boolean validAge(int age) throws LessThan17NotAllowed {

		if (age < 17) {

			throw new LessThan17NotAllowed("Exception occured since the User age is less than 17");
		}

		return true;
	}
}

//class LessThan17NotAllowed extends Exception {
//
//	public LessThan17NotAllowed(String message) {
//
//		super(message);
//	}
//}
//
//public class PrepException {
//
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Please Enter your Age!!");
//
//		int age = sc.nextInt();
//
//		try {
//			boolean status = validAge(age);
//			
//			if (status) {
//				System.out.println("welcome to Town Carnival");
//			} else {
//				System.out.println("Not allowed");
//			}
//		} catch (Exception e) {
//
//			e.printStackTrace();
//		}
//	}
//
//	public static boolean validAge(int age) throws LessThan17NotAllowed {
//
//		if (age < 17) {
//
//			throw new LessThan17NotAllowed("Exception occured since the User age is less than 17");
//		}
//
//		return true;
//	}
//}

//class LessThan17NotAllowed extends RuntimeException {
//	
//	public LessThan17NotAllowed(String message) {
//		
//		super(message);
//	}
//}
//
//public class PrepException {
//
//	public static void main(String[] args) throws IOException {
//
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Please Enter your Age!!");
//
//		int age = sc.nextInt();
//		
//		boolean status = validAge(age);
//		
//		if(status) {
//			System.out.println("welcome to Town Carnival");
//		}
//		else {
//			System.out.println("Not allowed");
//		}
//		
//	}
//
//	public static boolean validAge(int age) {
//
//		if (age < 17) {
//
//			throw new LessThan17NotAllowed("Exception occured since the User age is less than 17");
//		}
//		
//		return true;
//	}
//
//}

//public class PrepException {
//
//	public static void main(String[] args) throws IOException {
//		
//			fileHandling();
//
//	}
//	
//	public static void fileHandling() throws IOException {
//			
//			File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Documents\\EveryoneGotOffer\\workspace\\first\\a.txt");
//			
//			
//			FileReader reader = new FileReader(file);
//			
//			System.out.println((char)reader.read());
//		
//	}
//}

//public class PrepException {
//
//	public static void main(String[] args){
//		
//		try {
//			
//			fileHandling();
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
//
//	}
//	
//	public static void fileHandling() throws IOException {
//			
//			File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Documents\\EveryoneGotOffer\\workspace\\first\\a.txt");
//			
//			
//			FileReader reader = new FileReader(file);
//			
//			System.out.println((char)reader.read());
//		
//	}
//}

//public class PrepException {
//
//	public static void main(String[] args) {
//		
//		fileHandling();
//
//	}
//	
//	public static void fileHandling() {
//		
//		try {
//			
//			File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Documents\\EveryoneGotOffer\\workspace\\first\\a.txt");
//			
//			
//			FileReader reader = new FileReader(file);
//			
//			System.out.println((char)reader.read());
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//}

//public class PrepException {
//
//	public static void main(String[] args) throws IOException{
//		
//		File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Documents\\EveryoneGotOffer\\workspace\\first\\a.txt");
//		
//		
//			FileReader reader = new FileReader(file);
//			
//			System.out.println((char)reader.read());
//			
//		
//		
//
////		int i = 4/0;
////		
////		System.out.println("The value of i is "+i);
//	}
//}

//public class PrepException {
//
//	public static void main(String[] args) {
//		
//		File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Documents\\EveryoneGotOffer\\workspace\\first\\a.txt");
//		
//		try {
//			FileReader reader = new FileReader(file);
//			
//			System.out.println((char)reader.read());
//			
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//		}
//		
//		
//
////		int i = 4/0;
////		
////		System.out.println("The value of i is "+i);
//	}
//}

//public class PrepException {
//
//	public static void main(String[] args) {
//		
//		try {
//			
//			String data = "12ab";
//			
//			int converted = Integer.parseInt(data);
//			
//			System.out.println("the converetd data is "+converted);
//		}
//		catch (Exception e) {
//			System.out.println("catch block");
//			e.printStackTrace();
//		}
//		
//		
//
////		int i = 4/0;
////		
////		System.out.println("The value of i is "+i);
//	}
//}

//public class PrepException {
//
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//
//		try {
//
//			System.out.println("Enter any divider!!");
//			int divider = sc.nextInt();
//
//			int value = 10 / divider;
//
//			System.out.println("the value of i is " + value);
//
//			int[] array = { 23, 11, 45, 678 };
//
//			System.out.println("Enter the index!!");
//			int index = sc.nextInt();
//
//			System.out.println("The value of array is " + array[index]);	
//		}
//
//		catch (Exception e) {
//
//			System.out.println("inside catch....");
//			e.printStackTrace();
//		}
//		finally {
//			sc.close();
//			System.out.println("Scanner is closed from the finally");
//		}
//	}
//}

//public class PrepException {
//
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//
//		try {
//
//			System.out.println("Enter any divider!!");
//			int divider = sc.nextInt();
//
//			int value = 10 / divider;
//
//			System.out.println("the value of i is " + value);
//
//			int[] array = { 23, 11, 45, 678 };
//
//			System.out.println("Enter the index!!");
//			int index = sc.nextInt();
//
//			System.out.println("The value of array is " + array[index]);
//		}
//
//		catch (ArithmeticException e) {
//
//			System.out.println("inside catch of Arithme....");
//			e.printStackTrace();
//			main(null);
//
//		}
//
//		catch (ArrayIndexOutOfBoundsException e) {
//
//			System.out.println("inside catch of ArrayIndex....");
//			e.printStackTrace();
//			main(null);
//		}
//	}
//}

//public class PrepException {
//
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//
//		try {
//
//			System.out.println("Enter any divider!!");
//			int divider = sc.nextInt();
//
//			int value = 10 / divider;
//
//			System.out.println("the value of i is " + value);
//
//			int[] array = { 23, 11, 45, 678 };
//
//			System.out.println("Enter the index!!");
//			int index = sc.nextInt();
//
//			System.out.println("The value of array is " + array[index]);
//		}
//
//		catch (ArithmeticException e) {
//
//			System.out.println("inside catch of Arithme....");
//			e.printStackTrace();
//			main(null);
//
//		}
//
//		catch (ArrayIndexOutOfBoundsException e) {
//
//			System.out.println("inside catch of ArrayIndex....");
//			e.printStackTrace();
//			main(null);
//		}
//	}
//}

//public class PrepException {
//	
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		try {
//			
//			System.out.println("Enter any divider!!");
//			int divider = sc.nextInt();
//			
//			int value = 10/divider;
//			
//			System.out.println("the value of i is "+value);
//		}
//		
//		catch (ArithmeticException e) {
//			
//			System.out.println("inside catch....");
//			e.printStackTrace();
//			main(null);
//			
//		}
//		
//	}
//
//}
