package pack3;

//Java program to demonstrate
//static method in Interface.

interface NewInterface {

	// static method
	static void hello() {
		System.out.println("Hello, New Static Method Here");
	}

	// Public and abstract method of Interface
	void overrideMethod(String str);
}

//Implementation Class
public class StaticMethodsInInterface implements NewInterface {

	public static void main(String[] args) {
		StaticMethodsInInterface staticMethodsInInterface = new StaticMethodsInInterface();

		// Calling the static method of interface
		NewInterface.hello();

		// Calling the abstract method of interface
		staticMethodsInInterface.overrideMethod("Hello, Override Method here");
	}

	// Implementing interface method

	@Override
	public void overrideMethod(String str) {
		System.out.println(str);
	}
}



//Static Methods in Interface are those methods, which are defined in the interface with the keyword static.
//The static method in an interface can be defined in the interface, but cannot be overridden in Implementation Classes. 
//To use a static method, Interface name should be instantiated with it, as it is a part of the Interface only.
