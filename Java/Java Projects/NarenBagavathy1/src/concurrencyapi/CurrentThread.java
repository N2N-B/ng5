package concurrencyapi;

public class CurrentThread extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String args[]) {
		CurrentThread currentThread1 = new CurrentThread();
		CurrentThread currentThread2 = new CurrentThread();

		currentThread1.start();
		currentThread2.start();
	}

}

//Current Thread
//The currentThread() method returns a reference of currently executing thread.

//public static Thread currentThread()  