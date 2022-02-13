package concurrencyapi;

//Can we start a thread twice
//No. After starting a thread, it can never be started again. If you does so, an IllegalThreadStateException is 
//thrown. 
//In such case, thread will run once but for second time, it will throw exception.
//IllegalThreadStateException is an unchecked exception.
//
//Let's understand it by the example given below:
public class IllegalThreadStateExceptionDemo extends Thread {

	public void run() {
		System.out.println("running...");
	}

	public static void main(String args[]) {
		IllegalThreadStateExceptionDemo t1 = new IllegalThreadStateExceptionDemo();
		t1.start();
		t1.start();
	}

}
//Output of the program while executing the thread twice
//  running
//Exception in thread "main" java.lang.IllegalThreadStateException