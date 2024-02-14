
class A {
	
	static int i = 4;
	
	static void display() {
		
		System.out.println(A.i);
	}		
}

public class ActualJava_14 {
	
	static int i = 6;

	public static void main(String[] args) {
		
		A.display();

	}	
}


//class A {
//	
//	static int i = 4;
//	
//	
//}
//
//class B {
//	
//	static int i = 5;
//	
//}
//
//public class ActualJava_14 {
//	
//	static int i = 6;
//
//	public static void main(String[] args) {
//		
//		System.out.println(A.i);
//		System.out.println(B.i);
//		
//		System.out.println(i);
//
//	}	
//}



//
//class A {
//	
//	int i = 4;
//	
//	void display() {
//		
//		System.out.println("inside display() of A class "+i);
//	}
//}
//
//public class ActualJava_14 {
//
//	public static void main(String[] args) {
//		
//		A a1 = new A();
//		
//		System.out.println(a1.i);
//		
//		a1.display();
//		
//		ActualJava_14 a2 = new ActualJava_14();
//		a2.display();
//
//	}
//	
//	void display() {
//		
//		System.out.println("inside display of Main class");
//	}
//
//}


//class A {
//	
//	int i = 4;
//	
//	void display() {
//		
//		System.out.println("inside display() "+i);
//	}
//}
//
//public class ActualJava_14 {
//
//	public static void main(String[] args) {
//		
//		A a1 = new A();
//		
//		System.out.println(a1.i);
//		
//		a1.display();
//
//	}
//
//}


//class A {
//	
//	int i = 4;
//}
//
//public class ActualJava_14 {
//
//	public static void main(String[] args) {
//		
//		A a1 = new A();
//		
//		System.out.println(a1.i);
//
//	}
//
//}

//public class ActualJava_14 {
//
//	public static void main(String[] args) {
//		
//		ActualJava_14 a1 = new ActualJava_14();
//		
//		add();
//
//	}
//
//	static void add() {
//
//		System.out.println("Inside add() ");
//		
//		sub();
//	}
//	
//	static void sub() {
//		
//		System.out.println("inside sub()");
//	}
//}

//public class ActualJava_14 {
//
//	public static void main(String[] args) {
//		
//		ActualJava_14 a1 = new ActualJava_14();
//		
//		add();
//
//	}
//
//	static void add() {
//
//		System.out.println("Inside add() ");
//		
//		sub();
//	}
//	
//	void sub() {
//		
//		System.out.println("inside sub()");
//	}
//}

//
//public class ActualJava_14 {
//	
//	int i = 4;
//
//	public static void main(String[] args) {
//		
//		ActualJava_14 a1 = new ActualJava_14();
//		
//		a1.add();
//
//	}
//
//	void add() {
//
//		System.out.println("Inside add() "+i);
//		
//		sub();//behind the scene, it is a1.sub()
//	}
//	
//	void sub() {
//		
//		System.out.println("inside sub() "+i);
//	}
//}

//public class ActualJava_14 {
//	
//	int i = 4;
//	static int j = 5;
//
//	public static void main(String[] args) {
//		
//		ActualJava_14 a1 = new ActualJava_14();
//		
//		a1.add();
//
//	}
//
//	void add() {
//
//		System.out.println("inside non-static()...."+i);//inside non-static(), you can access static as 
//												//well as non-static member...
//		System.out.println("inside non-static()...."+j);
//	}
//}

//public class ActualJava_14 {
//	
//	int i = 4;//non-static variable or instance variable
//
//	public static void main(String[] args) {
//		
//		ActualJava_14 a1 = new ActualJava_14();
//		
//		add();
//
//	}
//
//	static void add() {
//
//		System.out.println("inside static()...."+i);//non-static variables are not accessible inside the 
//													//static method
//	}
//}

//public class ActualJava_14 {
//
//	public static void main(String[] args) {
//		
//		add();
//
//	}
//
//	static void add() {
//
//		System.out.println("inside static()....");
//	}
//}

//public class ActualJava_14 {
//	
//	int i = 4, j = 5;//these are instance variable which would be the part of object/instance
//	static int k;//this is class variable which is not going to be the part of object and has 1 copy which
// would be shared across all objects
//
//	public static void main(String[] args) {
//
//		ActualJava_14 a1 = new ActualJava_14();
//		ActualJava_14 a2 = new ActualJava_14();
//		
//		a1.add(); 
//		a2.add();
//	}
//	
//	void add() {
//		
//		k = i + j + k;
//		
//		System.out.println("The k is "+k);
//	}
//}

