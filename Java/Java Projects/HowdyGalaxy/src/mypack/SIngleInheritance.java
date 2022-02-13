package mypack;

class Animal {
	void eat() {
		System.out.println("eating...");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("barking...");
	}
}

public class SIngleInheritance {
	public static void main() {
		Dog d = new Dog();
		d.bark();
		d.eat();

	}

}

//When a class inherits another class, it is known as a single inheritance. 
//In the example given above, Dog class inherits the Animal class, so there is the single inheritance.