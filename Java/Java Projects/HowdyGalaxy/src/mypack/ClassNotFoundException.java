package mypack;

public class ClassNotFoundException {
//	ClassNotFoundException in Java Example
//	A very common example of ClassNotFoundException is when a JDBC driver is attempted to be loaded using Class.forName() 
//	and the driver's JAR file is not present in the classpath:

	    private static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";

	        public static void main(String[]  args) throws Exception {
	                System.out.println("Loading MySQL JDBC driver");
	                Class.forName(DRIVER_CLASS);
	        }
	            }
//	Since the MySQL JDBC driver JAR file is not present in the classpath, running the above code leads to a java.lang.ClassNotFoundException:
//
//	Loading MySQL JDBC driver
//	Exception in thread "main" java.lang.ClassNotFoundException: com.mysql.jdbc.Driver
//	    at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:602)
//	    at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:178)
//	    at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:522)
//	    at java.base/java.lang.Class.forName0(Native Method)
//	    at java.base/java.lang.Class.forName(Class.java:340)
//	    at ClassNotFoundExceptionExample.main(ClassNotFoundExceptionExample.java:6)
//	To fix the Java exception, the mysql-connector JAR should be included in the application classpath.

//ClassNotFoundException that is checked exception is thrown by JVM.