//public class ActualJava_14 {
//	
//	static int i = 4;
//
//	public static void main(String[] args) {
//
//		System.out.println(i);//you do not need object to call static member(global variable as well
//							//as method), you can directly access...
//	}
//}

//public class ActualJava_14 {
//
//	public static void main(String[] args) {
//
//		ActualJava_14 a1 = new ActualJava_14();
//
//		int i = 4, j = 5;
//
//		int returnedValue = a1.add(i, j);
//		
//		System.out.println("The returnedValue is "+returnedValue);
//	}
//
//	int add(int i, int j) {
//
//		int result = i + j;
//
//		return result;
//	}
//}

//public class ActualJava_14 {
//
//	public static void main(String[] args) {
//
//		ActualJava_14 a1 = new ActualJava_14();
//
//		int i = 4, j = 5;
//
//		a1.add(i, j);//here passed "i and j" are actual parameters/arguments
//	}
//
//	void add(int val1, int val2) {//here "val1 and val2 are formal parameters/arguments
//
//		int result = val1 + val2;
//
//		System.out.println("the Result is " + result);
//	}
//}

//public class ActualJava_14 {
//	
//	int i = 4, j = 5;
//	
//	public static void main(String[] args) {
//		
//		ActualJava_14 a1 = new ActualJava_14();
//		
//		int returnedValue = a1.add();
//		
//		System.out.println(returnedValue);
//			
//	}	
//	
//	int add() {
//		
//		int result = i + j;
//		
//		return result;	
//	}		
//}

//public class ActualJava_14 {
//	
//	int i = 4, j = 5;
//	
//	public static void main(String[] args) {
//		
//		ActualJava_14 a1 = new ActualJava_14();
//		
//		a1.add();
//			
//	}	
//	
//	void add() {
//		
//		int result = i + j;
//		
//		System.out.println("The result is "+result);	
//	}		
//}

//public class ActualJava_14 {
//	
//	int i = 4, j = 5, k;
//	
//	public static void main(String[] args) {
//		
//		ActualJava_14 a1 = new ActualJava_14();
//		
//		a1.add();
//		
//		System.out.println(a1.k);
//			
//	}	
//	
//	void add() {
//		
//		k = i + j;
//	}		
//}

//public class ActualJava_14 {
//	
//	int i = 4, j = 5, k;
//	
//	public static void main(String[] args) {
//		
//		ActualJava_14 a1 = new ActualJava_14();
//		
//		a1.add();
//			
//	}	
//	
//	void add() {
//		
//		k = i + j;
//		
//		System.out.println("The result is "+k);
//	}		
//}

//public class ActualJava_14 {
//	
//	int i = 4;
//	
//	public static void main(String[] args) {
//		
//		ActualJava_14 a1 = new ActualJava_14();
//		
//		a1.add();
//			
//	}	
//	
//	void add() {
//		
//		int i = 5;
//		
//		System.out.println(this.i);
//		System.out.println(i);
//	}
//		
//}

//public class ActualJava_14 {
//	
//	int i = 4;
//	
//	public static void main(String[] args) {
//		
//		ActualJava_14 a1 = new ActualJava_14();
//		
//		System.out.println(a1);
//		
//		a1.add();
//			
//	}	
//	
//	void add() {
//		System.out.println(this);
//	}
//		
//}

//public class ActualJava_14 {
//	
//	int i = 4;
//	
//	public static void main(String[] args) {
//		
//		ActualJava_14 a1 = new ActualJava_14();
//		
//		a1.add();
//		a1.sub();
//		
//	}	
//	
//	void add() {
//		
//		int i = 5;
//		
//		System.out.println("inside add() "+i);
//	}
//	
//	void sub() {
//		
//		System.out.println("inside sub() "+i);
//	}		
//}

//public class ActualJava_14 {
//	
//	int i = 4;
//	
//	public static void main(String[] args) {
//		
//		ActualJava_14 a1 = new ActualJava_14();
//		
//		a1.add();
//		
//	}	
//	
//	void add() {
//		
//		int j = 5;
//		
//		System.out.println("inside add() "+i);
//		System.out.println("inside add() "+j);
//	}
//		
//}

