package concurrencyapi;

//What if we call run() method directly instead start() method?
//Each thread starts in a separate call stack.
//Invoking the run() method from main thread, the run() method goes onto the current call stack rather than at the beginning of a new call stack.

public class DirectlyCallingRunMethod2 {
	public void run() {
		for (int i = 1; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String args[]) {
		DirectlyCallingRunMethod2 directlyCallingRunMethod1 = new DirectlyCallingRunMethod2();
		DirectlyCallingRunMethod2 directlyCallingRunMethod2 = new DirectlyCallingRunMethod2();

		directlyCallingRunMethod1.run();
		directlyCallingRunMethod2.run();
	}

}

//Problem if you direct call run() method
//
//As you can see in the above program that there is no context-switching because here directlyCallingRunMethod1 and directlyCallingRunMethod2 will be 
//treated as normal object not thread object.

//What Is an InterruptedException?
//An InterruptedException is thrown when a thread is interrupted while it's waiting, sleeping, or otherwise occupied. 
//In other words, some code has called the interrupt() method on our thread. It's a checked exception, and many blocking operations in Java can throw it.