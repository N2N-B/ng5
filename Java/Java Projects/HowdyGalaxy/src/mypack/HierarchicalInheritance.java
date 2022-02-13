package mypack;

class Vechicle {
	void move() {
		System.out.println("It's moving");
	}
}

class Bike extends Vechicle {
	void twowheeler() {
		System.out.println("Bike is moving");

	}
}

class Car extends Vechicle {
	void fourwheeler() {
		System.out.println("Car is moving");

	}
}

public class HierarchicalInheritance {
	public static void main(String args[]) {
		Car c = new Car();
		c.fourwheeler();
		c.move();

	}

}

//Hierarchical Inheritance Example
//When two or more classes inherits a single class, it is known as hierarchical inheritance. 
//In the example given above, Bike and Car classes inherits the Vechicle class, so there is hierarchical inheritance.
