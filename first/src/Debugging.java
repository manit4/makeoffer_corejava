
public class Debugging {

	public static void main(String[] args) {

		int resultFinal = 0;
		
		resultFinal = addLoop();

		System.out.println("The Final Result is " + resultFinal);
	}

	public static int addLoop() {
		
		int result = 0;

		for (int i = 0; i < 10; i++) {
			
			if(i%2 == 0) {
				System.out.println("The value of i is "+i);
			}

			result = result + i;
		}
		
		return result;
	}

}
