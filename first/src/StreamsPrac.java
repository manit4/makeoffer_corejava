import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsPrac {
	
	public static void main(String[] args) {
		
//		List<String> names = new ArrayList<>();
//		
//		names.add("Rongjing");
//		names.add("Jaingwei");
//		names.add("Jaingwei");
//		names.add("Gary");
//		names.add("Kiran");
		
		List<Integer> ages = new ArrayList<>();
		
		ages.add(34);
		ages.add(21);
		ages.add(13);
		ages.add(54);
		
		Optional<Integer> optional = ages.stream().max((age1, age2)-> {
			int value = 0;
			if(age1 < age2) {
				value = -1;
			}
			else if(age1 > age2) {
				value = 1;
			}
			return value;
		});
		
		System.out.println(optional.get());
//		
		
		//ages.stream().filter(age->age>20).count();
		
		
		
//		for(String name : names) {
//			
//			System.out.println("The name is "+ name+" and the size is "+name.length());
//		}
		
//		names.stream().map(name->name+" and the size is "+name.length()).limit(3)
//			.filter(val->val.startsWith("J")).distinct().forEach(v->System.out.println(v));
		
//		long size = names.stream().filter(name->name.length()>5).count();
//		System.out.println(size);
		
		
		
		
//		for(String name : names ) {
//			
//			if( name.length() > 5 ) {
//				
//				System.out.println(name);
//			}
//		}
//		
//		System.out.println("------------After streaming------------");
//		
//		names.stream().filter(name -> name.length() >5).forEach(val->System.out.println(val));
		
		//List<String> filteredNames = new ArrayList<>();
		
//		for(String name : names) {
//			
//			if(name.length() > 5) {
//				
//				filteredNames.add(name);
//			}
//		}
		
		
//		List<String> filteredNames = names.stream().filter(name->name.length()>5).collect(Collectors.toList());
//		
//		System.out.println("The size is "+filteredNames.size());
////		
////		for(String name : filteredNames) {
////			
////			System.out.println(name);
////		}
		
		
		
		
	}

}
