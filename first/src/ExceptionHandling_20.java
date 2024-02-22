import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class ExceptionHandling_20 {

	public static void main(String[] args) throws Exception {
		
		
			askFileName();
	}

	static void askFileName() throws Exception {
		
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter the file name!!");

			String fileName = sc.next();
			
			readCharacter(fileName);
	}

	static void readCharacter(String fileName) throws Exception {

		
			File file = new File(fileName);

			FileReader reader = new FileReader(file);

			System.out.println((char) reader.read());
	}	
}



//public class ExceptionHandling_20 {
//
//	public static void main(String[] args) {
//		
//		try {
//			askFileName();
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		
//	}
//
//	static void askFileName() throws Exception {
//		
//		
//			Scanner sc = new Scanner(System.in);
//
//			System.out.println("Enter the file name!!");
//
//			String fileName = sc.next();
//			
//			readCharacter(fileName);
//	}
//
//	static void readCharacter(String fileName) throws Exception {
//
//		
//			File file = new File(fileName);
//
//			FileReader reader = new FileReader(file);
//
//			System.out.println((char) reader.read());
//	}	
//}



//public class ExceptionHandling_20 {
//
//	public static void main(String[] args) {
//		
//		askFileName();
//	}
//
//	static void askFileName() {
//		
//		try {
//			Scanner sc = new Scanner(System.in);
//
//			System.out.println("Enter the file name!!");
//
//			String fileName = sc.next();
//			
//			readCharacter(fileName);
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	static void readCharacter(String fileName) throws Exception {
//
//		
//			File file = new File(fileName);
//
//			FileReader reader = new FileReader(file);
//
//			System.out.println((char) reader.read());
//	}	
//}

//public class ExceptionHandling_20 {
//
//	public static void main(String[] args) {
//		
//		askFileName();
//	}
//
//	static void askFileName() {
//
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Enter the file name!!");
//
//		String fileName = sc.next();
//		
//		readCharacter(fileName);
//	}
//
//	static void readCharacter(String fileName) {
//
//		try {
//			File file = new File(fileName);
//
//			FileReader reader = new FileReader(file);
//
//			System.out.println((char) reader.read());
//		}
//		catch (Exception e) {
//			System.out.println("insie catch of readCharacter()");
//			e.printStackTrace();
//		}
//	}	
//}

//public class ExceptionHandling_20 {
//
//	public static void main(String[] args) throws Exception {//throws(declared to be thrown) here is basically telling the machine
//						//that you do not care and are not interested in handling the situation... 
//		
//		
//			Scanner sc = new Scanner(System.in);
//			
//			System.out.println("Enter the file name!!");
//			
//			String fileName = sc.next();
//			
//			File file = new File(fileName);
//			
//			FileReader reader = new FileReader(file);
//			
//			System.out.println((char)reader.read());
//		
//	}
//}

////we have 2 types of Exception, checked(compile-time Exception) or unchecked.
////Checked Exceptions are those Exceptions which are not extending the RuntimeException class but extending
//			//the Exception class directly and unchecked Exceptions are thsoe Exceptions which are
//			//extending Runtime Exception directly or indirectly...
//public class ExceptionHandling_20 {
//
//	public static void main(String[] args) {
//		
//		try {
//			Scanner sc = new Scanner(System.in);
//			
//			System.out.println("Enter the file name!!");
//			
//			String fileName = sc.next();
//			
//			File file = new File(fileName);
//			
//			FileReader reader = new FileReader(file);//since this code has input/output code and IO code might generate
//									//CheckedException that is why Runtime Environment forces us to handle(try/catch) the 
//									//code or declared to be thrown(throws keyword)...
//			
//			System.out.println((char)reader.read());
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}	
//
////			Scanner sc = new Scanner(System.in);
////			
////			System.out.println("Enter the divider!!");
////			
////			int divider = sc.nextInt();
////			
////			int no = 10/divider;
////			
////			System.out.println(no);
//	}
//}

//public class ExceptionHandling_20 {//Here is the code for finally following the try block directly...
//
//	public static void main(String[] args) {
//
//		try {
//			
//			Scanner sc = new Scanner(System.in);
//			
//			System.out.println("Enter the divider!!");
//			
//			int divider = sc.nextInt();
//			
//			int no = 10/divider;
//			
//			System.out.println(no);
//		}
//		
//		finally {
//			System.out.println("inside finally block...");
//		}
//	}
//}

////finally is a block and will execute every time whether Exception raised or not....
////try is used to keep the problematic code and followed by catch block or finally block or both together
////catch is executed only if the Exception is raised in the try block
////try can not come alone, try must be followed by either catch or finally or both together....
//
//public class ExceptionHandling_20 {
//
//	public static void main(String[] args) {
//
//		try {
//			
//			Scanner sc = new Scanner(System.in);
//			
//			System.out.println("Enter the divider!!");
//			
//			int divider = sc.nextInt();
//			
//			int no = 10/divider;
//			
//			System.out.println(no);
//		}
//		catch (Exception e) {
//			System.out.println("inside catch block...");
//			e.printStackTrace();
//		}
//		finally {
//			System.out.println("inside finally block...");
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
//			int[] arrays = { 2, 1, 45 };
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
//
//		catch (Exception e) {
//
//			e.printStackTrace();
//
//			System.out.println("inside catch of Exception...");
//
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
