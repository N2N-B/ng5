package mypack;

public class MethodConstructorOverloading {

	int studentid;
	String studentname;
	int age;

	// creating two arg constructor
	MethodConstructorOverloading(int i) {
		studentid = i;
		// studentname = n;
	}

	// creating three arg constructor
	MethodConstructorOverloading(int i, String n, int a) {
		studentid = i;
		studentname = n;
		age = a;
	}

	void display() {
		System.out.println(studentid + " " + studentname + " " + age);
	}

	// 1)Method Overloading: changing no. of arguments
	// In this example, we have created two methods, first add() method performs
	// addition of two numbers and second add method performs addition of three
	// numbers.
	//
	// In this example, we are creating static methods so that we don't need to
	// create instance for calling methods.

	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}

//	2) Method Overloading: changing data type of arguments
//	In this example, we have created two methods that differs in data type. 
	//The first mul method receives two integer arguments and second mul method receives two double arguments.

	static int mul(int y, int z) {
		return y * z;
	}

	static double mul(double y, double z) {
		return y * z;
	}

	public static void main(String[] args) {

		MethodConstructorOverloading stu1 = new MethodConstructorOverloading(111);
		MethodConstructorOverloading stu2 = new MethodConstructorOverloading(222, "Aryan", 25);
		stu1.display();
		stu2.display();

		System.out.println(MethodConstructorOverloading.add(8, 8, 8));
		System.out.println(MethodConstructorOverloading.mul(6.6d, 6.6d));

	}
}


////Constructor Overloading
//Writing more than 1 constructor in a class with a unique set of arguments is called as Constructor Overloading
//All constructors will have the name of the class
//Overloaded constructor will be executed at the time of instantiating an object


//Method Overloading
//Writing more than one method within a class with a unique set of arguments is called as method overloading
//All methods must share the same name
//An overloaded method if not static can only be called after instantiating the object as per the requirement