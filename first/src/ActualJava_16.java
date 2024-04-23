
//class Employee {//In POJo class, all the variables are kept private and the methods(getters and setters) are public
//	
//	private int id;
//	private String name;
//	private double salary;
//	
//	public Employee() {
//		
//	}
//	public Employee(int id, String name, double salary) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.salary = salary;
//	}
//	
//	public void setId(int id) {
//		this.id = id;
//	}
//	public int getId() {
//		return id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public double getSalary() {
//		return salary;
//	}
//	public void setSalary(double salary) {
//		this.salary = salary;
//	}
//}
//
//public class ActualJava_16 {
//	
//	private static int value;
//	
//	public static void main(String[] args) {
//	
//		
//		Employeee rushan = new Employeee(100, "Rushan Shaikh", 10000);
//		Employeee zane = new Employeee(101, "Zane Yu", 15000);
//	
//		//zane.salary = 20000;//this is illegal since I am trying to set the private variable of Employee
//							//class from another class since private member access is in its own class...
//		//ActualJava_16.value = 100;
//	
//		zane.setId(102);   zane.setSalary(25000);    
//		System.out.println(zane.getId());
//		System.out.println(zane.getSalary());
//		
//		
//		
//	}
//}


//class Employee {//Employee class here is POJO(Plane Old Java Object)...
//	
//	int id;
//	String name;
//	double salary;
//	public Employee() {
//		
//	}
//	public Employee(int id, String name, double salary) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.salary = salary;
//	}
//}
//
//public class ActualJava_16 {
//	
//	public static void main(String[] args) {
//	
////		int[] ids = {100, 101, 102};
////		String[] names = {"Manisai", "Gary", "Zane"};
////		double salaries[] = {10000, 20000, 15000};
//		
//		//----------------------------------------//
//		
////		Employee rushan = new Employee();
////		rushan.id = 100;   rushan.name = "Rushan Shaikh";    rushan.salary = 10000;
////		
////		Employee zane = new Employee();
////		zane.id = 101;    zane.name = "Zane Yu";   zane.salary = 20000;
//		
//		
//		Employee rushan = new Employee(100, "Rushan Shaikh", 10000);
//		Employee zane = new Employee(101, "Zane Yu", 15000);
//		
//		//zane.salary = 20000;//this is the bad practise to assign values to the global variables directly
//		System.out.println(zane.salary);
//		
//	}
//}


//class Human {
//	
//	int height = 1;
//	int iq = 10;
//	
//	Human() {
//		
//	}
//	
//	Human(int height, int iq ){
//		this.height = height;
//		this.iq = iq;
//	}
//	
//	void playingBasketBall() {
//		height++;
//	}
//	void study() {
//		iq++;
//	}
//}
//
//public class ActualJava_16 {
//	
//	public static void main(String[] args) {
//	
//		Human manit = new Human(2, 30);
//		System.out.println("height is "+manit.height+" and the iq is "+manit.iq);
//		
//		Human h1 = new Human();
//		System.out.println("height is "+h1.height+" and the iq is "+h1.iq);
//		
//		Human h2 = new Human();
//		System.out.println("height is "+h2.height+" and the iq is "+h2.iq);
//		
//	}
//}

//class Human {
//	
//	int height = 1;
//	int iq = 10;
//	
//	Human(int i, int j ){
//		height = i;
//		iq = j;
//	}
//	
//	void playingBasketBall() {
//		height++;
//	}
//	void study() {
//		iq++;
//	}
//}
//
//public class ActualJava_16 {
//	
//	public static void main(String[] args) {
//	
//		Human manit = new Human(2, 30);
//		System.out.println("height is "+manit.height+" and the iq is "+manit.iq);
//		
//		Human h1 = new Human();//this is illeagl since I am trying to create object of Human class since 
//								//no-argument consructor is given by default only and only if there is
//								//no parametrized constructor available.And if you want no-arg constructor
//								//along with the existing parametrized consructor then you have to
//								//make/define no-arg constructor manually...
//		
//	}
//}


