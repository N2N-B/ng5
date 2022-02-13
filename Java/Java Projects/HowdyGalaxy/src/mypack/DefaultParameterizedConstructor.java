package mypack;

public class DefaultParameterizedConstructor {
	int id;

	String name;

	// no-arg constructor
	DefaultParameterizedConstructor() {
		int var = 100;
		System.out.println(var);
	}

	// arg constructor or parameterized constructor
	DefaultParameterizedConstructor(int i, String n) {
		id = i;
		name = n;
	}

	void show() {

		System.out.println(id + " " + name);
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		DefaultParameterizedConstructor con = new DefaultParameterizedConstructor();
		DefaultParameterizedConstructor con1 = new DefaultParameterizedConstructor(400, "Mike");
		con1.show();

	}
}

//There are two types of constructor in Java: 
//1. No-argument constructor: A constructor that has no parameter is known as the default constructor.
//If we don't define a constructor in a class, then the compiler creates default constructor(with no arguments) 
//for the class.

//Parameterized Constructors
//The parameterized constructors are the constructors having a specific number of arguments to be passed.