//public class ActualJava_14 {
//	
//	int i = 4;
//	
//	public static void main(String[] args) {
//		
//		ActualJava_14 a1 = new ActualJava_14();
//		ActualJava_14 a2 = new ActualJava_14();
//		
//		a2.i = 10;
//		
//		a1.add();
//		a2.add();
//	}	
//	
//	void add() {
//		
//		System.out.println("inside add() "+i);
//	}
//		
//}

//public class ActualJava_14 {
//	
//	int i = 4;
//	
//	public static void main(String[] args) {
//		
//		ActualJava_14 a1 = new ActualJava_14();
//		
//		System.out.println(a1.i);
//		
//		a1.add();
//	}	
//	
//	void add() {
//		
//		System.out.println("inside add() "+i);//here I am trying to acces "i" which is the instance variable
//												//but not local variable yet no error displayed since behind the
//												//scene, it is "a1.i" since this add() is called upon 
//												//"a1" reference variable...
//	}
//		
//}

//public class ActualJava_14 {
//	
//	int firstNo = 4, secondNo = 5, result;
//	
//	
//	public static void main(String[] args) {
//		
//		ActualJava_14 a1 = new ActualJava_14();
//		
//		ActualJava_14 a2 = new ActualJava_14();
//		
//		a1.result = a1.firstNo + a1.secondNo;
//		System.out.println(a1.result);
//		
//		a2.result = a2.firstNo - a2.secondNo;
//		System.out.println(a2.result);
//	}	
//}

//public class ActualJava_14 {
//	
//	int firstNo = 4, secondNo = 5, result;
//	
//	
//	public static void main(String[] args) {
//		
//		ActualJava_14 a1 = new ActualJava_14();
//		
//		ActualJava_14 a2 = new ActualJava_14();
//		
//		System.out.println(a1.firstNo);
//		System.out.println(a1.secondNo);
//		System.out.println(a1.result);
//		System.out.println(a1);
//		
//		System.out.println(a2.firstNo);
//		System.out.println(a2.secondNo);
//		System.out.println(a2.result);
//		System.out.println(a2);
//	}	
//}

//public class ActualJava_14 {
//	
//	int firstNo = 4, secondNo = 5, result;//if you do not assign value to instance variable then default
//										//value is given on runtime. Here, "result" variable is of int
//										//type and int is given "0" as a default value..
//	
//	
//	public static void main(String[] args) {
//		
//		ActualJava_14 a1 = new ActualJava_14();//You can create any number of objects of any class..
//		ActualJava_14 a2 = new ActualJava_14();
//		//Here I have 2 objects in this program and both the objects have individual copies of instance
//		//variables...	
//	}	
//}

//public class ActualJava_14 {
//	
//	int firstNo = 4, secondNo = 5;
//	
//	
//	public static void main(String[] args) {
//		
//		ActualJava_14 a1 = new ActualJava_14();
//		
//		int result = a1.firstNo + a1.secondNo;//local variables are not given space on objects...
//		
//		System.out.println(result);
//	}	
//}

//public class ActualJava_14 {
//	
////	int firstNo = 4;
////	int secondNo = 5;
////	int result;
//	
//	int firstNo = 4, secondNo = 5, result;
//	
//	
//	public static void main(String[] args) {
//		
//		ActualJava_14 a1 = new ActualJava_14();
//		
//		a1.result = a1.firstNo + a1.secondNo;
//		
//		System.out.println(a1.result);
//	}	
//}

//public class ActualJava_14 {
//	
//	
//	public static void main(String[] args) {
//		
//		int firstNo = 4;
//		int secondNo = 5;
//		
//		int result = firstNo + secondNo;
//		
//		System.out.println(result);
//	}	
//}

//public class ActualJava_14 {
//	
//	int i = 4;//here "i and j" are object variable but the main term for object variable/s is instance variable or state...
//	int j = 5;
//	
//	public static void main(String[] args) {
//		
//		ActualJava_14 a1 = new ActualJava_14();//This statement is creating the object/instance of class "ActualJava_14"
//												//and keeps the address of the location in the reference variable
//												//which is "a1". So this object holds all the variables
//												//declared outside the method/s but inside the class...
//		
//		System.out.println(a1.i);
//		System.out.println(a1.j);
//		
//		System.out.println(a1);
//	}
//
//	
//}