//
//class Human {
//	
//	int height = 1;
//	int iq = 10;
//	
//	void playingBasketBall() {
//		height++;
//	}
//	void study() {
//		iq++;
//	}
//	Human() {//constructor name is as same as the class name and the difference between a method and 
//				//a constructor is that the constructor does not have a return type but method has a return type... 
//		System.out.println("inside Human no-arg constructor...");
//	}
//}
//
//public class ActualJava_16 {
//	
//	public static void main(String[] args) {
//	
//		Human manit = new Human(); 
//		System.out.println(manit);
//		
//	}
//}



//class Human {
//	
//	int height = 1;
//	int iq = 10;
//	
//	void playingBasketBall() {
//		height++;
//	}
//	void study() {
//		iq++;
//	}
//}
//
//public class ActualJava_16 {
//	
//	public static void main(String[] args) {
//	
//		Human manit = new Human(); //here I am trying to create object with the help of no-argument
//									//constructor which is given by default or automatically.
//									//no-argument constructor is the one which does not take any argument while you call...
//		//if you create object with the help of no-argument constructor then the object will have the 
//		//same value as decided by the author of the class.
//		
//		
//	}
//}


//class Human {
//	
//	int height = 1;
//	int iq = 10;
//	
//	void playingBasketBall() {
//		height++;
//	}
//	void study() {
//		iq++;
//	}
//}
//
//public class ActualJava_16 {
//	
//	public static void main(String[] args) {
//	
//		Human manit = new Human();    System.out.println(manit.height);  System.out.println(manit.iq);
//		Human manu = new Human();     System.out.println(manu.height);  System.out.println(manu.iq);
//		
//		manit.playingBasketBall();     manit.study();    manu.playingBasketBall();
//		
//		System.out.println(manit.height);  System.out.println(manit.iq);
//		 System.out.println(manu.height);  System.out.println(manu.iq);
//		
//	}
//}


//interface Employee {
//	
//	void formalTrousers();
//	default void formalShirts() {//here from Java 1.8 onwards, you can give implementation to the method
//							//with the help of default keyword....
//		System.out.println("inside fprmalShirts of Employee");
//	}
//	static void reachOnTime() {//here from Java 1.8 onwards, you can give implementation to the method
//		//with the help of static keyword....
//		System.out.println("inside reachOnTime of Employee");
//	}
//}
//class GoogleEmployee implements Employee {
//
//	@Override
//	public void formalTrousers() {
//		System.out.println("inside formalTrousres() of Googleemployee...");
//		
//	}	
//}
//
//public class ActualJava_16 {
//	
//	public static void main(String[] args) {
//			
//		
//	}
//}


//
//interface Employee {
//	
//	void formalTrousers();
//	default void formalShirts() {//here from Java 1.8 onwards, you can give implementation to the method
//							//with the help of default keyword....
//		System.out.println("inside fprmalShirts of Employee");
//	}
//	static void reachOnTime() {//here from Java 1.8 onwards, you can give implementation to the method
//		//with the help of static keyword....
//		System.out.println("inside reachOnTime of Employee");
//	}
//}
//class GoogleEmployee implements Employee {
//
//	@Override
//	public void formalTrousers() {
//		System.out.println("inside formalTrousres() of Googleemployee...");
//		
//	}	
//}
//
//public class ActualJava_16 {
//	
//	public static void main(String[] args) {
//			
//		
//	}
//}



//interface Employee {
//	
//	int value = 5;
//	//int value2;this is illegal, here you can not leave any variable in an interface empty....
//	
//	abstract void formalShirt();
//	void formalTrousers();
//}
//
//
//
//public class ActualJava_16 {
//	
//	public static void main(String[] args) {
//			
//		Employee.value = 50;//this is illegal since variables in interface are public static and final that means you can not 
//							//re-assign any value to it...
//	}
//}


