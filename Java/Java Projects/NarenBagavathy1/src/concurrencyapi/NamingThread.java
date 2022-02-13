package concurrencyapi;

public class NamingThread  extends Thread {
	 public void run(){  
		   System.out.println("running...");  
		  }  
		 public static void main(String args[]){  
			 NamingThread namingThread1=new NamingThread();  
			 NamingThread namingThread2=new NamingThread();  
		  System.out.println("Name of thread one : " +namingThread1.getName());  
		  System.out.println("Name of thread two : " +namingThread2.getName());  
		   
		  namingThread1.start();  
		  namingThread2.start();  
		  
		  namingThread1.setName("Singh");  
		  System.out.println("After changing name of thread one : "+namingThread1.getName());  
		  
		  namingThread2.setName("Suresh Kamath");  
		  System.out.println("After changing name of thread two : "+namingThread2.getName());  
		 }  

}
