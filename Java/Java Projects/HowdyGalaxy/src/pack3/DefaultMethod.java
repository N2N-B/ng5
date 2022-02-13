package pack3;

interface available {
	// Default method
	default void sayLess() {
		System.out.println("Hello, this is default method");
	}

	// Abstract method
	void sayMore(String msg);
}

public class DefaultMethod implements available {
	public void sayMore(String msg) { // implementing abstract method
		System.out.println(msg);
	}

	public static void main(String[] args) {
		DefaultMethod dm = new DefaultMethod();
		dm.sayLess(); // calling default method
		dm.sayMore("Work is worship"); // calling abstract method

	}

}

//Java Default Methods
//Java provides a facility to create default methods inside the interface. 
//Methods which are defined inside the interface and tagged with default are known as default methods. 
//These methods are non-abstract methods.

//Java Default Method Example
//In the following example, available is a functional interface that contains a default and an abstract method.
//The concept of default method is used to define a method with default implementation.
//You can override default method also to provide more specific implementation for the method.