//interface Employee {
//	
//	abstract void formalShirt();
//	void formalTrousers();
//}
//
//interface ITEmployee extends Employee {//here interface can extend another interface...
//	
//	void bringLaptop();
//}
//
//abstract class Google {//since just Google does not make sense to be instantiated so have made it abstract 
//	
//	void idCard() {
//		System.out.println("inside idCard of Google...");
//	}
//}
//
//class GoogleEmployee extends Google implements ITEmployee {//class can extend another class and implement
//												//interface at the same time....
//	
//	@Override
//	public void formalShirt() {
//		System.out.println("inside formalShirt of GoogleEmployee///");	
//	}
//
//	@Override
//	public void formalTrousers() {
//		System.out.println("inside formalTrousers of GoogleEmployee...");
//	}
//
//	@Override
//	public void bringLaptop() {
//		System.out.println("inside bringLaptop of GogleEmployee...");
//		
//	} 
//}
//
//public class ActualJava_16 {
//	
//	public static void main(String[] args) {
//			
//		
//	}
//}


//interface Employee {
//	
//	abstract void formalShirt();
//	void formalTrousers();
//	
//}
//
//interface ITEmployee {
//	
//	void bringLaptop();
//}
//
//interface MechnicalEmployee {
//	
//	void leatherShoe();
//}
//
//class GoogleEmployee implements Employee, ITEmployee {//class here is implementing 2 interfaces together....
//	
//	@Override
//	public void formalShirt() {
//		System.out.println("inside formalShirt of GoogleEmployee///");	
//	}
//
//	@Override
//	public void formalTrousers() {
//		System.out.println("inside formalTrousers of GoogleEmployee...");
//	}
//
//	@Override
//	public void bringLaptop() {
//		System.out.println("inside bringLaptop of GogleEmployee...");
//		
//	} 
//}
//
//class LnTEmployee implements Employee, MechnicalEmployee {
//	
//	@Override
//	public void formalShirt() {
//		System.out.println("inside formalShirt of GoogleEmployee///");	
//	}
//
//	@Override
//	public void formalTrousers() {
//		System.out.println("inside formalTrousers of GoogleEmployee...");
//	}
//
//	@Override
//	public void leatherShoe() {
//		System.out.println("inside leatherShoe of LnTEmployee");
//	} 
//}
//
//
//public class ActualJava_16 {
//	
//	public static void main(String[] args) {
//			
//		GoogleEmployee employee = new GoogleEmployee();
//		employee.formalShirt();   employee.formalTrousers();  employee.bringLaptop();
//		
//		LnTEmployee employee2 = new LnTEmployee();
//		employee2.formalShirt();   employee2.formalTrousers();   employee2.leatherShoe();
//	}
//}



//interface Employee {
//	
//	abstract void formalShirt();
//	void formalTrousers();
//	
//}
//
//class GoogleEmployee implements Employee {//class implements one interface as well as more than 1 interface
//
//	@Override
//	public void formalShirt() {
//		System.out.println("inside formalShirt of GoogleEmployee///");	
//	}
//
//	@Override
//	public void formalTrousers() {
//		System.out.println("inside formalTrousers of GoogleEmployee...");
//	} 
//	
//}
//
//public class ActualJava_16 {
//	
//	public static void main(String[] args) {
//			
//		GoogleEmployee employee = new GoogleEmployee();
//		employee.formalShirt();   employee.formalTrousers();
//	}
//}



//interface Employee {//interface is as same as class but with all methods unimplemented till 1.7 Java Version...
//	
//	abstract void formalShirt();//all the methods are internally/implicitly/automatically public and abstract
//								//so you do not need to mention abstract keyword with method...
//	void formalTrousers();//here I did not mention abstract keuword with the method since interface'
//						//methods are internally abstract....
//	
//}
//
//public class ActualJava_16 {
//	
//	public static void main(String[] args) {
//			
//			Employee employee = new Employee();//this is illegal since you can not create object of 
//												//an interface but you can have reference variable of
//												//interface type....
//	}
//}



