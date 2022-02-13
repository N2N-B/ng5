package mypack;

interface printable {
	 void print();
}

public class Interface1 implements printable {
	public void print() {
		System.out.println("Hello");
	}

	public static void main(String args[]) {
		Interface1 irf = new Interface1();
		irf.print();
	}

}

//An interface in Java is a blueprint of a class.
//Java Interface Example
//In this example, the Printable interface has only one method, 
//and its implementation is provided in the Interface1 class.

//It has static constants and abstract methods. ... 
//There can be only abstract methods in the Java interface, not method body. 
//It is used to achieve abstraction and multiple inheritance in Java.


