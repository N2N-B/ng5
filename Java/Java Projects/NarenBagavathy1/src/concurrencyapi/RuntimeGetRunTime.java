package concurrencyapi;

public class RuntimeGetRunTime {
	public static void main(String args[]) throws Exception {
		Runtime.getRuntime().exec("notepad");// will open a new notepad

		//How to shutdown windows system in Java
		Runtime.getRuntime().exec("c:\\Windows\\System32\\shutdown -s -t 0");
		//How to restart windows system in Java
		Runtime.getRuntime().exec("c:\\Windows\\System32\\restart -r -t 0");

	}

}

//Java Runtime class is used to interact with java runtime environment. 
//Java Runtime class provides methods to execute a process, invoke GC, get total and free memory etc. 
//There is only one instance of java.lang.Runtime class is available for one java application.
//
//The Runtime.getRuntime() method returns the singleton instance of Runtime class.

//Important methods of Java Runtime class
//No.	Method	Description
//1)	public static Runtime getRuntime()	returns the instance of Runtime class.
//2)	public void exit(int status)	terminates the current virtual machine.
//3)	public void addShutdownHook(Thread hook)	registers new hook thread.
//4)	public Process exec(String command)throws IOException	executes given command in a separate process.
//5)	public int availableProcessors()	returns no. of available processors.
//6)	public long freeMemory()	returns amount of free memory in JVM.
//7)	public long totalMemory()	returns amount of total memory in JVM

// you can use -s switch to shutdown system, -r switch to restart system and -t switch to specify time delay.