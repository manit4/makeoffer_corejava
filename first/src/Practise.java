import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class Practise extends Object {

	public static void main(String[] args) {
		
		
		
		Supplier<Integer> supplier = () -> {
			
			String name = "Kiran";
			return name.length();
		};
		
		int length = supplier.get();
		
		System.out.println("The length is "+length);
	}
}



//public class Practise extends Object {
//
//	public static void main(String[] args) {
//		
//		Consumer<String> consumer = val -> {
//			
//			System.out.println("The first satement is "+val);
//			System.out.println("The second statement is "+val);
//			
//			System.out.println("The name is "+val);
//			System.out.println("the size is "+val.length());
//		};
//		
//		consumer.accept("Rongjing");
//	}
//}



//class Employeee {
//
//String name;
//int salary;
//}
//
//public class Practise extends Object {
//
//	public static void main(String[] args) {
//		
//		Employeee employee = new Employeee(); 
//		employee.name = "Rongjing";   employee.salary = 7000;
//		
//		Function<Employeee, String> function = obj -> {
//			
//			String status = null;
//			
//			if(obj.salary >4000) {
//				
//				status = obj.name+" is eligible for the bonus amount";
//			}
//			else {
//				status = obj.name+" is not eligibel for the bonus amount";
//			}
//			
//			return status;
//		};
//		
//		String returned = function.apply(employee);
//		System.out.println(returned);
//	}
//}




//class Employeee {
//	
//	String name;
//	int salary;
//}
//
//
//public class Practise extends Object {
//
//	public static void main(String[] args) {
//		
//		Employeee employee = new Employeee(); 
//		employee.name = "Rongjing";   employee.salary = 3000;
//		
//		Predicate<Employeee> predicate = obj -> {
//			
//			boolean status = false;
//			
//			if(obj.salary > 4000) {
//				
//				status = true;
//			}
//			return status;
//		};
//		
//		boolean status = predicate.test(employee);
//		
//		System.out.println(status);
//		
//		
//		
//
//	}
//}



//public class Practise extends Object {
//
//	public static void main(String[] args) {
//		
//		
//		Predicate<Integer> predicate = val -> {
//			if(val >10) {
//				return true;
//			}
//			else {
//				return false;
//			}
//		};
//		
//		boolean status = predicate.test(2);
//		System.out.println(status);
//		
//
//	}
//}




//interface A {
//	
//	public void iterateArray(int[] array);
//}
//
////class B implements A {
////
////	@Override
////	public void iterateArray(int[] array) {
////		
////		for(int val : array) {
////			
////			if(val > 5000) {
////				
////				System.out.println("You are eligible for the bonus and the amount is "+val);
////			}
////		}	
////	}
////}
//
//
//
//public class Practise extends Object {
//
//	public static void main(String[] args) {
//		
//		int salaries[] = {2000, 7000, 3500, 9000};
//		
//		A a = arr -> {
//			
//			for(int val : arr) {
//				
//				if(val > 5000) {
//					
//					System.out.println("You are eligible for the bonus and the amount is "+val);
//				}
//			}
//		};
//		
//		a.iterateArray(salaries);
//
//	}
//}


//interface Cab {
//	
//	public int book(String source, String destination);
//}
//
////class Uber implements Cab {
////
////	@Override
////	public int book(String src, String dest)  {
////		
////		System.out.println("Your cab has been booked from "+src+" to "+dest);
////		
////		return 100;
////	}	
////}
//
//
//
//
//
//
//public class Practise extends Object {
//
//	public static void main(String[] args) {
//
//	Cab uber = (src, dest) -> {
//		
//		System.out.println("Your cab has been booked from "+src+" to "+dest);
//		
//		return 100;
//	};
//			
//	int fare = uber.book("Delhi", "Mumbai");
//	System.out.println("The fare is "+fare);
//	}
//}




//interface Cab {
//	
//	public void book(String source, String destination);
//}
//
////class Uber implements Cab {
////
////	@Override
////	public void book(String src, String dest)  {
////		
////		System.out.println("Your cab has been booked from "+src+" to "+dest);
////	}	
////}
//
//
//
//
//public class Practise extends Object {
//
//	public static void main(String[] args) {
//
//	Cab uber = (src, dest) -> System.out.println("Your cab has been booked from "+src+" to "+dest);
//			
//	uber.book("Delhi", "Mumbai");
//	}
//}


//interface Cab {
//	
//	public void book();
//}
//
////class Uber implements Cab {
////
////	@Override
////	public void book()  {
////		
////		System.out.println("Your cab has been booked...");
////	}	
////}
//
//
//
//
//public class Practise extends Object {
//
//	public static void main(String[] args) {
//
//	Cab uber = () -> System.out.println("Your cab has been booked...");
//	
//	uber.book();
//	}
//}



