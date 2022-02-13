package mypack;

public class StaticAndNonStaticMethods {
	public void nonStaticMethod() {
		System.out.println("Non Static Method");
	}

	public static void staticMethod() {
		System.out.println("Static Method");
	}

	public static void main(String[] args) {
		StaticAndNonStaticMethods staticAndNonStaticMethodsObject = new StaticAndNonStaticMethods();
		System.out.println("HowdyGalaxy");
		staticAndNonStaticMethodsObject.nonStaticMethod();
		staticMethod();

	}

}

//Java static method
//If you apply static keyword with any method, it is known as static method.
//
//A static method belongs to the class rather than the object of a class.
//A static method can be invoked without the need for creating an instance of a class.
//A static method can access static data member and can change the value of it.
//
//The static keyword in Java is used for memory management mainly. We can apply static keyword with variables,
//methods, blocks and nested classes. The static keyword belongs to the class than an instance of the class.

//A non-static method belongs to an object of the class, and you have to create an instance of the class to access 
//the non-static method.