package pack3;

@FunctionalInterface // It is optional
interface Drawable {
	public void draw();
}

public class LambdaExpressionExample {

	public static void main(String[] args) {
		int width = 10;
		int length = 30;

		// with lambda
		Drawable d2 = () -> {
			System.out.println("Drawing " + width);
			System.out.println("Drawing " + length);

		};
		d2.draw();
	}

}

//Java Lambda Expressions
//Lambda expression is a new and important feature of Java which was included in Java SE 8.
//It provides a clear and concise way to represent one method interface using an expression. 
//It is very useful in collection library. 
//It helps to iterate, filter and extract data from collection.
//To provide the implementation of Functional interface.
//Less coding. Java Lambda Expression Syntax
//(argument-list) -> {body}  
//