//@FunctionalInterface
//interface A {
//	
//	void add();
//	
//	static void divide() {
//		System.out.println("inside divide...");
//	}
//	default void multiply() {
//		System.out.println("insdie multiply...");
//	}
//	
//}
//
//public class Practise extends Object {
//
//	public static void main(String[] args) {
//
//		
//	}
//}


//@FunctionalInterface
//interface A {
//	
//	void add();
//	void sub();
//	static void divide() {
//		System.out.println("inside divide...");
//	}
//	default void multiply() {
//		System.out.println("insdie multiply...");
//	}
//	
//}
//
//public class Practise extends Object {
//
//	public static void main(String[] args) {
//
//		
//	}
//}


//interface A {
//	
//	void add();
//	void sub();
//	static void divide() {
//		System.out.println("inside divide...");
//	}
//	default void multiply() {
//		System.out.println("insdie multiply...");
//	}
//	
//}
//
//public class Practise extends Object {
//
//	public static void main(String[] args) {
//
//		
//	}
//}



//public class Practise extends Object {
//
//	public static void main(String[] args) {
//
//		Map<Integer, String> map = new TreeMap<>();
//		
//		map.put(100, "Rongjing");
//		map.put(101, "Kiran");
//		map.put(102, "Jaingwei");
//		map.put(99, "Manit");
//		
//		map.put(103, "Manit");
//		map.put(103, "Manu");
//		
//		
//		map.put(104, null);
//		map.put(105, null);
//		
//
//		
//		for(Map.Entry<Integer, String> entry : map.entrySet()) {
//			
//			System.out.println(entry.getKey()+", "+entry.getValue());
//		}
//		
//		
//		
//	}
//}


//public class Practise extends Object {
//
//	public static void main(String[] args) {
//
//		Map<Integer, String> map = new TreeMap<>();
//		
//		map.put(100, "Rongjing");
//		map.put(101, "Kiran");
//		map.put(102, "Jaingwei");
//		map.put(99, "Manit");
//		
//		map.put(103, "Manit");
//		map.put(103, "Manu");
//		
////		map.put(null, "Bala");
////		map.put(null, "Subramanyam");
//		
//		map.put(104, null);
//		map.put(105, null);
//		
////		System.out.println(map.get(101));
////		
////		System.out.println(map.containsKey(100));
//		
//////		Set<Integer> set = map.keySet();
////		
//////		Iterator<Integer> it = set.iterator();
//////		
//////		while(it.hasNext()) {
//////			System.out.println(map.get(it.next()));
//////		}
//		
//		
//		
////		Set<Integer> set = map.keySet();
////		
////		for(Integer val : set) {
////			System.out.println(map.get(val));
////		}
//		
//		
//		//Set<Map.Entry<Integer, String>> entrySet =  map.entrySet();
//		
//		for(Map.Entry<Integer, String> entry : map.entrySet()) {
//			
//			System.out.println(entry.getKey()+", "+entry.getValue());
//		}
//		
//		
//		
//	}
//}


//class AB  {
//
//	int i = 4, j = 5, k = 6;
//
//	@Override
//	public String toString() {
//		return "AB [i=" + i + ", j=" + j + ", k=" + k + "]";
//	}
//
//}
//
//
//public class Practise extends Object {
//
//	public static void main(String[] args) {
//
//		AB a1 = new AB();     a1.i = 1000;
//		AB a2 = new AB();     a2.j = 40;   
//		AB a3 = new AB();     a3.j = -100;     a3.i = 300;
//
//		Set<AB> set = new HashSet<>();
//		set.add(a1);
//		set.add(a2);
//		set.add(a3);
//
//		for (AB val : set) {
//
//			System.out.println(val);
//		}
//
//		set.forEach(val -> System.out.println(val));
//		
//		Iterator it = set.iterator();
//		
//		while(it.hasNext()) {
//			
//			System.out.println(it.next());
//		}
//		
//	}
//}



//class AB  {
//
//	int i = 4, j = 5, k = 6;
//
//	@Override
//	public String toString() {
//		return "AB [i=" + i + ", j=" + j + ", k=" + k + "]";
//	}
//
//}
//
//
//public class Practise extends Object {
//
//	public static void main(String[] args) {
//
//		AB a1 = new AB();     a1.i = 1000;
//		AB a2 = new AB();     a2.j = 40;   
//		AB a3 = new AB();     a3.j = -100;     a3.i = 300;
//
//		List<AB> list = new ArrayList<>();
//		list.add(a1);
//		list.add(a2);
//		list.add(a3);
//
//		for (AB val : list) {
//
//			System.out.println(val);
//		}
//		
//		for(int i = 0; i < list.size(); i++) {
//			
//			System.out.println(list.get(i));
//		}
//
//		list.forEach(val -> System.out.println(val));
//		
//	}
//}