//abstract class Car {
//	
//	int value = 10;//you can have data also in the abstract class...
//	
//	void tyres() {
//		System.out.println("inside tyres of Car...");
//	}
//	abstract void engine();
//}
//
//abstract class HatchBack {
//	
//	abstract void abs();
//	void powerWindow() {
//		System.out.println("inside powerWindow of Sedan...");
//	}
//}
//abstract class SUV {
//	
//	abstract void wideTyres();	
//}
//
//class Polo extends HatchBack {
//
//	void abs() {
//		System.out.println("inside abs() of Polo...");		
//	}
//	void steeringControl() {
//		System.out.println("inside good SteeringWheel of Polo...");
//	}
//}
//
//class BMWX3 extends SUV {
//
//	@Override//this is an annotation which gives extra information to the system...
//	void wideTyres() {
//		System.out.println("inside wideTyres of BMWX3...");
//	}
//}
//
//public class ActualJava_16 {
//	
//	public static void main(String[] args) {
//			
//			
//	}
//}


//abstract class Car {//here, there is no abstract method but you can make that class abstract...so that
//						//no one can make object out of that class
//	
//	void tyres() {
//		System.out.println("inside tyres of Car...");
//	}
//	void musicSystem() {
//		System.out.println("inside musicSystem of Car...");
//	}
//	abstract void engine();
//}
//
//class Polo extends Car {//Here the extending class will have to implement all the un-implemented method
//						//of its abstract parent class if there is any abstract method available in the parent abstract class...
//
//	void engine() {
//		System.out.println("inside engine of Polo");	
//	}	
//}
//class Verna extends Car {//Here the extending class will have to implement all the un-implemented method
//	//of its abstract parent class...
//	void engine() {
//		System.out.println("inside engine of Verna");
//	}
//}
//
//
//public class ActualJava_16 {
//	
//	public static void main(String[] args) {
//		
//		Polo polo = new Polo();     Verna verna = new Verna();
//		Car car = new Polo();     Car car2 = new Verna();//here you can have the reference variable
//												//of abstract parent type but not object
//			
//	}
//}



//abstract class Car {//here, there is no abstract method but you can make that class abstract...so that
//						//no one can make object out of that class
//	
//	void tyres() {
//		System.out.println("inside tyres of Car...");
//	}
//	void musicSystem() {
//		System.out.println("inside musicSystem of Car...");
//	}
//	
//}
//
//class Polo extends Car {//Here the extending class will have to implement all the un-implemented method
//						//of its abstract parent class if there is any un-implemented method in parent abstract class...
//
//	void engine() {
//		System.out.println("inside engine of Polo");	
//	}	
//}
//class Verna extends Car {//Here the extending class will have to implement all the un-implemented method
//	//of its abstract parent class...
//	void engine() {
//		System.out.println("inside engine of Verna");
//	}
//}
//
//
//public class ActualJava_16 {
//	
//	public static void main(String[] args) {
//		
//		Polo polo = new Polo();     Verna verna = new Verna();
//		Car car = new Polo();     Car car2 = new Verna();//here you can have the reference variable
//												//of abstract parent type but not object
//			
//	}
//}


//abstract class Car {
//	
//	void tyres() {
//		System.out.println("inside tyres of Car...");
//	}
//	abstract void musicSystem();//this is abstract method that means you do not have body or business
//								//logic to this method...And if you have atleast 1 method abstract in a 
//								//class then you must make that class abstract also...
//}
//
//
//public class ActualJava_16 {
//	
//	public static void main(String[] args) {
//		
//			//Car car = new Car();//you can not instantiate or create object of an abstract class.... 
//			
//	}
//}


//class Airthmetic {
//	
//	void add(int i, int j ) {
//		System.out.println("The addition of 2 nos is "+(i+j));
//	}
//	int add(int i, int j, int k ) {
//		System.out.println("The addition of 3 nos is "+(i+j+k));
//		return 12;
//	}
//	void add(double d1, double d2 ) {
//		System.out.println(d1+d2);
//	}
//}
//
//
//public class ActualJava_16 {
//	
//	public static void main(String[] args) {
//		
//			Airthmetic airthmetic = new Airthmetic();
//			
//			airthmetic.add(12, 34, 15);
//			airthmetic.add(56, 1);
//			airthmetic.add(23.21, 45.32);
//			
//	}
//}


