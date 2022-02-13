package mypack;

public class TypeConversionMethods {
	public static void main(String[] args) {

		// String to int
		String str = "23";
		System.out.println(str);
		int n = Integer.parseInt(str);// Integer is the wrapper class
		System.out.println(n);

		// String to Integer
		String st = "93";
		System.out.println(st);
		int na = Integer.valueOf(st);// Integer is the wrapper class
		System.out.println(na);

		// int to String
		int naren = 100;
		System.out.println(naren);
		String s = Integer.toString(naren);
		System.out.println(s);

		// (or)
		int nare = 760;
		System.out.println(nare);
		String s1 = String.valueOf(nare);
		System.out.println(s1);

		// Unary Operators
		// Post-increment
		int f = 88;
		System.out.println(f);
		f++;
		System.out.println(f++);
		System.out.println(f);

		// Pre-decrement
		int g = 188;
		System.out.println(g);
		g--;
		System.out.println(g--);
		System.out.println(g);

		// ! changes the value from true to false
		boolean a = true;
		System.out.println(a);
		boolean d = !a;
		System.out.println(d);

		// Arithmetic operators
		int u = 39;
		System.out.println(u);
		int p = 100;
		System.out.println(p);
		int z = u % p;
		System.out.println(z);

		// Shift operators
		int lm = 20;
		int po = lm << 2;
		System.out.println(po);
		int lk = lm >> 3;
		System.out.println(lk);

		// Relational operators
		int r = 1000;
		int b = 500;
		System.out.println("a < b = " + (r < b));
		System.out.println("a > b = " + (r > b));
		System.out.println("a == b = " + (r == b));
		System.out.println("a != b = " + (r != b));

		// Assignment operators
		int as = 210;
		int ng = 36;
		System.out.println("as = " + (as += ng));

		// Ternary operators example
		int ab = 99;
		int bc = 100;
		int ter = ab > bc ? 999 : 1000;
		System.out.println(ter);

		// Ternary operators example 2
		int x, y;
		x = 20;
		y = (x == 1) ? 61 : 90;
		System.out.println("Value of y is: " + y);
		y = (x == 20) ? 61 : 90;
		System.out.println("Value of y is: " + y);
	}

}

//Type casting
//Type Casting in Java
//In Java, type casting is a method or process that converts a data type into another data type in both ways
//manually and automatically.
//Convert a value from one data type to another data type is known as type casting.

//Types of Type Casting

//There are two types of type casting:
//Widening Type Casting
//Narrowing Type Casting

//Widening Type Casting
//Converting a lower data type into a higher one is called widening type casting. 
//It is also known as implicit conversion or casting down. It is done automatically. 
//It is safe because there is no chance to lose data. It takes place when:
//	Both data types must be compatible with each other.
//	The target type must be larger than the source type.
//	byte -> short -> char -> int -> long -> float -> double  
//	For example, the conversion between numeric data type to char or Boolean is not done automatically. A
//	lso, the char and Boolean data types are not compatible with each other




//Narrowing Type Casting
//Converting a higher data type into a lower one is called narrowing type casting. 
//It is also known as explicit conversion or casting up. It is done manually by the programmer. 
//If we do not perform casting then the compiler reports a compile-time error.

//double -> float -> long -> int -> char -> short -> byte  
//Let's see an example of narrowing type casting.

//In the following example, we have performed the narrowing type casting two times. 
//First, we have converted the double type into long data type after that long data type is converted into int type.








