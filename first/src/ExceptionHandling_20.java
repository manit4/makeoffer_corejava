import java.util.Scanner;

public class ExceptionHandling_20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {

			System.out.println("Enter divider!!");

			int divider = sc.nextInt();

			int i = 4;

			int result = i / divider;

			System.out.println("The result is " + result);

			String str = "Rongjing";

			System.out.println("Choose the index which you would like to access!!");

			int index = sc.nextInt();

			System.out.println("The character is " + str.charAt(index));

			int[] arrays = { 2, 1, 45 };

			System.out.println("Enter the index of array!!");

			int arrIndex = sc.nextInt();

			System.out.println(arrays[arrIndex]);

		} catch (ArithmeticException e) {

			e.printStackTrace();

			System.out.println("inside catch block....");

			main(null);
		}

		catch (Exception e) {

			e.printStackTrace();

			System.out.println("inside catch of Exception...");

		}
	}
}

//public class ExceptionHandling_20 {
//
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//
//		try {
//
//			System.out.println("Enter divider!!");
//
//			int divider = sc.nextInt();
//
//			int i = 4;
//
//			int result = i / divider;
//
//			System.out.println("The result is " + result);
//
//			String str = "Rongjing";
//
//			System.out.println("Choose the index which you would like to access!!");
//
//			int index = sc.nextInt();
//
//			System.out.println("The character is " + str.charAt(index));
//
//			int[] arrays = { 2, 1, 45 };
//
//			System.out.println("Enter the index of array!!");
//
//			int arrIndex = sc.nextInt();
//
//			System.out.println(arrays[arrIndex]);
//
//		} catch (Exception e) {
//			
//			e.printStackTrace();
//			
//			System.out.println("inside catch of Exception...");
//			
//		} catch (ArithmeticException e) {//This is illeagl since ArithmeticRxception is the child class
//								//Exception of Exception(Parent) class. So Parent class Exception can not 
//								//come before child class Exception since sequence matters in catch block
//								//placement....
//
//			e.printStackTrace();
//
//			System.out.println("inside catch block....");
//
//			main(null);
//		}
//	}
//}

//public class ExceptionHandling_20 {
//
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//
//		try {
//
//			System.out.println("Enter divider!!");
//
//			int divider = sc.nextInt();
//
//			int i = 4;
//
//			int result = i / divider;
//
//			System.out.println("The result is " + result);
//
//			String str = "Rongjing";
//
//			System.out.println("Choose the index which you would like to access!!");
//
//			int index = sc.nextInt();
//
//			System.out.println("The character is " + str.charAt(index));
//			
//			int[] arrays = {2, 1, 45};
//			
//			System.out.println("Enter the index of array!!");
//			
//			int arrIndex = sc.nextInt();
//			
//			System.out.println(arrays[arrIndex]);
//			
//		} catch (ArithmeticException e) {
//
//			e.printStackTrace();
//
//			System.out.println("inside catch block....");
//
//			main(null);
//		}
//		catch (IndexOutOfBoundsException e) {
//			
//			e.printStackTrace();
//			System.out.println("insdie IndexOut catch block....");
//			
//			main(null);
//		}	
//	}
//}

//public class ExceptionHandling_20 {
//
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//
//		try {
//
//			System.out.println("Enter divider!!");
//
//			int divider = sc.nextInt();
//
//			int i = 4;
//
//			int result = i / divider;
//
//			System.out.println("The result is " + result);
//
//			String str = "Rongjing";
//
//			System.out.println("Choose the index which you would like to access!!");
//
//			int index = sc.nextInt();
//
//			System.out.println("The character is " + str.charAt(index));
//			
//			int[] arrays = {2, 1, 45};
//			
//			System.out.println("Enter the index of array!!");
//			
//			int arrIndex = sc.nextInt();
//			
//			System.out.println(arrays[arrIndex]);
//			
//		} catch (ArithmeticException e) {
//
//			e.printStackTrace();
//
//			System.out.println("inside catch block....");
//
//			main(null);
//		}
//		catch (StringIndexOutOfBoundsException e) {
//			
//			e.printStackTrace();
//			System.out.println("insdie StringIndexOut catch block....");
//			
//			main(null);
//		}
//		catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("inside ArrayIndexOutOf catch block....");
//			e.printStackTrace();
//			main(null);
//		}
//	}
//}

//public class ExceptionHandling_20 {
//
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//
//		try {
//
//			System.out.println("Enter divider!!");
//
//			int divider = sc.nextInt();
//
//			int i = 4;
//
//			int result = i / divider;
//
//			System.out.println("The result is " + result);
//
//			String str = "Rongjing";
//
//			System.out.println("Choose the index which you would like to access!!");
//
//			int index = sc.nextInt();
//
//			System.out.println("The character is " + str.charAt(index));
//		} catch (ArithmeticException e) {
//
//			e.printStackTrace();
//
//			System.out.println("inside catch block....");
//
//			main(null);
//		}
//		catch (StringIndexOutOfBoundsException e) {
//			
//			e.printStackTrace();
//			System.out.println("insdie StringIndexOut catch block....");
//			
//			main(null);
//		}
//	}
//}

//public class ExceptionHandling_20 {
//
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//
//		try {
//
//			System.out.println("Enter divider!!");
//
//			int divider = sc.nextInt();
//
//			int i = 4;
//
//			int result = i / divider;
//
//			System.out.println("The result is " + result);
//
//			String str = "Rongjing";
//
//			System.out.println("Choose the index which you would like to access!!");
//
//			int index = sc.nextInt();
//
//			System.out.println("The character is " + str.charAt(index));
//		} catch (ArithmeticException e) {
//
//			e.printStackTrace();
//
//			System.out.println("inside catch block....");
//
//			main(null);
//		}
//	}
//}

//public class ExceptionHandling_20 {
//
//	public static void main(String[] args) {
//
//		divide();
//		
//		findChar();
//		
//	}
//
//	static void divide() {
//
//		try {
//
//			Scanner sc = new Scanner(System.in);
//
//			System.out.println("Enter divider!!");
//
//			int divider = sc.nextInt();
//
//			int i = 4;
//
//			int result = i / divider;
//
//			System.out.println("The result is " + result);
//		} catch (Exception e) {
//			e.printStackTrace();
//			divide();
//		}
//	}
//
//	static void findChar() {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		try {
//			
//			String str = "Rongjing";
//			
//			System.out.println("Choose the index which you would like to access!!");
//			
//			int index = sc.nextInt();
//			
//			System.out.println("The character is "+str.charAt(index));
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//			findChar();
//		}
//	}
//}

//public class ExceptionHandling_20 {
//	
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		try {
//			
//			System.out.println("Enter divider!!");
//			
//			int divider = sc.nextInt();
//			
//			int i = 4;
//			
//			int result = i/divider;
//			
//			System.out.println("The result is "+result);
//			
//			String str = "Rongjing";
//			
//			System.out.println("Choose the index which you would like to access!!");
//			
//			int index = sc.nextInt();
//			
//			System.out.println("The character is "+str.charAt(index));
//		}
//		catch (Throwable e) {
//			
//			e.printStackTrace();
//			
//			System.out.println("inside catch block....");
//			
//			main(null);
//		}
//	}
//}
