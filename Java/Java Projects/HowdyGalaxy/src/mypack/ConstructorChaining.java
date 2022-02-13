package mypack;

//parent class or base class  
class Demo {
//base class default constructor  
	Demo() {
		this(80, 90);
		System.out.println("Base class default constructor called");
	}

//base class parameterized constructor  
	Demo(int x, int y) {
		System.out.println("Base class parameterized constructor called");
	}
}

//derived class or child class  
class Prototype extends Demo {
//derived class default constructor  
	Prototype() {
		this("Java", "Python");
		System.out.println("Derived class default constructor called");
	}

//derived class parameterized constructor  
	Prototype(String str1, String str2) {
		super();
		System.out.println("Derived class parameterized constructor called");
	}
}

public class ConstructorChaining {
	// main method
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// initializes the instance of example class
		Prototype example = new Prototype();

	}
}
//What is constructor chaining in Java?
//In Java, constructor chaining is a sequence of invoking constructors upon initializing an object.

////Constructor Chaining Examples
//Calling Current Class Constructor
//this() keyword invokes or calls the current class constructor within the same class.

//Calling Super Class Constructor
//Invoking or calling the superclass (parent class) constructor from the child class (derived class).
//super() keyword in the derived class or child class constructor invokes or calls the parent class constructor.
