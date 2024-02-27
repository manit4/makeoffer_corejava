import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
	
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>();
		
		names.add("Jangwei");
		names.add("Rongjing");
		names.add("Gary");
		
//		for(String name : names) {
//			
//			if(name.length() > 5) {
//				
//				System.out.println(name);
//			}
//		}
		
//		names.stream().filter(name -> name.length() > 10).forEach(name -> System.out.println(name));
//		
//		names.stream().map(name -> "My name is "+name).forEach(name -> System.out.println(name));
		
		//List<String> filteredList = names.stream().filter(name -> name.length() > 5).toList();
		
//		for(String name : filteredList) {
//			
//			System.out.println(name);
//		}
		
//		filteredList.forEach(name -> System.out.println(name));
		
		List<Integer> numbers = List.of(10, 20, 30, 40, 40, 30);
		
//		List<Integer> filteredNos = numbers.stream().filter(no -> no % 20 ==0).toList();
//		
//		filteredNos.forEach(no -> System.out.println(no));
		
		
//		numbers.stream().map(no -> no+50).forEach(no -> System.out.println(no));
		
//		long count = numbers.stream().filter(no -> no % 20 ==0).count();
//		
//		System.out.println(count);
		
		//List<Integer> nos = numbers.stream().map(no -> no+50).collect(Collectors.toList());
		
		
		
		//numbers.stream().map(no -> no+50).limit(2).forEach(no -> System.out.println(no));
		
		
		//numbers.stream().map(no -> no+50).distinct().forEach(no -> System.out.println(no));
		
		
		
		numbers.stream().map(no -> no+50).skip(2).forEach(no -> System.out.println(no));
		
		
	}

}
