import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

//Set is another category under Collection interface, set and its implementation classes maintain uniqueness...

class A implements Comparable<A> {

	int i = 4, j = 5;

	@Override
	public int compareTo(A o) {

		int status = 0;

		if (this.i < o.i) {
			status = -1;
		} else if (this.i > o.i) {
			status = 1;
		}
		return status;
	}

}

class SortingJ implements Comparator<A> {

	@Override
	public int compare(A o1, A o2) {

		int status = 0;

		if (o1.j < o2.j) {
			status = -1;
		} else if (o1.j > o2.j) {
			status = 1;
		}
		return status;
	}
}

public class Collection_22 {

	public static void main(String[] args) {

//		Set<A> set = new TreeSet<A>();
//		
//		A a1 = new A();   A a2 = new A();   A a3 = new A();
//		a2.i = 1;   a3.i = 2;
//		
//		set.add(a1);   set.add(a2);    set.add(a3);
//		
//		set.forEach(data->System.out.println("value of is is "+data.i+", value of j is "+data.j));	

		
		
		
		
		
		Set<A> set = new TreeSet<A>(new SortingJ());

		A a1 = new A();
		A a2 = new A();
		A a3 = new A();
		a2.i = 1;   a2.j = -10;
		a3.i = 2;   a3.j = 1;

		set.add(a1);
		set.add(a2);
		set.add(a3);

		set.forEach(data -> System.out.println("value of is is " + data.i + ", value of j is " + data.j));

	}
}

//class A implements Comparable<A>{
//	
//	int i = 4, j = 5;
//
//	@Override
//	public int compareTo(A o) {
//		
//		int status = 0;
//		
//		if(this.i < o.i) {
//			status = -1;
//		}
//		else if(this.i > o.i) {
//			status = 1;
//		}
//		return status;
//	}
//	
//}
//
//public class Collection_22 {
//
//	public static void main(String[] args) {
//
//		Set<A> set = new TreeSet<A>();
//		
//		A a1 = new A();   A a2 = new A();   A a3 = new A();
//		a2.i = 1;   a3.i = 2;
//		
//		set.add(a1);   set.add(a2);    set.add(a3);
//		
//		set.forEach(data->System.out.println("value of is is "+data.i+", value of j is "+data.j));	  
//	}
//}

//class A {
//	
//	int i = 4, j = 5;
//	
//	public boolean equals(Object o) {
//		
//		A a = (A)o;
//		boolean status = false;
//		
//		if(this.i == a.i && this.j == a.j) {
//			status = true;
//		}
//		return status;
//	}
//	
//	public int hashCode() {
//		return 10;
//	}
//}
//
//public class Collection_22 {
//
//	public static void main(String[] args) {
//
//		Set<A> set = new HashSet<A>();
//		
//		  A a1 = new A();    A a2 = new A();    A a3 = new A();
//		  
//		  a3.i = 10;
//		  System.out.println(a1.hashCode());  System.out.println(a2.hashCode());  System.out.println(a3.hashCode());
//		  set.add(a1);    set.add(a2);   set.add(a3);
//		  
//		  set.forEach(data->System.out.println(data.i+", "+data.j));
//	}
//}

//class A {
//	
//	int i = 4, j = 5;
//	
//	public boolean equals(Object o) {
//		
//		A a = (A)o;
//		boolean status = false;
//		
//		if(this.i == a.i && this.j == a.j) {
//			status = true;
//		}
//		return status;
//	}
//	
//	public int hashCode() {
//		return 10;
//	}
//}
//
//public class Collection_22 {
//
//	public static void main(String[] args) {
//
//		Set<A> set = new HashSet<A>();
//		
//		  A a1 = new A();    A a2 = new A();    A a3 = new A();
//		  System.out.println(a1.hashCode());  System.out.println(a2.hashCode());  System.out.println(a3.hashCode());
//		  set.add(a1);    set.add(a2);   set.add(a3);
//		  
//		  set.forEach(data->System.out.println(data.i+", "+data.j));
//	}
//}

//class A {
//	
//	int i = 4, j = 5;
//	
//	public boolean equals(Object o) {
//		
//		A a = (A)o;
//		boolean status = false;
//		
//		if(this.i == a.i && this.j == a.j) {
//			status = true;
//		}
//		return status;
//	}
//}
//
//public class Collection_22 {
//
//	public static void main(String[] args) {
//
//		Set<A> set = new HashSet<A>();
//		
//		A a1 = new A();   A a2 = new A();    A a3 = new A();
//		set.add(a1);  set.add(a2);  set.add(a3);
//		
//		set.forEach(a->System.out.println(a));
//	}
//}

//public class Collection_22 {
//
//	public static void main(String[] args) {
//
//		Set<String> set = new TreeSet<String>();
//		
//		set.add("Manit");
//		set.add("Kiran");
//		set.add("Jaungwei");
//		
//		set.forEach(a->System.out.println(a));
//	}
//}

