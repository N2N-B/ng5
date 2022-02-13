package pack3;

interface Unbelievable {
	void trump();
}

public class MethodReferenceStaticMethod {
	public static void saySomething() {
		System.out.println("Hello, this is static method.");
	}

	public static void main(String[] args) {
		// Referring static method
		Unbelievable unbelievable = MethodReferenceStaticMethod::saySomething;
		// Calling interface method
		unbelievable.trump();
	}
}

//1) Reference to a Static Method
//You can refer to static method defined in the class. 
//Following is the syntax and example which describe the process of referring static method in Java.

//Syntax: ContainingClass::staticMethodName  
//In the above example, we have defined a functional interface and referring a static method to it's functional 
//method trump().

//Java Method References
//Java provides a new feature called method reference in Java 8. Method reference is used to refer method of 
//functional interface. 
//It is compact and easy form of lambda expression. 
//Each time when you are using lambda expression to just referring a method, you can replace your lambda expression 
//with method reference. In this tutorial, we are explaining method reference concept in detail.
//
//Types of Method References
//There are following types of method references in java:
//
//Reference to a static method.
//Reference to an instance method.
//Reference to a constructor.