//class AB implements Comparable<AB> {
//
//	int i = 4, j = 5, k = 6;
//
//	@Override
//	public int compareTo(AB o) {
//		
//		System.out.println("inside compareTo");
//
//		int status = 0;
//
//		if (this.j < o.j) {
//			status = -1;
//		} else if (this.j > o.j) {
//			status = 1;
//		}
//		return status;
//	}
//}
//
//
//
//public class Practise extends Object {
//
//	public static void main(String[] args) {
//
//		AB a1 = new AB();     a1.i = 1000;
//		AB a2 = new AB();     a2.j = 40;   
//		AB a3 = new AB();     a3.j = -100;     a3.i = 300;
//
//		List<AB> list = new ArrayList<>();
//		list.add(a1);
//		list.add(a2);
//		list.add(a3);
//
//		for (AB val : list) {
//
//			System.out.println(val.j + ", " + val.i + ", " + val.k);
//		}
//		
//		Collections.sort(list);
//		
//		System.out.println("After Collections.sort");
//		
//		for (AB val : list) {
//
//			System.out.println(val.j + ", " + val.i + ", " + val.k);
//		}
//	}
//}


//class AB implements Comparable<AB> {
//
//	int i = 4, j = 5, k = 6;
//
//	@Override
//	public int compareTo(AB o) {
//		
//		System.out.println("inside compareTo");
//
//		int status = 0;
//
//		if (this.j < o.j) {
//			status = -1;
//		} else if (this.j > o.j) {
//			status = 1;
//		}
//		return status;
//	}
//}
//
//class IVarComparator implements Comparator<AB> {
//
//	@Override
//	public int compare(AB o1, AB o2) {
//
//		int status = 0;
//
//		if (o1.i < o2.i) {
//			status = -1;
//		} else if (o1.i > o2.i) {
//			status = 1;
//		}
//		return status;
//	}
//}
//
//class KVarComparator implements Comparator<AB> {
//
//	@Override
//	public int compare(AB o1, AB o2) {
//
//		int status = 0;
//
//		if (o1.k < o2.k) {
//			status = -1;
//		} else if (o1.k > o2.k) {
//			status = 1;
//		}
//		return status;
//	}
//}
//
//
//
//public class Practise extends Object {
//
//	public static void main(String[] args) {
//
//		AB a1 = new AB();     a1.i = 1000;
//		AB a2 = new AB();     a2.j = 40;   
//		AB a3 = new AB();     a3.j = -100;     a3.i = 300;
//
//		Set<AB> set = new TreeSet<>(new IVarComparator());
//		set.add(a1);
//		set.add(a2);
//		set.add(a3);
//
//		for (AB val : set) {
//
//			System.out.println(val.j + ", " + val.i + ", " + val.k);
//		}
//	}
//}

//class AB implements Comparable<AB> {
//
//	int i = 4, j = 5, k = 6;
//
//	@Override
//	public int compareTo(AB o) {
//		
//		System.out.println("inside compareTo");
//
//		int status = 0;
//
//		if (this.j < o.j) {
//			status = -1;
//		} else if (this.j > o.j) {
//			status = 1;
//		}
//		return status;
//	}
//}
//
//class IVarComparator implements Comparator<AB> {
//
//	@Override
//	public int compare(AB o1, AB o2) {
//
//		int status = 0;
//
//		if (o1.i < o2.i) {
//			status = -1;
//		} else if (o1.i > o2.i) {
//			status = 1;
//		}
//		return status;
//	}
//}
//
//public class Practise extends Object {
//
//	public static void main(String[] args) {
//
//		AB a1 = new AB();
//		AB a2 = new AB();     a2.j = 40;
//		AB a3 = new AB();     a3.j = -100;
//
//		Set<AB> set = new TreeSet<>();
//		set.add(a1);
//		set.add(a2);
//		set.add(a3);
//
//		for (AB val : set) {
//
//			System.out.println(val.j + ", " + val.i + ", " + val.k);
//		}
//	}
//}

//class AB {
//
//	int i = 4;
//
//	public boolean equals(Object o) {
//
//		AB obj = (AB) o;
//
//		boolean status = false;
//
//		if (this.i == obj.i) {
//
//			status = true;
//		}
//		return status;
//	}
//
//	public int hashCode() {
//
//		return 100;
//	}
//}
//
//public class Practise extends Object {
//
//	public static void main(String[] args) {
//
//		AB a1 = new AB();
//		AB a2 = new AB();      a2.i = 40;
//		AB a3 = new AB();
//		
//		Set<AB> set = new LinkedHashSet<>();
//		set.add(a1);
//		set.add(a2);     
//		set.add(a3);
//
//		for (AB val : set) {
//
//			System.out.println(val);
//		}
//	}
//}

