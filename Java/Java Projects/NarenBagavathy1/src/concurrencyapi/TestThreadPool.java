package concurrencyapi;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable {
	private String message;

	public WorkerThread(String s) {
		this.message = s;
	}

	public void run() {
		System.out.println(Thread.currentThread().getName() + " (Start) message = " + message);
		processmessage();// call processmessage method that sleeps the thread for 2 seconds
		System.out.println(Thread.currentThread().getName() + " (End)");// prints thread name
	}

	private void processmessage() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class TestThreadPool {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(5);// creating a pool of 5 threads
		for (int i = 0; i < 10; i++) {
			Runnable worker = new WorkerThread("" + i);
			executorService.execute(worker);// calling execute method of ExecutorService
		}
		executorService.shutdown();
		while (!executorService.isTerminated()) {
		}

		System.out.println("Finished all threads");
	}
}


//What is ThreadPool in Java?
//
//A thread pool reuses previously created threads to execute current tasks and offers a solution to the 
//problem of thread cycle overhead 
//and resource thrashing. Since the thread is already existing when the request arrives, the delay introduced by thread creation is eliminated, 
//making the application more responsive.Better performance It saves time because there is no need to create new thread.
//
//
//Real time usage
//It is used in Servlet and JSP where container creates a thread pool to process the request.





//1. Create a task(Runnable Object) to execute eg: Runnable worker = new WorkerThread("" + i); creates 10 tasks.
//2. Create Executor Pool using Executors eg : ExecutorService executor = Executors.newFixedThreadPool(5);//creating a Executor pool of 5 threads  
//3. Pass tasks to Executor Pool eg:  executor.execute(worker);
//4. Shutdown the Executor Pool eg:  executor.shutdown();  


//Executor Thread Pool Methods
//Method                         Description
//newFixedThreadPool(int)           Creates a fixed size thread pool.
//newCachedThreadPool()             Creates a thread pool that creates new 
//                                  threads as needed, but will reuse previously 
//                                  constructed threads when they are available
//newSingleThreadExecutor()         Creates a single thread. 

//Java provides the Executor framework which is centered around the Executor interface, its sub-interface –ExecutorService 
//and the class-ThreadPoolExecutor, which implements both of these interfaces. 
//By using the executor, one only has to implement the Runnable objects and send them to the executor to execute.

//Executor
//This interface provides a way of decoupling task submission from the mechanics of how each task will be run, including details of thread use,scheduling,etc.
//An Executor is normally used instead of explicitly creating threads.
//For example, rather than invoking new Thread(new RunnableTask()).start() for each of a set of tasks, you might use: 
//	 Executor executor = anExecutor();
//	 executor.execute(new RunnableTask1());
//	 executor.execute(new RunnableTask2());



//An ExecutorService can be shut down, which will cause it to reject new tasks.

//shutdown()=> Initiates an orderly shutdown in which previously submitted tasks are executed, but no new tasks will be accepted
//execute()=> Executes the given task(Runnable Object) . 