package mypack;

public class Variables {

	Integer instanceVariable;
	static Integer staticVariable = 16;

	private synchronized void nonStatictest() {
		@SuppressWarnings("unused")
		Integer localVariable = 9;
		System.out.println("Non Static Method");
	}

	public static void statictest() {
		System.out.println("Static Method");
	}

	public static void main(String[] args) {
		Variables variablesObject = new Variables();
		variablesObject.instanceVariable = 60;
		Variables variablesObject2 = new Variables();
		variablesObject2.instanceVariable = 60;

		Variables.staticVariable = 99;

		System.out.println("HowdyGalaxy");
		variablesObject.nonStatictest();
		statictest();

	}

}


//Java Variables
//A variable is a container which holds the value while the Java program is executed.
//A variable is assigned with a data type

//1) Local Variable
//A variable declared inside the body of the method is called local variable. 
//You can use this variable only within that method 

//2) Instance Variable
//A variable declared inside the class but outside the body of the method, is called an instance variable

//3) Static variable
//A variable that is declared as static is called a static variable. 
//It cannot be local. 
//You can create a single copy of the static variable and share it among all the instances of the class.