package concurrencyapi;

import java.lang.Thread;
import java.lang.ThreadGroup;
//ThreadGroup in Java
//Java provides a convenient way to group multiple threads in a single object. In such way, we can suspend, resume or interrupt group of threads by a single method call.
//
//Note: Now suspend(), resume() and stop() methods are deprecated.
//Java thread group is implemented by java.lang.ThreadGroup class.

//Constructors of ThreadGroup class
//There are only two constructors of ThreadGroup class.
//
//No.	Constructor	                                    Description
//1)	ThreadGroup(String name)	                    creates a thread group with given name.
//2)	ThreadGroup(ThreadGroup parent, String name)	creates a thread group with given parent group and name.

public class ThreadGroupDemo implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		ThreadGroupDemo runnable = new ThreadGroupDemo();
		ThreadGroup tg1 = new ThreadGroup("Parent ThreadGroup");

		Thread t1 = new Thread(tg1,runnable,"one");
		t1.start();
		Thread t2 = new Thread(tg1,runnable,"two");
		t2.start();
		Thread t3 = new Thread(tg1,runnable,"three");
		t3.start();

		System.out.println("Thread Group Name: " + tg1.getName());
		tg1.list();

	}

}

//	list()	This method prints information about the thread group to the standard output.