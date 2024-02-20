//
//class Car {
//	
//	final int i = 4;
//	
//	void steeringWheel() {
//		
//		i = 20;//This is illeagl since I am trying to reassign new value to a final variable...
//		System.out.println("inside steeringWheel of Car...");
//	}
//}
//
//
//
//public class ActualJava_15 {
//
//	public static void main(String[] args) {
//		
//		Car car = new Car();
//		
//		car.i = 10;//This is illeagl since I am trying to reassign new value to a final variable...
//	}
//}


//final class Car {
//	
//	void steeringWheel() {
//		System.out.println("inside steeringWheel of Car...");
//	}
//}
//
//class Polo extends Car {//this is illegal since I am trying to extend the final class...
//
//	void climateControl() {
//		System.out.println("inside climateControl of Polo...");
//	}
//	
//}
//
//public class ActualJava_15 {
//
//	public static void main(String[] args) {
//		
//		
//	}
//}



//class Car {
//	
//	final void steeringWheel() {
//		System.out.println("inside steeringWheel of Car...");
//	}
//}
//
//class Polo extends Car {
//
//	void climateControl() {
//		System.out.println("inside climateControl of Polo...");
//	}
//	void steeringWheel() {//This is illeagl since I am trying to override the final method of Parent class....
//		System.out.println("inside steeringWheel of Polo...");
//	}
//}
//
//public class ActualJava_15 {
//
//	public static void main(String[] args) {
//		
//		
//	}
//}

//class Car {
//	
//	int i = 4;
//
//	void steeringWheel() {
//		System.out.println("inside steeringWheel of Car...");
//	}
//}
//
//class Polo extends Car {
//	
//	int j = 5;
//
//	void climateControl() {
//		System.out.println("inside climateControl of Polo...");
//	}
//}
//
//public class ActualJava_15 {
//
//	public static void main(String[] args) {
//		
//		Car polo = new Polo();    polo.steeringWheel();	
//		System.out.println(polo.i);   
//		Polo polo2 = (Polo) polo;
//		System.out.println(polo2.j);
//	}
//}


//
//class Car {//This is up-casting and is automatic
//
//	void steeringWheel() {
//		System.out.println("inside steeringWheel of Car...");
//	}
//}
//
//class Polo extends Car {
//
//	void climateControl() {
//		System.out.println("inside climateControl of Polo...");
//	}
//}
//
//public class ActualJava_15 {
//
//	public static void main(String[] args) {
//		
//		Polo polo = new Polo();
//		Car car =  polo;//this is upcasting..
//	}
//}


//class Car {//This is down-casting...
//
//	void steeringWheel() {
//		System.out.println("inside steeringWheel of Car...");
//	}
//}
//
//class Polo extends Car {
//
//	void climateControl() {
//		System.out.println("inside climateControl of Polo...");
//	}
//}
//
//public class ActualJava_15 {
//
//	public static void main(String[] args) {
//		
//		Car car2 = new Polo();    car2.steeringWheel();  
//		
//		Polo polo = (Polo) car2;   polo.climateControl();    polo.steeringWheel();
//	}
//}


//class Car {
//
//	void steeringWheel() {
//		System.out.println("inside steeringWheel of Car...");
//	}
//}
//
//class Polo extends Car {
//
//	void climateControl() {
//		System.out.println("inside climateControl of Polo...");
//	}
//}
//
//public class ActualJava_15 {
//
//	public static void main(String[] args) {
//
//		Polo polo = new Polo();   polo.steeringWheel();   polo.climateControl();
//		Car car = new Car();      car.steeringWheel();
//		
//		Car car2 = new Polo();    car2.steeringWheel();      //car2.climateControl();This is illegal since
//										//if we have object of child class type and the reference variable of
//										//parent class type then you must follow this approach. I am calling
//										//climateControl() on "car2" reference variable and "car2" reference
//									//variable is of Car type and this climateControl() must be in the class Car
//									//but in this case we do not see climateControl() in the class Car
//									//and that is why it is an error...
//	}
//}


//class Car {
//
//	void steeringWheel() {
//		System.out.println("inside steeringWheel of Car...");
//	}
//}
//
//class Polo extends Car {
//
//	void climateControl() {
//		System.out.println("inside climateControl of Polo...");
//	}
//}
//
//public class ActualJava_15 {
//
//	public static void main(String[] args) {
//
//		Polo polo = new Polo();//Object of any class can be held by the reference variable of same class...
//		Car car = new Car();  //Object of any class can be held by the reference variable of same class...  
//		
//		Car car2 = new Polo();//but here , object of child is held by the reference variable of Parent class
//	}
//}

//class Car {
//
//	void steeringWheel() {
//		System.out.println("inside steeringWheel of Car...");
//	}
//	void abs() {//This is overridden method
//		System.out.println("inside abs() of Car...");
//	}
//}
//
//class Polo extends Car {
//
//	void climateControl() {
//		System.out.println("inside climateControl of Polo...");
//
//	}
//	void abs() {//this is overridding method, overriding method should have the same name, same return-type
//				//and same method argument list as of parent class...
//		System.out.println("inside abs() of Polo...");
//	}
//}
//
//public class ActualJava_15 {
//
//	public static void main(String[] args) {
//
//		Polo polo = new Polo();  polo.steeringWheel();   polo.climateControl();   polo.abs();
//	}
//}

