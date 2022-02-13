package mypack;

//parent class or base class  
class Demo1 {

	// parent class instance variable
	String parentclassinstancevariable = "Super Keyword refers to a immediate parent class instance variable ";

	// Base class non-static method

	public void nonstaticmethod1() {
		System.out.println("Super Keyword invokes a parent class non-static method");
	}

//base class parameterized constructor  
	Demo1(String st1, String st2) {
		System.out.println("Super Keyword invokes a parent class parameterized constructor");
	}
}

//derived class or child class  
class Prototype1 extends Demo1 {

	// derived class non-static method 1
	@Override

	public void nonstaticmethod1() {
		super.nonstaticmethod1();
	}

	// derived class non-static method 2

	void print() {
// Refer a immediate parent class instance variable
		System.out.println(super.parentclassinstancevariable);
	}

//derived class parameterized constructor  
	Prototype1(String str1, String str2) {

		super("Chella", "Kutty");
	}
}

public class SuperKeyword {
	// main method
	public static void main(String[] args) {

		// initializes the instance of example class
		Prototype1 example1 = new Prototype1("Hai", "Baby");
		example1.nonstaticmethod1();
		example1.print();
	}
}

//Super Keyword
// Invokes a parent class constructor 
//Invokes a parent class method 
//Refer a immediate parent class instance variable 
