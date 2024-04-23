

class MyThread extends Thread {
	
	@Override
	public void run() {
		
		for(int i = 0; i < 10; i++) {
			
			System.out.println(Thread.currentThread().getName()+" and the value of i is "+i);
		}
	}
}


public class PrepThread {
	
	public static void main(String[] args) throws InterruptedException {
		
		MyThread t1 = new MyThread();      t1.start();     t1.setName("Kiran");
		t1.join();
		MyThread t2 = new MyThread();      t2.start();	   t2.setName("Gary");
		
		t2.join();
		
		
		for(int i = 0; i < 10; i++) {
			
			System.out.println(Thread.currentThread().getName()+" and the value of i is "+i);
		}
		
	}
}




//
//class MyThread extends Thread {
//	
//	@Override
//	public void run() {
//		
//		for(int i = 0; i < 10; i++) {
//			
//			System.out.println(Thread.currentThread().getName()+" and the value of i is "+i);
//		}
//	}
//}
//
//
//public class PrepThread {
//	
//	public static void main(String[] args) throws InterruptedException {
//		
//		MyThread t1 = new MyThread();      t1.start();     t1.setName("Kiran");
//		MyThread t2 = new MyThread();      t2.start();	   t2.setName("Gary");
//		
//		t1.join();
//		t2.join();
//		
//		for(int i = 0; i < 10; i++) {
//			
//			System.out.println(Thread.currentThread().getName()+" and the value of i is "+i);
//		}
//		
//	}
//}




//class MyThread extends Thread {
//	
//	@Override
//	public void run() {
//		
//		for(int i = 0; i < 5; i++) {
//			
//			System.out.println(Thread.currentThread().getName()+" and the value of i is "+i);
//		}
//	}
//}
//
//
//public class PrepThread {
//	
//	public static void main(String[] args) {
//		
//		MyThread t1 = new MyThread();      t1.start();     t1.setName("Kiran");
//		MyThread t2 = new MyThread();      t2.start();	   t2.setName("Gary");
//		
//		try {
//			Thread.sleep(100);
//		} catch (InterruptedException e) {
//			
//			e.printStackTrace();
//		}
//		
//		for(int i = 0; i < 100; i++) {
//			
//			System.out.println(Thread.currentThread().getName()+" and the value of i is "+i);
//		}
//		
//	}
//}


//public class PrepThread {
//	
//	public static void main(String[] args) {
//		
//		System.out.println("insdie main()....");
//		
//		System.out.println("The Thread name is "+Thread.currentThread().getName());
//		
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			
//			e.printStackTrace();
//		}
//		
//		for(int i = 0; i < 10; i++) {
//			
//			System.out.println(i);
//		}
//		
//		
//	}
//}



//class MyThread extends Thread {
//	
//	@Override
//	public void run() {
//		
//		System.out.println(Thread.currentThread().getName());
//		
//		try {
//			
//			if(Thread.currentThread().getName().equals("Gary")) {
//				Thread.sleep(5000);
//			}
//			 
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		for(int i = 0; i < 20; i++) {
//			
//			System.out.println(Thread.currentThread().getName()+" and the value of i is "+i);
//		}
//	}
//}
//
//
//public class PrepThread {
//	
//	public static void main(String[] args) {
//		
//		MyThread t1 = new MyThread();      t1.start();     t1.setName("Kiran");
//		MyThread t2 = new MyThread();      t2.start();	   t2.setName("Gary");
//		
//	}
//}



//class MyThread extends Thread {
//	
//	@Override
//	public void run() {
//		
//		System.out.println("insdie run() of Thread1");
//	}
//}
//
//class MyThread2 extends Thread {
//	
//	@Override
//	public void run() {
//		
//		System.out.println("insdie run() of Thread2");
//	}
//}
//
//public class PrepThread {
//	
//	public static void main(String[] args) {
//		
//		MyThread t1 = new MyThread();      t1.start();
//		MyThread t2 = new MyThread();      t2.start();
//		
//		MyThread2 t3 = new MyThread2();    t3.start();
//	}
//}
