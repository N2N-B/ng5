package mypack;

abstract class Shape {
	abstract int area();

	public void calculateArea(int area) {
		System.out.println("Calculating the area of the shape " + " " + area);
	}

}

class Triangle extends Shape {

	@Override
	int area() {
		// Area of triangle = 1/2 * base * height;
		return 100;
	}
}

class Square extends Shape {

	@Override
	int area() {
		// Area of Square = side^2;
		return 64;
	}
}

public class AbstractClassAbstractMethod {
	public static void main(String[] args) {
		Shape triangle = new Triangle();
		int areaoftriangle = triangle.area();
		triangle.calculateArea(areaoftriangle);

		Shape square = new Square();
		int areaofsquare = square.area();
		square.calculateArea(areaofsquare);

	}

}

//Abstract class in Java
//A class which is declared with the abstract keyword is known as an abstract class in Java.
//It can have abstract and non-abstract methods (method with the body).

//Before learning the Java abstract class, let's understand the abstraction in Java first.

//Abstraction in Java

//Abstraction is a process of hiding the implementation details and showing only functionality to the user.

//Mostly, we don't know about the implementation class (which is hidden to the end user), and an object of the 
//implementation class is provided by the factory method.

//A factory method is a method that returns the instance of the class. We will learn about the factory method later.

//In this example, if you create the instance of Square & Triangle class, 
//area() method of Square & Triangle class will be invoked.