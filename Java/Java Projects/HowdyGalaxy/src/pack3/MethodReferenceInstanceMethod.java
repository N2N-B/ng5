package pack3;

interface Laudable {
	void way();
}

public class MethodReferenceInstanceMethod {

	public void saySomething() {
		System.out.println("Hello, this is non-static method.");
	}

	public static void main(String[] args) {
		MethodReferenceInstanceMethod methodReference = new MethodReferenceInstanceMethod(); // Creating object
		// Referring non-static method using reference
		Laudable laudable = methodReference::saySomething;
		// Calling interface method
		laudable.way();
		// Referring non-static method using anonymous object
		Laudable laudable2 = new MethodReferenceInstanceMethod()::saySomething; // You can use anonymous object also
		// Calling interface method
		laudable2.way();
	}

}

//2) Reference to an Instance Method
//like static methods, you can refer instance methods also. In the following example, we are describing the process of referring the instance method.
//
//Syntax
//
//containingObject::instanceMethodName  
//Example 1
//In the following example, we are referring non-static methods. You can refer methods by class object and anonymous object.