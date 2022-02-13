package concurrencyapi;

public class DeadLock {

	public static void main(String[] args) {
	    final String object1 = "Naren";
		final String object2 = "Prashanth";
		
		// t1 tries to lock object1 then object2
		
		Thread t1 = new Thread() {
			public void run() {
				synchronized (object1) {
					System.out.println("Thread 1: locked resource 1");

					try {
						Thread.sleep(100);
					} catch (Exception e) {
					}

					synchronized (object2) {
						System.out.println("Thread 1: locked resource 2");
					}
				}
			}
		};

		// t2 tries to lock object2 then object1
		Thread t2 = new Thread() {
			public void run() {
				synchronized (object2) {
					System.out.println("Thread 2: locked resource 2");

					try {
						Thread.sleep(100);
					} catch (Exception e) {
					}

					synchronized (object1) {
						System.out.println("Thread 2: locked resource 1");
					}
				}
			}
		};

		t1.start();
		t2.start();
	}

}

//Deadlock in java
//Deadlock in java is a part of multithreading. 
//Deadlock can occur in a situation when a thread is waiting for an object lock, that is acquired by another thread and 
//second thread is waiting for an object lock that is acquired by first thread.
//Since, both threads are waiting for each other to release the lock, the condition is called deadlock.