//class A {
//	
//	int i = 2;
//}
//
//
//public class Collection_22 {
//
//	public static void main(String[] args) {
//
//		
//		Set<A> set = new LinkedHashSet<A>();
//		
//		A a1 = new A();    A a2 = new A();     A a3 = new A();
//		a1.i = 10;    a3.i = 28;
//		set.add(a1);   set.add(a2);   set.add(a3);
//		
//		
//		set.forEach(a->System.out.println(a.i));
//	}
//}

//public class Collection_22 {
//
//	public static void main(String[] args) {
//
//		
//		Set<String> set = new LinkedHashSet<String>();
//		set.add("Manit");
//		set.add("Jaungwei");
//		set.add("Kiran");
//		
//		set.forEach(System.out::println);
//	}
//}

//public class Collection_22 {
//
//	public static void main(String[] args) {
//
//		//HashSet<String> set = new HashSet<String>();//HashMap is unordered and unique...
//		Set<String> set = new HashSet<String>();//here is the better way to keep the object of HashSet
//									//in the reference variable of interface Set....
//		set.add("Manit");
//		set.add("Jaungwei");
//		set.add("Kiran");
//		
//		set.forEach(System.out::println);
//	}
//}

//Vector is another implementation class of List interface. It is a legacy class and is thread safe and 
//holds the same API as ArrayList...

//public class Collection_22 {
//
//	public static void main(String[] args) {
//
//		LinkedList<String> list = new LinkedList<String>();
//		
//		list.add("Manit");   list.add("Rongjing");    list.add("Kiran");
//		list.addFirst("Jaungwei");
//		
//		list.forEach(System.out::println);
//		
//		list.remove();
//		
//		list.forEach(System.out::println);
//		
//	}
//}

//public class Collection_22 {
//
//	public static void main(String[] args) {
//
//		ArrayList<String> list = new ArrayList<String>();
//		list.add("Manit");
//		list.add("Jaungwei");
//		list.add("543");
//		
//		list.forEach(System.out::println);	//This is done with the help of lambdas and streams concept....
//	}
//}

//public class Collection_22 {
//
//	public static void main(String[] args) {
//
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		list.add(2);
//		list.add(4);
//		list.add(6);
////		list.add("Manit");this statement and following 2 more statements are illegal since I am trying to
//						//insert String, boolean and double in collection of Integer type...
////		list.add(true);
////		list.add(12.98);
//		
//		
//	}
//}

//public class Collection_22 {
//
//	public static void main(String[] args) {
//
//		ArrayList list = new ArrayList();//Be default, collection has heterogeneous nature that means it 
//								//can take any data-type value. Keeping mixed data-types values is not good choice
//								//so we make sure that collection holds just 1 type of data....
//		list.add(2);
//		list.add(4);
//		list.add(6);
//		list.add("Manit");
//		list.add(true);
//		list.add(12.98);
//		
//		
//	}
//}

//public class Collection_22 {
//
//	public static void main(String[] args) {
//
//		ArrayList list = new ArrayList();
//		list.add(2);
//		list.add(4);
//		list.add(6);
//		
//		ArrayList list2 = new ArrayList();
//		list2.add(10);
//		list2.add("Manit");
//		list.add("Kiran");
//		
//		list.addAll(list2);
//
//		System.out.println(list);
//		
//		List subList = list.subList(1, 4);
//		System.out.println(subList);
//	}
//}

//public class Collection_22 {
//
//	public static void main(String[] args) {
//
//		ArrayList list = new ArrayList();
//
//		list.add(2);
//		list.add(4);
//		list.add(6);
//
//		for (int i = 0; i < list.size(); i++) {
//
//			System.out.println(list.get(i));
//		}
//		
//		System.out.println("Before removal....");
//
//		//list.remove(1);//here, element from the index 1 will be removed...
//		Integer val = 2;
//		list.remove(val);
//
//		for (int i = 0; i < list.size(); i++) {
//
//			System.out.println(list.get(i));
//		}
//	}
//}

//public class Collection_22 {
//	
//	public static void main(String[] args) {
//		
//		ArrayList list = new ArrayList();
//		
//		list.add(2);
//		list.add(4);
//		list.add(6);
//		
//		list.set(1, 10);
//		
//		for(int i = 0; i < list.size(); i++) {
//			
//			System.out.println(list.get(i));
//		}
//	}
//}

//public class Collection_22 {
//	
//	public static void main(String[] args) {
//		
//		ArrayList list = new ArrayList();
//		
//		list.add(2);
//		list.add(4);
//		list.add(6);
//		
//		for(int i = 0; i < list.size(); i++) {
//			
//			System.out.println(list.get(i));
//		}
//	}
//}

//public class Collection_22 {
//	
//	public static void main(String[] args) {
//		
//		ArrayList list = new ArrayList();
//		
//		list.add(2);
//		list.add(4);
//		list.add(6);
//		
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		System.out.println(list.get(2));
//		
//		
//		list.add(1, 3);
//		
//		System.out.println("The size is "+list.size());
//		System.out.println("Empty or not "+list.isEmpty());
//		
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		System.out.println(list.get(2));
//		System.out.println(list.get(3));
//	}
//}
