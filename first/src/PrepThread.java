
class MyThread extends Thread {

	int total = 0;

	public void run() {

		for (int i = 0; i < 100; i++) {

			total = total + i;
		}
		System.out.println("for loop is finished and the total is "+total);
		
		synchronized (this) {
			this.notify();
		}

		anotherMethod();
	}

	void anotherMethod() {

		try {
			System.out.println("before sleep");
			Thread.sleep(5000);
			System.out.println("after sleep");
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}
}

public class PrepThread {

	public static void main(String[] args) throws InterruptedException {

		MyThread t1 = new MyThread();    t1.start();

		synchronized (t1) {
			t1.wait();
		}

		System.out.println("The total is " + t1.total);

	}
}

//class MyThread extends Thread {
//	
//	int total = 0;
//	
//	public void run() {
//		
//		for(int i = 0; i < 100; i++) {
//			
//			total = total + i;
//		}	
//		
//		anotherMethod();
//	}
//	
//	void anotherMethod() {
//		
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			
//			e.printStackTrace();
//		}
//	}
//}
//
//public class PrepThread {
//	
//	public static void main(String[] args) throws InterruptedException {
//		
//		MyThread t1 = new MyThread();    t1.start();
//		
////		MyThread.sleep(100);
//		
//		t1.join();
//		
//		System.out.println("The total is "+t1.total);
//		
//	}
//}

//class BankAccount {
//	
//	int balance = 50;
//	
//	public void deductBankAccount(int amount) {
//		
//		balance = balance - amount;
//	}
//}
//
//class MyRunnablee implements Runnable {
//	
//	BankAccount account = new BankAccount();
//
//	@Override
//	public void run() {
//		
//		withdraw(50);
//	}
//	 
//	public void withdraw(int amount) {
//		
//		System.out.println("Current Thread is "+Thread.currentThread().getName());
//		System.out.println("Current Thread is "+Thread.currentThread().getName());
//		System.out.println("Current Thread is "+Thread.currentThread().getName());
//		System.out.println("Current Thread is "+Thread.currentThread().getName());
//		System.out.println("Current Thread is "+Thread.currentThread().getName());
//		System.out.println("Current Thread is "+Thread.currentThread().getName());
//		System.out.println("Current Thread is "+Thread.currentThread().getName());
//		System.out.println("Current Thread is "+Thread.currentThread().getName());
//		
//		synchronized (this) {
//		
//			if(account.balance >= amount) {
//				System.out.println(Thread.currentThread().getName()+" has checked the balance and is approved");
//				
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					
//					e.printStackTrace();
//				}
//				account.deductBankAccount(amount);
//				System.out.println(Thread.currentThread().getName()+" has withdrawn and the balance is "+account.balance);
//			}
//			else {
//				System.out.println("sorry "+Thread.currentThread().getName()+" and the balance is "+account.balance);
//			}
//		}
//	}
//	
//}
//
//
//public class PrepThread {
//	
//	public static void main(String[] args) throws InterruptedException {
//		
//		MyRunnablee runnablee = new MyRunnablee();
//		
//		Thread t1 = new Thread(runnablee);   t1.setName("Rong");   t1.start();
//		Thread t2 = new Thread(runnablee);   t2.setName("Jaing");    t2.start();
//		
//	}
//}

//class BankAccount {
//	
//	int balance = 50;
//	
//	public void deductBankAccount(int amount) {
//		
//		balance = balance - amount;
//	}
//}
//
//class MyRunnablee implements Runnable {
//	
//	BankAccount account = new BankAccount();
//
//	@Override
//	public void run() {
//		
//		withdraw(50);
//	}
//	
//	public void atmPinCheck() {
//		
//		System.out.println("Pin Checked....");
//	}
//	
//	public void loogingToFile() {
//		
//		System.out.println("Logging to file....");
//	}
//	 
//	public void withdraw(int amount) {
//		
//		atmPinCheck();
//		
//		loogingToFile();
//			
//				if(account.balance >= amount) {
//					System.out.println(Thread.currentThread().getName()+" has checked the balance and is approved");
//					
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//						
//						e.printStackTrace();
//					}
//					account.deductBankAccount(amount);
//					System.out.println(Thread.currentThread().getName()+" has withdrawn and the balance is "+account.balance);
//				}
//				else {
//					System.out.println("sorry "+Thread.currentThread().getName()+" and the balance is "+account.balance);
//				}
//	}
//	
//}
//
//
//public class PrepThread {
//	
//	public static void main(String[] args) throws InterruptedException {
//		
//		MyRunnablee runnablee = new MyRunnablee();
//		
//		Thread t1 = new Thread(runnablee);   t1.setName("Rong");   t1.start();
//		Thread t2 = new Thread(runnablee);   t2.setName("Jaing");    t2.start();
//		
//	}
//}

//class MyRunnablee implements Runnable {
//
//	@Override
//	public void run() {
//		
//		for(int i = 0; i < 10; i++ ) {
//			
//			System.out.println("i is "+i);
//		}
//	}
//}
//
//
//public class PrepThread {
//	
//	public static void main(String[] args) throws InterruptedException {
//		
//		MyRunnablee runnable = new MyRunnablee();
//		
//		Thread t1 = new Thread(runnable);      t1.start();
//		t1.join();
//		
//		Thread t2 = new Thread(runnable);      t2.start();
//		
//	}
//}

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
//		t1.join();
//		MyThread t2 = new MyThread();      t2.start();	   t2.setName("Gary");
//		
//		t2.join();
//		
//		
//		for(int i = 0; i < 10; i++) {
//			
//			System.out.println(Thread.currentThread().getName()+" and the value of i is "+i);
//		}
//		
//	}
//}

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