//class Employee {
//	
//	void checkInCampus() {
//		System.out.println("inside checkInCampus()....");
//	}
//}
//
//class ITEmployee extends Employee{
//	
//	void writeCode() {
//		System.out.println("inside writeCode()....");
//	}
//}
//
//class CivilEmployee extends Employee {
//	
//	void makeBuilding() {
//		System.out.println("inside makeBuilding()....");
//	}
//}
//
//public class ActualJava_15 {
//
//	public static void main(String[] args) {
//
//		
//	}
//}

//class Car {
//	
//	int i = 4;
//	
//	void steeringWheel() {
//		System.out.println("inside steeringWheel of Car..."+i);
//	}
//}
//
//class Polo extends Car {
//	
//	int i = 5;
//	
//	void climateControl() {
//		
//		int i = 6;
//		
//		System.out.println("inside climateControl of Polo..."+super.i);
//		System.out.println("LOcal variable printing "+i);
//		System.out.println("instance variable printing "+this.i);
//	}
//}
//
//public class ActualJava_15 {
//
//	public static void main(String[] args) {
//
//		Polo polo = new Polo();   polo.climateControl();	
//	}
//}

//class Car {
//	
//	int i = 4;
//	
//	void steeringWheel() {
//		System.out.println("inside steeringWheel of Car..."+i);
//	}
//}
//
//class Polo extends Car {
//	
//	int i = 5;
//	
//	void climateControl() {
//		System.out.println("inside climateControl of Polo..."+super.i);
//	}
//}
//
//public class ActualJava_15 {
//
//	public static void main(String[] args) {
//
//		Polo polo = new Polo();   polo.climateControl();	
//	}
//}

//class Car {
//	
//	int i = 4;
//	
//	void steeringWheel() {
//		System.out.println("inside steeringWheel of Car..."+i);
//	}
//}
//
//class Polo extends Car {
//	
//	int i = 5;
//	
//	void climateControl() {
//		System.out.println("inside climateControl of Polo..."+i);
//	}
//}
//
//public class ActualJava_15 {
//
//	public static void main(String[] args) {
//
//		Polo polo = new Polo();   polo.climateControl();	
//	}
//}

//
//class Car {
//	
//	int i = 4;
//	
//	void steeringWheel() {
//		System.out.println("inside steeringWheel of Car..."+i);
//	}
//}
//
//class Polo extends Car {
//	
//	int j = 5;
//	
//	void climateControl() {
//		System.out.println("inside climateControl of Polo..."+i+j);
//	}
//}
//
//
//
//public class ActualJava_15 {
//
//	public static void main(String[] args) {
//
//		Polo polo = new Polo();   polo.climateControl();
//		
//		
//	}
//}

//class Car {
//	
//	int i = 4;
//	
//	void steeringWheel() {
//		System.out.println("inside steeringWheel of Car..."+i);
//	}
//}
//
//class Polo extends Car {
//	
//	int j = 5;
//	
//	void climateControl() {
//		System.out.println("inside climateControl of Polo..."+j);
//	}
//}
//
//
//
//public class ActualJava_15 {
//
//	public static void main(String[] args) {
//
//		
//		
//		
//	}
//}

//class Car {//Car is the Parent of both Polo and Verna class...
//	
//	void steeringWheel() {
//		System.out.println("inside steeringWheel of Car...");
//	}
//}
//
//class Polo extends Car {
//	
//	void climateControl() {
//		System.out.println("inside climateControl of Polo...");
//	}
//}
//
//class Verna extends Car {
//	
//	void antiBraking() {
//		System.out.println("inside antiBraking of Verna...");
//	}
//}
//
//public class ActualJava_15 {
//
//	public static void main(String[] args) {
//
//		Polo polo = new Polo();    polo.climateControl();      polo.steeringWheel();
//		Verna verna = new Verna();    verna.antiBraking();     verna.steeringWheel();
//		
//	}
//}

//class Car {//here class Car is acting as Parent class of Polo but not to Verna class
//	
//	void steeringWheel() {
//		System.out.println("inside steeringWheel of Car...");
//	}
//}
//
//class Polo extends Car {
//	
//	void climateControl() {
//		System.out.println("inside climateControl of Polo...");
//	}
//}
//
//class Verna {
//	
//	void antiBraking() {
//		System.out.println("inside antiBraking of Verna...");
//	}
//}
//
//public class ActualJava_15 {
//
//	public static void main(String[] args) {
//
//		Polo polo = new Polo();    polo.climateControl();      polo.steeringWheel();
//		Verna verna = new Verna();    verna.antiBraking();     //verna.steeringWheel()This is illegal since steeringWheel() is not available in
//																//Verna class as well as not in its parent class which is Class Car....
//		
//	}
//}

