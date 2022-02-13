package mypack;

class CompileTimeStaticBinding {
	private void bark() {
		System.out.println("Rottweiler is eating...");
	}

	public static void main(String args[]) {
		CompileTimeStaticBinding compileTimeStaticBinding = new CompileTimeStaticBinding();
		compileTimeStaticBinding.bark();
	}

}
//Static Binding and Dynamic Binding
//static binding and dynamic binding in java
//Connecting a method call to the method body is known as binding.

//There are two types of binding

//Static Binding (also known as Early Binding).
//Dynamic Binding (also known as Late Binding).

//static binding
//When type of the object is determined at compiled time(by the compiler), it is known as static binding.

//If there is any private, final or static method in a class, there is static binding.