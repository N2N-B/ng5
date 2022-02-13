package mypack;

class Man {
	void paybill() {
		System.out.println("Man paid his bill");

	}
}

class Zillionaire extends Man {
	void paybill() {
		System.out.println("Zillionaire paid his bill");

	}
}

public class MethodOveridingDynamicRunTimePolymorphism {
	public static void main(String[] args) {
		Zillionaire ze = new Zillionaire();
		ze.paybill();

	}

}

//Method Overiding or Dynamic RunTime Polymorphism has same method and method parameter in parent and child class.
//zillionaire is a man (IS-A relationship)