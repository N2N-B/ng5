package mypack;

//Multilevel Inheritance Example
//When there is a chain of inheritance, it is known as multilevel inheritance. 
//As you can see in the example given below,
//BabyDog class inherits the Dog1 class which again inherits the Animal1 class, so there is a multilevel inheritance
class Animal1 {
	void weep() {
		System.out.println("eating...");
	}
}

class Dog1 extends Animal1 {
	void weep() {
		System.out.println("barking...");
	}
}

class BabyDog extends Dog1 {
	void weep() {
		System.out.println("weeping...");
	}
}

public class MultilevelInheritance {
	public static void main(String[] args) {
		BabyDog d = new BabyDog();
		d.weep();
		

	}
}
