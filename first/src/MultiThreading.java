

class Account {
	
	int balance = 50;
	
	int balanceCheck(int amount) {
		
		return balance-amount;
	}
	void withdraw(int amount) {
		
		balance = balance - amount;
	}
}

class MyRunnable implements Runnable {
	
	Account account = new Account();
	
	public void run() {
		withdrawl(50);
			
	}
	
	public void withdrawl(int amount) {
		
		System.out.println("The statement is executed by "+Thread.currentThread().getName());
		System.out.println("The statement is executed by "+Thread.currentThread().getName());
		System.out.println("The statement is executed by "+Thread.currentThread().getName());
		System.out.println("The statement is executed by "+Thread.currentThread().getName());
		
		synchronized (this) {
			if(account.balance >= amount) {
				
				
				account.withdraw(amount);
				System.out.println("Withdrawl  is done by "+Thread.currentThread().getName());
			}
			else {
				System.out.println("You do not have enough money left for "+Thread.currentThread().getName());
			}
		}
		
		System.out.println("After the synchronised block....");
		
		
	}
}


//
//class Account {
//	
//	int balance = 50;
//	
//	int balanceCheck(int amount) {
//		
//		return balance-amount;
//	}
//	void withdraw(int amount) {
//		
//		balance = balance - amount;
//	}
//}
//
//class MyRunnable implements Runnable {
//	
//	Account account = new Account();
//	
//	public void run() {
//		withdrawl(50);
//			
//	}
//	
//	synchronized public void withdrawl(int amount) {
//		
//		System.out.println("The statement is executed by "+Thread.currentThread().getName());
//		System.out.println("The statement is executed by "+Thread.currentThread().getName());
//		System.out.println("The statement is executed by "+Thread.currentThread().getName());
//		System.out.println("The statement is executed by "+Thread.currentThread().getName());
//		
//		if(account.balance >= amount) {
//			
//			
//			account.withdraw(amount);
//			System.out.println("Withdrawl  is done by "+Thread.currentThread().getName());
//		}
//		else {
//			System.out.println("You do not have enough money left for "+Thread.currentThread().getName());
//		}
//	}
//}

public class MultiThreading {
	
	public static void main(String[] args) throws InterruptedException {
		
		MyRunnable runnable = new MyRunnable();
		
		Thread t1 = new Thread(runnable);  t1.setName("Jangwei");
		Thread t2 = new Thread(runnable);  t2.setName("Rongjing");
		t1.start();    t2.start();
	}
}



//class MyRunnable implements Runnable {
//	
//	int sum = 0;
//	
//	public void run() {
//		
//		for(int i = 0; i < 100; i++) {
//			sum = sum + i;
//		}
//	}
//}
//
//public class MultiThreading {
//	
//	public static void main(String[] args) throws InterruptedException {
//		
//		MyRunnable runnable = new MyRunnable();
//		
//		Thread t1 = new Thread(runnable);  t1.setName("kiran");
//		t1.start();
//		
//		t1.join();
//		
//		System.out.println("The sum is "+runnable.sum);	
//	}
//}



//class MyRunnable implements Runnable {
//	
//	int sum = 0;
//	
//	public void run() {
//		
//		for(int i = 0; i < 100; i++) {
//			sum = sum + i;
//		}
//	}
//}
//
//public class MultiThreading {
//	
//	public static void main(String[] args) throws InterruptedException {
//		
//		MyRunnable runnable = new MyRunnable();
//		
//		Thread t1 = new Thread(runnable);  t1.setName("kiran");
//		t1.start();
//		
//		Thread.sleep(10);
//		
//		
//		System.out.println("The sum is "+runnable.sum);	
//	}
//}


//class MyRunnable implements Runnable {
//	
//	public void run() {
//		
//		for(int i = 0; i < 10; i++) {
//			System.out.println("The running thread is "+Thread.currentThread().getName()+" i is "+i);
//		}
//	}
//}
//
//public class MultiThreading {
//	
//	public static void main(String[] args) {
//		
//		MyRunnable runnable = new MyRunnable();
//		
//		Thread t1 = new Thread(runnable);  t1.setName("kiran");
//		Thread t2 = new Thread(runnable);  t2.setName("Jangwei");
//		
//		t1.start();    t2.start();
//		
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		for(int i = 0; i < 100; i++) {
//			System.out.println("The running thread is "+Thread.currentThread().getName()+" i is "+i);
//		}	
//	}
//}


//class MyRunnable implements Runnable {
//	
//	public void run() {
//		
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		for(int i = 0; i < 10; i++) {
//			System.out.println("The running thread is "+Thread.currentThread().getName()+" i is "+i);
//		}
//	}
//}
//
//public class MultiThreading {
//	
//	public static void main(String[] args) {
//		
//		MyRunnable runnable = new MyRunnable();
//		
//		Thread t1 = new Thread(runnable);  t1.setName("kiran");
//		Thread t2 = new Thread(runnable);  t2.setName("Jangwei");
//		
//		t1.start();    t2.start();
//		
//		for(int i = 0; i < 100; i++) {
//			System.out.println("The running thread is "+Thread.currentThread().getName()+" i is "+i);
//		}
//		
//			
//	}
//
//}


//class MyThread extends Thread {
//	
//	public void run() {
//		
//		for(int i = 0; i < 20; i++) {
//			System.out.println("The value of i is "+i);
//		}
//	}
//}
//
//
//public class MultiThreading {
//	
//	public static void main(String[] args) {
//		
//		MyThread t1 = new MyThread();
//		MyThread t2 = new MyThread();
//		
//		t1.start();
//		t2.start();
//			
//	}
//
//}
