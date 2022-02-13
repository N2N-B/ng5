package mypack;

public class ImplicitConversions {

	public static void main(String[] args) {
		char c = 'b';
		System.out.println(c);
		int i = c;
		System.out.println(i);
		float f = c;
		System.out.println(f);
		long l = c;
		System.out.println(l);
		double d = c;
		System.out.println(d);
	//	char r = d // implicit typecasting
	//	System.out.println(r);// implicit typecasting
	}
}

//In implicit typecasting, the conversion involves a smaller data type to the larger type size. 
//For example, the byte datatype implicitly typecast into short, char, int, long, float, and double. 
//The process of converting the lower data type to that of a higher data type is referred to as Widening.
// When the conversion automatically performs by the compiler without the programmer's interference, it is called 
//implicit type casting or widening casting.