//class Car {
//	
//	void abs() {
//		System.out.println("inside abs() of Car...");
//	}
//}
//
//class Polo extends Car {
//	
//	void steeringWheel() {
//		System.out.println("inside steeringWheel()...");
//	}
//}
//
//public class ActualJava_16 {
//	
//	public static void main(String[] args) {
//		
//			Car c1 = new Car();   Car c2 = new Car();
//			Polo p1 = new Polo();  Polo p2 = new Polo();
//			
//			 Car[] cars = { p1, c1, c2, p2 };
//			 
//			 for( Car car : cars ) {
//				 
//				 car.abs();
//				 
//				 if( car instanceof Polo ) {
//					 Polo polo = (Polo) car;
//					 polo.steeringWheel();
//				 }
//			 }
//			
//	}
//}


//class Car {
//	
//	void abs() {
//		System.out.println("inside abs() of Car...");
//	}
//}
//
//class Polo extends Car {
//	
//	void steeringWheel() {
//		System.out.println("inside steeringWheel()...");
//	}
//}
//
//public class ActualJava_16 {
//	
//	public static void main(String[] args) {
//		
//			Car car = new Car();     Polo polo = new Polo();     Car car2 = new Polo();
//			
//			boolean status = car instanceof Car;
//			boolean status2 = polo instanceof Polo;
//			boolean status3 = car2 instanceof Polo;
//			
//			System.out.println(status);
//			System.out.println(status2);
//			System.out.println(status3);
//			
//	}
//}


//class Car {
//	
//	void abs() {
//		System.out.println("inside abs() of Car...");
//	}
//}
//
//class Polo extends Car {
//	
//	void steeringWheel() {
//		System.out.println("inside steeringWheel()...");
//	}
//}
//
//public class ActualJava_16 {
//	
//	public static void main(String[] args) {
//		
//			Car c1 = new Car();    Car c2 = new Car();
//			Polo p1 = new Polo();   Polo p2 = new Polo();
//			
//			Car cars[] = { c1, p1, c2, p2 };
//			
//			for( Car car : cars ) {
//				
//				System.out.println(car);
//				
//			}
//			
//	}
//}



//class Car {
//	
//	void abs() {
//		System.out.println("inside abs() of Car...");
//	}
//	String abs2() {
//		return "I am returning something to sysout";
//	}
//}
//
//class Polo {
//	
//	void steeringWheel() {
//		System.out.println("inside steeringWheel()...");
//	}
//}
//
//public class ActualJava_16 {
//	
//	public static void main(String[] args) {
//		
//			Car c1 = new Car();     Car c2 = new Car();
//			Car[] cars = { c1, c2 };
//			
//			Polo p1 = new Polo();    Polo p2 = new Polo();
//			Polo[] polos = { p1, p2 };
//			
//			for( Car car : cars ) {
//				//System.out.println(car);
//				//System.out.println(car.abs());//This is illeagl since Sysout is supposd to print what is fed
//												//to sysout but I am calling "car.abs" from sysout and is 
//												//not returning anything...
//				//car.abs();
//				
//				System.out.println(car.abs2());
//			}
//			
//			for( Polo polo : polos ) {
//				
//				polo.steeringWheel();
//			}
//			
//	}
//}


//class Car {
//	
//	void abs() {
//		System.out.println("inside abs() of Car...");
//	}
//}
//
//public class ActualJava_16 {
//	
//	public static void main(String[] args) {
//		
//		Car c1 = new Car();    Car c2 = new Car();   Car c3 = new Car();
//		
//		Car[] cars = { c1, c2, c3 };
//		
//		for( Car car : cars ) {
//			
//			//System.out.println(car);
//			
//			car.abs();
//		}	
//	}
//}
