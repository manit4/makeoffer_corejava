
//StringBuffer and StringBuilder are real brothers and have the same methods in which StringBuffer is thread safe(check APIs, you
//will see the synchronised keyword with every method) and which makes StringBuffer(thread safe) methods slow. Whereas, StringBuilder
//is not thread safe and is faster than StringBuffer methods....

public class Objectt {

	public static void main(String[] args) {

		StringBuffer str = new StringBuffer("abcd");
		
		str.append("bcd");
		
		System.out.println(str);
		
		str.replace(1, 5, "pqr");
		
		System.out.println(str);
		
		str.reverse();
		
		System.out.println(str);
		
		
	}
}




//public class Objectt {
//
//	public static void main(String[] args) {
//
//		String str1 = "My,name,is,Manit";
//		
//		
//		String splittted[] = str1.split(",");
//		
//		for(String name : splittted) {
//			
//			System.out.println(name);
//		}
//		
//		
//	}
//}

//public class Objectt {
//
//	public static void main(String[] args) {
//
//		String str1 = "My name is Manit";
//		
//		
//		System.out.println(str1.startsWith("bc"));
//		
//
//	}
//}

//public class Objectt {
//
//	public static void main(String[] args) {
//
//		String str1 = "abcdebfbsdcb";
//		
//		String str2 = str1.replace('b', 'z');
//		
//		System.out.println(str2);
//		
//		
//
//	}
//}


//public class Objectt {
//
//	public static void main(String[] args) {
//
//		String str1 = "abcdebfbsdcb";
//		
//		System.out.println(str1.charAt(3));
//		
//		System.out.println(str1.indexOf('e'));
//		
//		System.out.println(str1.indexOf("bc"));
//		
//		System.out.println(str1.lastIndexOf('b'));
//		
//		
//
//	}
//}



//public class Objectt {
//
//	public static void main(String[] args) {
//
//		String str1 = "abc";
//		String str2 = "xyz";
//		String str3 = "abc";
//		String str4 = new String("abc");
//		
//		System.out.println(str1 == str2);
//		System.out.println(str1 == str3);
//		System.out.println(str1 == str4);
//		
//		System.out.println(str1.equals(str4));
//		
//		
//		str2 = str1.substring(1);
//		
//		System.out.println(str1 == str2);
//		
//
//	}
//}



//public class Objectt {
//
//	public static void main(String[] args) {
//
//		String str = "abc";//here I am creating String object with String literal....
//		
//		System.out.println(str.isEmpty());
//		
//		System.out.println(str.length());	
//
//	}
//}


//public class Objectt {
//
//	public static void main(String[] args) {
//
////		char ch[] = {'3', 't', 'e', 'u', 'r', 'w', 'a', '8', '3', '0'};
////		
////		String str = new String(ch);
////		
////		System.out.println(str);
//		
//		
//
//		char ch[] = { '3', 't', 'e', 'u', 'r', 'w', 'a', '8', '3', '0' };
//
//		String str = new String(ch, 2, 6);
//
//		System.out.println(str);
//
//	}
//}

//public class Objectt {
//	
//	public static void main(String[] args) {
//		
//		String str1 = new String("Rongjing");
//		String str2 = new String("Rushan");
//		String str3 = new String("Rongjing");
//		
//		boolean status1 = str1.equals(str2);
//		System.out.println(status1);
//		
//		boolean status2 = str1.equals(str3);
//		System.out.println(status2);
//	}
//}

//public class Objectt {
//	
//	public static void main(String[] args) {
//		
//		String str1 = new String("Rongjing");
//		String str2 = new String("Rushan");
//		String str3 = new String("Rongjing");
//		
//		System.out.println(str1 == str2);
//		System.out.println(str1 == str3);	
//		
//	}
//}

//public class Objectt {
//	
//	public static void main(String[] args) {
//		
//		String str = new String("Rongjing");
//		
//		//System.out.println(str.length());
//		
//		System.out.println(str);//str is the reference variable yet I get the content but not the address
//								//since String class has also overridden the toString() in it...
//		
//		
//		
//	}
//}

//public class Objectt {
//	
//	public static void main(String[] args) {
//		
//		String str = new String();
//		
//		System.out.println("The str is "+str);
//		System.out.println("The length is "+str.length());
//		
//	}
//}

//class B {
//	
//	int i = 4, j = 5, k;
//	
////	public boolean equals(Object o) {
////		
////		B b = (B) o;
////		
////		if(i == b.i) {
////			return true;
////		}
////		else {
////			return false;
////		}
////	}		
//	
//public boolean equals(Object o) {
//		
//		B b = (B) o;
//		
//		if(i == b.i && j == b.j) {
//			return true;
//		}
//		else {
//			return false;
//		}
//	}	
//	
//	
//}
//
//public class Objectt {
//	
//	public static void main(String[] args) {
//		
////		int i = 4;
////		int j = 5;
////		
////		System.out.println(i == j);
//		
////		B b1 = new B();
////		B b2 = new B();
////		
////		System.out.println(b1 == b2);
//		
//		
//		B b1 = new B();    b1.i = 10;
//		B b2 = new B();    b2.i = 10;
//		
//		boolean status = b1.equals(b2);
//		System.out.println(status);	
//		
//	}
//}

//class B {
//	
//	int i = 4, j = 5, k;
//	
//	public String toString() {
//		
//		return "value of i is "+i+", value of j is "+j+ " and the value of k is "+k;
//	}		
//}
//
//
//public class Objectt {
//	
//	int i = 4, j = 5, k;
//	
//	public static void main(String[] args) {
//		
//		Objectt objectt = new Objectt();
//		
//		System.out.println(objectt);
//		
//		B b = new B();
//		System.out.println(b);
//	}
//	
//	public String toString() {
//		return "Values are "+i+", "+j+", "+k;
//	}
//}

//class B {
//	
//	int i = 4, j = 5, k;
//	
//	void add(B b) {
//		
//		k = b.i + j;
//	}
//}
//
//
//public class Objectt {
//	
//	public static void main(String[] args) {
//		
//		B b1 = new B();
//		B b2 = new B();
//		
//		b2.add(b1);
//		
//		System.out.println(b2.k);
//		System.out.println(b1.k);
//		
//		
//	}
//
//}
