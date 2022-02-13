package concurrencyapi;

//Java monitors are reentrant means java thread can reuse the same monitor for different synchronized methods if 

//method is called from the method.
//
//Advantage of Reentrant Monitor
//It eliminates the possibility of single thread deadlocking

//A monitor is a mechanism to control concurrent access to an object.
//
//This allows you to do:
//
//Thread 1:
//
//public void a()
//{
//    synchronized(someObject) {
//        // do something (1)
//    }
//}
//Thread 2:
//
//public void b()
//{
//    synchronized(someObject) {
//        // do something else (2)
//    }
//}
//This prevents Threads 1 and 2 accessing the monitored (synchronized) section at the same time. One will start, and
//monitor will prevent the other from accessing the region before the first one finishes.
//
//It's not a special object. It's synchronization mechanism placed at class hierarchy root: java.lang.Object.
//
//There are also wait and notify methods that will also use object's monitor to communication among different 
//threads.

class Reentrant {
	public synchronized void m() {
		n();
		System.out.println("this is m() method");
	}

	public synchronized void n() {
		System.out.println("this is n() method");
	}
}

public class ReentrantMonitor {

	public static void main(String args[]) {
	//	@SuppressWarnings("unused")
		final ReentrantMonitor reentrantMonitor = new ReentrantMonitor();

		Thread t1 = new Thread() {
			public void run() {
				new Reentrant().m();// calling method of Reentrant class
			}
		};
		t1.start();
	}

}
//Output: this is n() method
//this is m() method