//class AB {
//
//	int i = 4;
//
//	public boolean equals(Object o) {
//
//		AB obj = (AB) o;
//
//		boolean status = false;
//
//		if (this.i == obj.i) {
//
//			status = true;
//		}
//		return status;
//	}
//
//	public int hashCode() {
//
//		return 100;
//	}
//}
//
//public class Practise extends Object {
//
//	public static void main(String[] args) {
//
//		AB a1 = new AB();
//		AB a2 = new AB();      a2.i = 40;
//		AB a3 = new AB();
//		
//		Set<AB> set = new HashSet<>();
//		set.add(a1);
//		set.add(a2);     
//		set.add(a3);
//
//		for (AB val : set) {
//
//			System.out.println(val);
//		}
//	}
//}

//public class Practise extends Object {
//	
//	public static void main(String[] args) {
//
//		Set<String> set = new TreeSet<>();
//		
//		
//		set.add("bcd");
//		set.add("mno");
//		set.add("efg");
//		set.add("abc");
//		set.add("acb");
//		
//		for(String val : set) {
//			
//			System.out.println(val);
//		}
//	}
//			
//}

//class AB {
//
//	int i = 4, j = 5;	
//	
//	public int hashCode() {
//		return 1000;
//	}
//}
//
//public class Practise extends Object {
//	
//	public static void main(String[] args) {
//
//		AB a1 = new AB();    AB a2 = new AB();
//		
//		System.out.println(a1.hashCode());
//		System.out.println(a2.hashCode());
//	}
//			
//}

//class AB extends Object {
//
//	int i = 4, j = 5;
//	
//	public boolean equals(Object o) {
//		
//		boolean status = false;
//		
//		if( this.i == ((AB)o).i) {
//			
//			status = true;
//		}
//		return status;
//	}
//}
//
//public class Practise extends Object {
//	
//	int i = 10;
//
//	public static void main(String[] args) {
//
//		Practise p1 = new Practise();  Practise p2 = new Practise();
//		
//		boolean status = p2.equals(p1);
//		
//		System.out.println(status);
//	}
//	
//	public boolean equals(Object o) {
//		
//		Practise p = (Practise)o;
//		
//		boolean status = false;
//		
//		if( this.i == p.i) {
//			
//			status = true;
//		}
//		return status;
//	}	
//}

//
//class AB extends Object {
//
//	int i = 4, j = 5;
//	
//	public boolean equals(Object o) {
//		
//		boolean status = false;
//		
//		if( this.i == ((AB)o).i) {
//			
//			status = true;
//		}
//		
//		return status;
//	}
//
//}
//
//public class Practise extends Object {
//	
//	int i = 10;
//
//	public static void main(String[] args) {
//
//		AB a1 = new AB();     AB a2 = new AB();
//		
//		boolean status = a1.equals(a2);
//		
//		System.out.println(status);
//		
//
//	}
//
//	
//}

//
//class AB extends Object {
//
//	int i = 4, j = 5, k;
//
//	void displayI() {
//
//		System.out.println("The value of i is");
//	}
//
//	public String toString() {
//
//		return "Hi";
//	}
//}
//
//public class Practise extends Object {
//
//	public static void main(String[] args) {
//
//		AB a1 = new AB();     Practise p1 = new Practise();
//
//		System.out.println(a1);
//		System.out.println(p1);
//
//	}
//
//	public String toString() {
//
//		return "Hello";
//	}
//}

//class AB {
//	
//	int i = 4;
//	
//	void displayI() {
//		
//		System.out.println("The value of i is "+i);
//	}
//	
//}
//
//class BC extends AB{
//	
//	int j = 5;
//	
//	void displayJ() {
//		
//		System.out.println("The value of j is "+j+i);
//	}
//}
//
//public class Practise {
//	
//	public static void main(String[] args) {
//		
//		AB a1 = new AB();    a1.displayI();
//		
//		BC a2 = new BC();    a2.displayI();    a2.displayJ();
//		
//	}
//
//}

//class Human {
//	
//	int height = 1;
//	int iq = 20;
//	
//	public void playingBasketball() {
//		
//		height++;
//	}
//	
//	public void studying() {
//		
//		iq++;
//	}
//}
//
//
//public class Practise {
//	
//	public static void main(String[] args) {
//		
//	}
//
//}
