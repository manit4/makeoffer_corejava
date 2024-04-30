import static org.junit.Assert.*;

import org.junit.Test;

public class ActualTest {

	public int add(int i, int j) {
		
		return i + j;
	}
	
	@Test
	public void addTest() {
		
		int actual = add(10, 20);
		
		assertEquals(actual, 29);
	}

}
