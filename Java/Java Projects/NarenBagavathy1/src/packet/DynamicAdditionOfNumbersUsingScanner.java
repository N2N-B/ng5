package packet;

import java.util.Scanner;

public class DynamicAdditionOfNumbersUsingScanner {
	@SuppressWarnings("resource")
	public static void main(String[] arg) {
		int a, b, c;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number");
		a = scanner.nextInt();
		System.out.println("Enter second number");
		b = scanner.nextInt();
		c = addition(a, b);
		System.out.println("Addition of two numbers is : " + c);
	}

	static int addition(int x, int y) {
		return x + y;
	}

}


//The Scanner class is used to get user input, and it is found in the java.util package.
//The nextInt() method of Java Scanner class is used to scan the next token of the input as an int.