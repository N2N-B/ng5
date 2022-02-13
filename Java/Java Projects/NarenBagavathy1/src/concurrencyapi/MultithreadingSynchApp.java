package concurrencyapi;

class Printer {
	// To synchronize multiple threads use synchronized keyword in the
	// method;synchronized runs multiple threads sequentially i.e, synchronization
	// synchronized void printdocuments(int num, String nameoffile)
	// synchronized keyword occurs a lock on the method if one thread can access it
	// i.e, intrinsic lock in which
	// no other threads can access the synchronized void printdocuments method
	void printdocuments(int num, String nameoffile) {

		for (int i = 1; i <= num; i++) {
			try {
				// sleep() method temporarily stops the execution of the thread or process or
				// task or job
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Print documents: " + nameoffile + " " + i);
		}

	}
}

class Mythread extends Thread {
	Printer myPrinterReference;

	Mythread(Printer p) {
		myPrinterReference = p;
	}

	//@Override
	public void run() {

		// synchronized block acquires a lock on the printdocuments method method in
		// which
		// no other threads can access the synchronized void printdocuments method
		synchronized (myPrinterReference) {
			myPrinterReference.printdocuments(10, "NarenProfile.pdf");
		}
	}
}

class Yourthread extends Thread {
	Printer yourPrinterReference;

	Yourthread(Printer p) {
		yourPrinterReference = p;
	}

//	@Override
	public void run() {
		// synchronized block acquires a lock on the printdocuments method method in
		// which
		// no other threads can access the synchronized void printdocuments method
		synchronized (yourPrinterReference) {

			yourPrinterReference.printdocuments(10, "Neymar_Messi_Profile.pdf");
		}
	}
}

class Ourthread extends Thread {
	Printer ourPrinterReference;

	Ourthread(Printer p) {
		ourPrinterReference = p;
	}

	//@Override
	public void run() {
		// synchronized block acquires a lock on the printdocuments method in
		// which
		// no other threads can access the synchronized void printdocuments method
		synchronized (ourPrinterReference) {

			ourPrinterReference.printdocuments(10, "PatternsCognitiveProfile.pdf");
		}
	}
}

public class MultithreadingSynchApp {
	// Main is representing main thread
	public static void main(String[] args) {
		System.out.println("Application Started");

		Printer printer = new Printer();// Single Object of Printer

		Mythread myThreadReference = new Mythread(printer);// Mythread is having a reference to the same Printer Object
		Yourthread yourThreadReference = new Yourthread(printer);// Yourthread is having a reference to the same Printer
																	// Object

		Ourthread ourThreadReference = new Ourthread(printer);// Ourthread is having a reference to the same Printer
																// Object

		// Threads running parallelly or concurrently => Asynchronization => To
		// synchronize thread use join() method,
		// declare synchronize keyword on the print method or create a synchronize block
		myThreadReference.start();
//		try {
//			myThreadReference.join(); // To synchronize 2 or 3 threads use join() method,which runs threads sequentially i.e, synchronization 
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		yourThreadReference.start();
//		try {
//			yourThreadReference.join();// To synchronize 2 or 3 threads use join() method,which runs threads sequentially i.e, synchronization 
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		ourThreadReference.start();
//		try {
//			ourThreadReference.join();// To synchronize 2 or 3 threads use join() method,which runs threads sequentially i.e, synchronization 
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		System.out.println("Application Finished");

	}
}

//1)void start()	It is used to start the execution of the thread.
//2)void run()	It is used to do an action for a thread.
//3)static void	sleep()	It sleeps a thread for the specified amount of time.
//void join()	It waits for a thread to die.

//A thread is a thread of execution in a program. The Java Virtual Machine allows an application to have multiple threads of execution running concurrently. 

//The life cycle of the thread in java is controlled by JVM. The java thread states are as follows:
//
//New
//Runnable
//Running
//Non-Runnable (Blocked)
//Terminated

//1) New
//The thread is in new state if you create an instance of Thread class but before the invocation of start() method.
//
//2) Runnable
//The thread is in runnable state after invocation of start() method, but the thread scheduler has not selected it to be the running thread.
//
//3) Running
//The thread is in running state if the thread scheduler has selected it.
//
//4) Non-Runnable (Blocked) or Waiting State
//This is the state when the thread is still alive, but is currently not eligible to run.
//
//5) Terminated
//A thread is in terminated or dead state when its run() method exits.

//Thread Scheduler in Java
//Thread scheduler in java is the part of the JVM that decides which thread should run.
//
//There is no guarantee that which runnable thread will be chosen to run by the thread scheduler.
//
//Only one thread at a time can run in a single process.
//
//The thread scheduler mainly uses preemptive or time slicing scheduling to schedule the threads.
//
//Difference between preemptive scheduling and time slicing
//Under preemptive scheduling, the highest priority task executes until it enters the waiting or dead states or a higher priority task comes into existence. Under time slicing, a task executes for a predefined slice of time and then reenters the pool of ready tasks.
//The scheduler then determines which task should execute next, based on priority and other factors.

//How to create thread
//There are two ways to create a thread:
//
//By extending Thread class
//By implementing Runnable interface.
//Thread class:
//Thread class provide constructors and methods to create and perform operations on a thread.Thread class extends Object class and 
//implements Runnable interface.
//
//Commonly used Constructors of Thread class:
//Thread()
//Thread(String name)
//Thread(Runnable r)
//Thread(Runnable r,String name)
//
//Commonly used methods of Thread class:
//public void run(): is used to perform action for a thread.
//public void start(): starts the execution of the thread.JVM calls the run() method on the thread.
//public void sleep(long miliseconds): Causes the currently executing thread to sleep (temporarily cease execution) for the specified number of milliseconds.
//public void join(): waits for a thread to die.
//public void join(long miliseconds): waits for a thread to die for the specified miliseconds.

//Runnable interface:
//The Runnable interface should be implemented by any class whose instances are intended to be executed by a thread. Runnable interface have only one method named run().
//public void run(): is used to perform action for a thread.