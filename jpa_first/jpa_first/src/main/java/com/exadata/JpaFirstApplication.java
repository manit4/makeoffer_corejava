package com.exadata;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.exadata.entity.Address;
import com.exadata.entity.Student;
import com.exadata.repository.AddressRepository;
import com.exadata.repository.StudentRepository;
import com.exadata.repository.UserRepository;

@SpringBootApplication
public class JpaFirstApplication implements CommandLineRunner {

	@Autowired
	UserRepository userRepository;

	@Autowired
	StudentRepository studentRepository;

	@Autowired
	AddressRepository addressRepository;

	public static void main(String[] args) {
		SpringApplication.run(JpaFirstApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

//		//User user = new User("man123", "Manit", "1234");
//		//User user = new User("man234", "Manu", "2345");
//		//User user = new User("man345", "Mani", "3456");
//		//User user = new User("man456", "Maneetttt", "4567");
//		User user = new User("man567", "Maneetttt", "4567");
//		User user = new User("man3456", "Mani", "34");
//		userRepository.save(user);
//
//		userRepository.save(user);

//		System.out.println("---------------------");
//		
//		System.out.println(userRepository.count());

//		System.out.println("------------");
//		
//		Optional<User> optional = userRepository.findById("man456");
//		
//		User user = optional.get();
//		
//		System.out.println(user.getUsername()+", "+user.getName()+", "+user.getPassword());

//		System.out.println("------------");
//
//		Optional<User> optional = userRepository.findById("man234");
//
//		if(optional.isPresent()) {
//			
//			User user = optional.get();
//			System.out.println(user.getUsername() + ", " + user.getName() + ", " + user.getPassword());
//		}
//		else {
//			System.out.println("No Records Found....");
//		}

//		System.out.println("------------");
//
//		User user = userRepository.findById("man23467").get();
//		
//		System.out.println(user);

//		List<User> users = userRepository.findAll();
//		
//		//users.forEach(user->System.out.println(user));
//		
//		users.stream().filter(user-> user.getName().length() > 4).forEach(user->System.out.println(user));

//		System.out.println("--------");
//		
//		List<User> users = userRepository.findByName("Mani");
//		
//		users.forEach(System.out::println);

//		System.out.println("--------");
//		
//		List<User> user = userRepository.findDistinctByName("Mani");
//		System.out.println(user);

//		System.out.println("--------");
//
//		List<User> users = userRepository.findByNameLessThan("Mani");
//		System.out.println(users);

//		System.out.println("----------");
//		
//		List<User> users = userRepository.findByPasswordLessThan("3000");
//
//		System.out.println(users);

//		System.out.println("----------");
//
//		List<User> users = userRepository.pullAllData();
//
//		System.out.println(users);

//		System.out.println("----------");
//
//		List<User> users = userRepository.pullDataByName("Maneetttt");
//
//		System.out.println(users);

//		System.out.println("----------");
//
//		List<User> users = userRepository.pullDataByNameAndPassword("Mani", "34");
//
//		System.out.println(users);

//		System.out.println("----------");
//
//		List<User> users = userRepository.getUserByPasswordLessThan("4567");
//
//		System.out.println(users);

//		System.out.println("----------");
//
//		Address address = new Address();  address.setAddress_id(1);  address.setCity("Tokyo");
//		Student student = new Student();  student.setId(100);  student.setName("Manit");  student.setPassword("123");
//		student.setAddress(address);
//		address.setStudent(student);
//		
//		studentRepository.save(student);

//		System.out.println("----------");
//
//		Address address = new Address();  address.setAddress_id(2);  address.setCity("New York");
//		Student student = new Student();  student.setId(101);  student.setName("Manu");  student.setPassword("234");
//		student.setAddress(address);
//		address.setStudent(student);
//		
//		studentRepository.save(student);

//		System.out.println("----------");
//
//		Optional<Student> optional = studentRepository.findById(101);
//		
//		if(optional.isPresent()) {
//			
//			Student student = optional.get();
//			System.out.println(student.getId()+", "+student.getName()+", "+student.getPassword());
//			
//			
//			Address address = student.getAddress();
//			System.out.println(address.getAddress_id()+", "+address.getCity());
//		}

//		System.out.println("----------");
//
//		
//		Optional<Address> optional = addressRepository.findById(1);
//		
//		if(optional.isPresent()) {
//			Address address = optional.get();
//			System.out.println(address.getAddress_id()+", "+address.getCity());
//			
//			Student student = address.getStudent();
//			System.out.println(student.getId()+", "+student.getName()+", "+student.getPassword());
//		}

//		System.out.println("--------------");
//		
//		Student student = new Student();   student.setId(100);  student.setName("Manit");  student.setPassword("123");
//		
//		Address address1 = new Address();  address1.setAddress_id(1);   address1.setCity("New York");  address1.setStudent(student);
//		Address address2 = new Address();  address2.setAddress_id(2);   address2.setCity("Shanghai");  address2.setStudent(student);
//		
//		List<Address> addresses = new ArrayList<Address>();   addresses.add(address1);   addresses.add(address2);
//		
//		student.setAddress(addresses);
//		
//		
//		studentRepository.save(student);

		System.out.println("--------------");

		Optional<Student> optional = studentRepository.findById(100);

		if (optional.isPresent()) {

			Student student = optional.get();

			System.out.println(student.getId() + ", " + student.getName() + ", " + student.getPassword());

			List<Address> addresses = student.getAddress();

			addresses.forEach(studentt -> System.out.println(studentt.getAddress_id() + ", " + studentt.getCity()));
		}

	}

}
