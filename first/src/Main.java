
public class Main {

	public static void main(String[] args) {

		
	}

}

//public class Main {
//
//	public static void main(String[] args) {
//
//		int[][] data = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
//
//		int transposedMatrix[][] = new int[3][3];
//
//		for (int i = 0; i < data.length; i++) {
//
//			for (int j = 0; j < data.length; j++) {
//
//				transposedMatrix[j][i] = data[i][j];
//			}
//		}
//
//		for (int i = 0; i < data.length; i++) {
//
//			for (int j = 0; j < data.length; j++) {
//
//				System.out.print(transposedMatrix[i][j]);
//			}
//			System.out.println();
//		}
//	}
//
//}

//public class Main {
//
//	public static void main(String[] args) {
//
//		//int[][] data = { {3, 21}, {32, 12}, {45, 32} };
//		
//		int[] data[] = new int[3][2];
//		
//		
//		System.out.println(data[0]);
//		System.out.println(data[1]);
//		System.out.println(data[2]);
//		
//		int[] newArray = { 12, 32 };
//		System.out.println(newArray);
//		
//		data[0] = newArray;
//		
//		System.out.println(data[0]);
//	}
//
//}

//public class Main {
//
//	public static void main(String[] args) {
//
//		int salaries[] = { 2000, 1000, 1500, 1000 };
//
//		int newArray[] = new int[4];
//
//		int index = 0;
//
//		for (int i = 0; i < salaries.length; i++) {
//
//			for (int j = 0; j < newArray.length; j++) {
//
//				if (salaries[i] == newArray[j]) {
//					break;
//				} else {
//					if (j == newArray.length-1) {
//						newArray[index] = salaries[i];
//						System.out.println(salaries[i]);
//						index++;
//					}
//				}
//			}
//		}
//
////		for (int salary : newArray) {
////
////			System.out.println(salary);
////		}
//
//	}
//
//}

//
//public class Main {
//
//	public static void main(String[] args) {
//
//		int salaries[] = { 2000, 1000, 1500, 1000 };
//
//		int sum = 0;
//
//		for (int salary : salaries) {
//
//			sum = salary + sum;
//		}
//		
//		System.out.println(sum);
//
//	}
//
//}

//public class Main {
//
//	public static void main(String[] args) {
//		
//		int salaries[] = { 2000, 1000, 1500 };
//		
//		System.out.println(salaries[0]);
//		System.out.println(salaries[1]);
//		System.out.println(salaries[2]);
//		
//		System.out.println(salaries.length);
//		
//	}
//
//}

//public class Main {
//
//	public static void main(String[] args) {
//		
//		int salaries[] = { 2000, 1000, 1500 };
//		
//		System.out.println(salaries[0]);
//		System.out.println(salaries[1]);
//		System.out.println(salaries[2]);
//		
//		System.out.println(salaries.length);
//		
//	}
//
//}

//public class Main {
//
//	public static void main(String[] args) {
//		
//		boolean[] status = new boolean[3];
//		
//		System.out.println(status[0]);
//		System.out.println(status[1]);
//		System.out.println(status[2]);
//		
//	}
//
//}

//public class Main {
//
//	public static void main(String[] args) {
//		
//		int[] salaries = new int[3];
//		
//		System.out.println(salaries[0]);
//		System.out.println(salaries[1]);
//		System.out.println(salaries[2]);
//		
//		salaries[1] = 5000;
//		
//		System.out.println("after setting the array...");
//		
//		System.out.println(salaries[0]);
//		System.out.println(salaries[1]);
//		System.out.println(salaries[2]);
//
//	}
//
//}
