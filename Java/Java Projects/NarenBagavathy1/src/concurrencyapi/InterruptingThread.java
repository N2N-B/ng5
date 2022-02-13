package concurrencyapi;

public class InterruptingThread extends Thread {
	public void run() {
		try {
			Thread.sleep(1000);
			System.out.println("task");
		} catch (InterruptedException e) {
			throw new RuntimeException("Thread interrupted..." + e);
		}

	}

	public static void main(String args[]) {
		InterruptingThread t1 = new InterruptingThread();
		t1.start();
		try {
			t1.interrupt();
		} catch (Exception e) {
			System.out.println("Exception handled " + e);
		}

	}
}

//Interrupting a Thread:
//If any thread is in sleeping or waiting state (i.e. sleep() or wait() is invoked), calling the interrupt() method on
//the thread, breaks out the sleeping or waiting state throwing InterruptedException. 
//If the thread is not in the sleeping or waiting state, calling the interrupt() method performs normal behaviour and
//doesn't interrupt the thread but sets the interrupt flag to true.
//Let's first see the methods provided by the Thread class for thread interruption.
//
//The 3 methods provided by the Thread class for interrupting a thread
//public void interrupt()
//public static boolean interrupted()
//public boolean isInterrupted()
//Example of interrupting a thread that stops working
//In this example, after interrupting the thread, we are propagating it, so it will stop working. 
//If we don't want to stop the thread, we can handle it where sleep() or wait() method is invoked. 

//What about isInterrupted and interrupted method?
//The isInterrupted() method returns the interrupted flag either true or false.
//The static interrupted() method returns the interrupted flag afterthat it sets the flag to false if it is true.
