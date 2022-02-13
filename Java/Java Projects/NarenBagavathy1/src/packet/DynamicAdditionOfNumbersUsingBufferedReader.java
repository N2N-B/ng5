package packet;

import java.io.*;

public class DynamicAdditionOfNumbersUsingBufferedReader {
	public static void main(String[] args) throws IOException {
		BufferedReader readinput = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter first number");
		int x = Integer.parseInt(readinput.readLine());
		System.out.println("Enter second number");
		int y = Integer.parseInt(readinput.readLine());
		int z = x + y;
		System.out.println("Addition of two numbers is : " + z);
	}

}
//BufferedReader
//Java BufferedReader class is used to read the text from a character-based input streams. BufferedReader is found in java.io package.

//InputStreamReader
//An InputStreamReader reads bytes and decodes them into characters using a specified charset.
//Parameters:in An InputStream

//The method generally used to convert String to Integer in Java is parseInt().
//Parsing is to read the value of one object to convert it to another type

//The readLine() method of BufferedReader class in Java is used to read one line text at a time