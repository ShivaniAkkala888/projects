package multiThreading;

public class GreetingThreadRunner {

	public static void main(String[] args) {
		GreetingRunnable r1 = new GreetingRunnable("Hello");
		GreetingRunnable r2 = new GreetingRunnable ("Goodbye");
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		try {
			t2.sleep(1000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
		t1.start();
		
		
		
	}

}
