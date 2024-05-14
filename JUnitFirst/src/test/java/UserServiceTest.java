import static org.junit.Assert.*;

import org.junit.Test;

import com.test.service.UserService;

public class UserServiceTest {

//	@Test
//	public void test1() {
//		
//		UserService service = new UserService();
//		
//		assertEquals("User Found", service.findUser("bcd"));
//		
//	}
	
//	@Test(expected = ArithmeticException.class)
//	public void test1() {
//		
//		UserService service = new UserService();
//		
//		assertEquals("User Found", service.findUser("abcgf"));
//		
//	}
	
	@Test(expected = ArithmeticException.class)
	public void test1() {
		
		UserService service = new UserService();
		
		assertEquals("User Found", service.findUser("abcd"));
		
	}

}
