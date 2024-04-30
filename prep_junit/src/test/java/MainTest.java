import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class MainTest {
	
	static Main main;
	
	@BeforeClass
	public static void initialization() {
		
		main = new Main();
	}

	@Test
	public void add() {
		
		int actual = main.add(20, 30);
		
		assertEquals(actual, 50);
	}
	
	@Test
	public void sub() {
		
		int actual = main.sub(20, 30);
		
		assertEquals(actual, -10);
	}
	
	@Test
	public void isEven() {
		
		assertTrue(main.isEven(201));
	}

}
