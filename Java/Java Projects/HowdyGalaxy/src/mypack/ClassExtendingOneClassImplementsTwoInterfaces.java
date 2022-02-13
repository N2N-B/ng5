package mypack;

interface Walk {
	void walk();
}

interface Run {
	void run();
}

class Dinosauraus implements Walk, Run {
	public void walk() {
		System.out.println("Dinosauraus is walking");

	}

	public void run() {
		System.out.println("Dinosauraus is running");
	}

}

class Human extends Dinosauraus {
	public void walk() {
		System.out.println("Human is walking");

	}

	public void run() {
		System.out.println("Human is running");
	}
}

public class ClassExtendingOneClassImplementsTwoInterfaces {
	public static void main(String args[]) {
		Walk h1 = new Human();
		Run h2 = new Human();
		h1.walk();
		h2.run();
	}
}

//Dynamic runtime polymorphism 
//Assign the instance of subclass to the superclass
