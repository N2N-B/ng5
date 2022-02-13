package solid;

class VehicleInfo {
	public void vehicleNumber() {
		System.out.println("TN 007");
	}
}

class Car extends VehicleInfo {
	public void vehicleNumber() {
		System.out.println("CR 10");
	}
}

class Bike extends VehicleInfo {
	public void vehicleNumber() {
		System.out.println("BE 07");
	}
}

class OpenClosedPrinciple {
	public static void main(String[] args) {

		Bike bike = new Bike();
		bike.vehicleNumber();

	}
}

// Open Closed Principle
// The principle states that software entities like class, modules, functions,
// etc.; should be able to extend a
// class behavior without modifying it

// The open/closed principle (OCP) states that a module should be open to
// extension but closed for modification.

//Similarly, we can add more vehicles by making another subclass extending from the vehicle class. 
//The approach would not affect the existing application.