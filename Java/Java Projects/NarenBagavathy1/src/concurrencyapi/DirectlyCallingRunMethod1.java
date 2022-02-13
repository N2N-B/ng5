package concurrencyapi;

//What if we call run() method directly instead start() method?
//Each thread starts in a separate call stack.
//Invoking the run() method from main thread, the run() method goes onto the current call stack rather than 
//at the beginning of a new call stack.

public class DirectlyCallingRunMethod1 extends Thread {
	public void run() {
		System.out.println("running...");
	}

	public static void main(String args[]) {
		DirectlyCallingRunMethod1 directlyCallingRunMethod1 = new DirectlyCallingRunMethod1();
		directlyCallingRunMethod1.run();// fine, but does not start a separate call stack
	}

}
