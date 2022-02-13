package concurrencyapi;

import java.lang.Thread;

public class CreatingThreadUsingRunnableInterface implements Runnable {
	public void run() {
		System.out.println("Thread created by using runnable interface");
	}

	public static void main(String[] args) {
		// Whatever we write in here will be executed by main thread
		// threads always execute the jobs in a sequence
		Thread thread = new Thread(new CreatingThreadUsingRunnableInterface());
		thread.start();

	}

}

//Thread created by using thread class
//1.Create a class implementing runnable interface
//2.Override run() method
//3.Create object of the class 
//4.Invoke start() method using the object

//1)void start()	It is used to start the execution of the thread.
//2)void run()	It is used to do an action for a thread.

//A thread is a thread of execution in a program. The Java Virtual Machine allows an application to have multiple threads of execution running concurrently. 