//class Car {//Here we have 3 independent classes and there is no inheritance used...
//	
//	void steeringWheel() {
//		System.out.println("inside steeringWheel of Car...");
//	}
//}
//
//class Polo {
//	
//	void climateControl() {
//		System.out.println("inside climateControl of Polo...");
//	}
//}
//
//class Verna {
//	
//	void antiBraking() {
//		System.out.println("inside antiBraking of Verna...");
//	}
//}
//
//public class ActualJava_15 {
//
//	public static void main(String[] args) {
//
//		Polo polo = new Polo();    polo.climateControl();    //polo.steeringWheel();This is illegal since steeringWheel() is not available in Polo class
//		Verna verna = new Verna();    verna.antiBraking();   //verna.steeringWheel();This is illegal since steeringWheel() is not available in Verna class
//		Car car = new Car();     car.steeringWheel();
//	}
//}

//class Polo {
//	
//	void steeringWheel() {
//		System.out.println("inside steeringWheel of Polo...");
//	}
//	void climateControl() {
//		System.out.println("inside climateControl of Polo...");
//	}
//}
//
//class Verna {
//	
//	void steeringWheel() {
//		System.out.println("inside steeringWheel of Verna...");
//	}
//	void antiBraking() {
//		System.out.println("inside antiBraking of Verna...");
//	}
//}
//
//public class ActualJava_15 {
//
//	public static void main(String[] args) {
//
//		Polo polo = new Polo();   polo.steeringWheel();    polo.climateControl();
//		Verna verna = new Verna();   verna.steeringWheel();    verna.antiBraking();
//	}
//}

//class Human {
//
//	int height = 1;
//	double longitude = 12.23;
//	double latitude = 34.12;
//	
//
//	void playingBasketBall() {
//		height++;
//	}
//
//	void walk() {
//		longitude++;
//		latitude++;
//	}
//	
//	static int randomNumber() {
//		
//		return 23;
//	}
//
//}
//
//class Airplane {
//
//	int altitude = 0;
//
////	void takeOff() {
////		altitude = 35000;
////	}
//
//	int takeOff() {
//		altitude = 35000;
//		return altitude;
//	}
//}
//
//public class ActualJava_15 {
//
//	public static void main(String[] args) {
//
//		Human shi = new Human();
//		System.out.println(shi.height);
//		System.out.println(shi.longitude);
//		System.out.println(shi.latitude);
//		
//		System.out.println(Human.randomNumber());
//		
//	}
//}

//class Human {
//
//	int height = 1;
//	double longitude = 12.23;
//	double latitude = 34.12;
//	int altitude = 0;
//
//	void playingBasketBall() {
//		height++;
//	}
//
//	void walk() {
//		longitude++;
//		latitude++;
//	}
//
////	void achieveAltitude() {
////		
////		Airplane airplane = new Airplane();
////		airplane.takeOff();
////		altitude = airplane.altitude;
////	}
//
//	void achieveAltitude() {
//
//		Airplane airplane = new Airplane();
//		altitude = airplane.takeOff();
//		
//	}
//
////	void fly() {
////		altitude++;
////	}
//
//}
//
//class Airplane {
//
//	int altitude = 0;
//
////	void takeOff() {
////		altitude = 35000;
////	}
//
//	int takeOff() {
//		altitude = 35000;
//		return altitude;
//	}
//}
//
//public class ActualJava_15 {
//
//	public static void main(String[] args) {
//
//		Human shi = new Human();
//		System.out.println(shi.height);
//		System.out.println(shi.longitude);
//		System.out.println(shi.latitude);
//		System.out.println(shi.altitude);
//
//		shi.achieveAltitude();
//
//		System.out.println(shi.height);
//		System.out.println(shi.longitude);
//		System.out.println(shi.latitude);
//		System.out.println(shi.altitude);
//	}
//}

class Human {
	
	int height = 1;
	int iq = 20;
	int mascularStrength = 10;
	
	void playingBasketBall() {
		height++;
	}
	void study() {
		iq++;
	}
	void gyming() {
		mascularStrength++;
	}
}


//public class ActualJava_15 {
//	
//	public static void main(String[] args) {
//		
//		Human shi = new Human();
//		Human manit = new Human();
//		
//		System.out.println(shi.height);
//		System.out.println(shi.mascularStrength);
//		System.out.println(shi.iq);
//		
//		System.out.println(manit.height);
//		System.out.println(manit.mascularStrength);
//		System.out.println(manit.iq);
//		
//		shi.study();   shi.study();   shi.study();
//		manit.gyming();   manit.playingBasketBall();   manit.gyming();
//		
//		System.out.println("After state changed by calling different behaviour....");
//		
//		System.out.println(shi.height);
//		System.out.println(shi.mascularStrength);
//		System.out.println(shi.iq);
//		
//		System.out.println(manit.height);
//		System.out.println(manit.mascularStrength);
//		System.out.println(manit.iq);
//		
//	}
//
//}
