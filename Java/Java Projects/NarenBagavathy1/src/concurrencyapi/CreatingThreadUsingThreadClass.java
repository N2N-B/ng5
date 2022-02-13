package concurrencyapi;

import java.lang.Thread;

public class CreatingThreadUsingThreadClass extends Thread {
	public void run() {
		System.out.println("Thread created by using thread class");
	}

	public static void main(String[] args) {

		// Whatever we write in here will be executed by main thread
		// threads always execute the jobs in a sequence
		CreatingThreadUsingThreadClass thread = new CreatingThreadUsingThreadClass();
		thread.start();

	}

}

//Thread created by using thread class
//1.Create a class inheriting Thread class
//2.Override run() method
//3.Create object of the class 
//4.Invoke start() method to execute the custom threads run()

//1)void start()	It is used to start the execution of the thread.
//2)void run()	It is used to do an action for a thread.

//A thread is a thread of execution in a program. The Java Virtual Machine allows an application to have multiple threads of execution running concurrently. 