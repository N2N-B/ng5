//package mypack; //Security Exception .//The declared package "java.util" does not match the expected package "mypack"
package mypack;



public class SecurityExceptionUncheckedException {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}

}

//SecurityException in Java. This exception is thrown by the security manager, in order to indicate a security violation.
//
//The SecurityException class extends the RuntimeException class and thus, belongs to those exceptions 
//that can be thrown during the operation of the Java Virtual Machine (JVM). 
//It is an unchecked exception and thus, it does not need to be declared in a method’s or a constructor’s throws clause.
//
//Finally the SecurityException class exists since the 1.0 version of Java.
//
//The Structure of SecurityException
//Constructors
//SecurityException()
//Creates an instance of the SecurityException class, setting null as its message.
//
//SecurityException(String s)
//Creates an instance of the SecurityException class, using the specified string as message. The string argument indicates the name of the class 
//that threw the error.
//
//SecurityException(String message, Throwable cause)
//Creates an instance of the SecurityException class, using the specified string as message and the specified Throwable as its cause.
//
//SecurityException(Throwable cause)
//Creates an instance of the SecurityException class, using the specified Throwable as its cause.
//
//
//The SecurityException in Java
//The SecurityException indicates that a security violation has occurred an thus, the application cannot be executed. 
//A simple example is to use a package name that is already defined in Java.
//
//For example, let’s create a simple hierarchy, where the parent directory is called java and the sub-directory is called util. 
//Then, we create a sample Java class inside the java/util/ directory, which only prints a message:
//	SecurityExceptionUncheckedException.java
//	
//	When the Java Virtual Machine (JVM) tries to load our class, it recognizes its package name as invalid and thus, a SecurityException is thrown.

//How to deal with the SecurityException
//In the aforementioned case, it is sufficient to change the package name of your application, in order to be executed by the Java Virtual Machine (JVM). 
//In general, you must avoid using package names that are reserved by Java.
//Sometimes, executing a .jar file can result in a SecurityException be possibly thrown. 
//In such cases, you must verify that the .jar file is properly signed, otherwise you will not be able to execute it. 
//For more information on how to sign a .jar please refer to the instructions here.
//Finally, running an applet from an external source may also result in a SecurityException be thrown. 
//The most frequent reason is that Java applications are blocked by the underlying security settings. 
//For more information on how to change these settings and how to update your Exception Site list, please refer to the instructions here.
