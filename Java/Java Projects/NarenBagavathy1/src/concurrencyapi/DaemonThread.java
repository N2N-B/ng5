package concurrencyapi;

public class DaemonThread extends Thread{
	public void run(){  
		  if(Thread.currentThread().isDaemon()){//checking for daemon thread  
		   System.out.println("daemon thread");  
		  }  
		  else{  
		  System.out.println("user thread");  
		 }  
		 }  
		 public static void main(String[] args){  
		  DaemonThread daemonThread=new DaemonThread();//creating thread  
		  DaemonThread userThread1=new DaemonThread();  
		  DaemonThread userThread2=new DaemonThread();  
		  
		  daemonThread.setDaemon(true);//now t1 is daemon thread  
		    
		  daemonThread.start();//starting threads  
		  userThread1.start();  
		  userThread2.start();  
		 }

}


//Daemon Thread in Java
//Daemon thread in java is a service provider thread that provides services to the user thread.
//Its life depend on the mercy of user threads i.e. when all the user threads dies, 
//JVM terminates this thread automatically.
//
//There are many java daemon threads running automatically e.g. gc, finalizer etc.

//“Finalizer” thread is a  thread with just a single responsibility. 
//The thread runs an unterminated loop blocked waiting for new instances to appear in 
//java.lang.ref.Finalizer.ReferenceQueue queue

//Points to remember for Daemon Thread in Java
//It provides services to user threads for background supporting tasks.
//It has no role in life than to serve user threads.
//Its life depends on user threads.
//It is a low priority thread.
//
//Why JVM terminates the daemon thread if there is no user thread?
//The sole purpose of the daemon thread is that it provides services to user thread for background supporting task. 
//If there is no user thread, why should JVM keep running this thread. 
//That is why JVM terminates the daemon thread if there is no user thread.

//Methods for Java Daemon thread by Thread class
//The java.lang.Thread class provides two methods for java daemon thread.
//
//Method	Description
//1)	public void setDaemon(boolean status)	is used to mark the current thread as daemon thread or user thread.
//2)	public boolean isDaemon()	is used to check that current is daemon.