package concurrencyapi;

public class SingleTaskByMultipleThreads extends Thread {
	public void run() {
		System.out.println("task one");
	}

	public static void main(String args[]) {
		SingleTaskByMultipleThreads t1 = new SingleTaskByMultipleThreads();
		SingleTaskByMultipleThreads t2 = new SingleTaskByMultipleThreads();
		SingleTaskByMultipleThreads t3 = new SingleTaskByMultipleThreads();

		t1.start();
		t2.start();
		t3.start();
	}

}

//How to perform single task by multiple threads?
//If you have to perform single task by many threads, use only one run() method in the class.
//Each thread run in a separate callstack.