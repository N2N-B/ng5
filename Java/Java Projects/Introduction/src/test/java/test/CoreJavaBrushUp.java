package test;

import java.math.BigDecimal;
import java.util.ArrayList;

public class CoreJavaBrushUp {
	public static void main(String[] args) {

		// Variables and Datatypes
		int $number = 10; // primitive datatype int
		String website = "Google";// Non-primitive datatype string
		boolean elementPresent = true;
		float float_number = 4.99f;
		double $double_number = 4.99d;
		BigDecimal big_decimal = new BigDecimal("4.99");

		System.out.println($number + " is the value of the $number variable and int is the dataype");
		System.out.println(website + " is the value of the website variable and String is the dataype");
		System.out.println(elementPresent + " is the value of the elementPresent variable and boolean is the dataype");
		System.out.println(float_number + " is the value of the float_number variable and float is the dataype");
		System.out.println($double_number + " is the value of the $double_number variable and double is the dataype");
		System.out.println(big_decimal + " is the value of the big_decimal variable and BigDecimal is the class");

		// Arrays are used to store many values into a variable.
		int[] array = new int[5];
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		array[3] = 4;
		array[4] = 6;

		int[] arrays = { 1, 2, 3, 4, 5 };
		arrays[0] = 1;
		arrays[1] = 2;
		arrays[2] = 3;
		arrays[3] = 4;
		arrays[4] = 5;
		System.out.println(arrays[4]);
		System.out.println();

		// for loop iterating array elements
		for (int i = 0; i < array.length; i++)
			System.out.println(array[i]);
		System.out.println();

		// Enhanced for loop iterating array elements
		for (Object arrayElements : arrays)
			System.out.println(arrayElements);
		System.out.println();

		String[] name = { "rahul", "shetty", "selenium" };
		// for loop iterating string elements
		for (int i = 0; i < name.length; i++)
			System.out.println(name[i]);
		System.out.println();

		// Enhanced for loop iterating array elements
		for (Object stringElements : name)
			System.out.println(stringElements);
		System.out.println();

		// Enhanced for loop iterating array elements
		for (String s : name)
			System.out.println(s);
		System.out.println();

		// Enhanced for loop iterating array elements
		for (int n : arrays)
			System.out.println(n);
		System.out.println();

		ArrayList<String> names = new ArrayList<String>();
		names.add("rahul");
		names.add("shetty");
		names.add("academy");
		names.add("cool");
		names.remove(2);
		System.out.println(names.get(2));

		for (String nameList : names)
			System.out.println(nameList);

	 //	String abhay = new String("Anupam");
	//	String thedecisionlabs = new String("Anupam");

		String s = "Rahul Shetty Academy";
		String[] splittedString = s.split("Shetty");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		// System.out.println(splittedString[2]);
		System.out.println(splittedString[1].trim());

		for (int i = 0; i < s.length(); i++)
			System.out.println(s.charAt(i));

		System.out.println();

		for (int i = s.length() - 1; i >= 0; i--)
			System.out.print(s.charAt(i));

		int myNumber = 23;
		String websiteLink = "https://rahulshettyacademy.com";
		boolean boo_lean = false;
		char $character = 'a';
		double doubleDecimal = 5.99d;

		System.out.println(myNumber + " is the value stored in the integer datatype");
		System.out.println(websiteLink + " is the value stored in the string datatype");
		System.out.println(boo_lean + " is the value stored in the boolean datatype");
		System.out.println($character + " is the value stored in the char datatype");
		System.out.println(doubleDecimal + " is the value stored in the double datatype");

		int[] array1 = new int[4];
		array1[0] = 2;
		array1[1] = 3;
		array1[2] = 4;
		array1[3] = 5;

		System.out.println(array1[0]);
		System.out.println(array1[1]);
		System.out.println(array1[2]);
		System.out.println(array1[3]);

		int[] array2 = { 6, 7, 8, 9, 10 };
		System.out.println(array2[0]);
		System.out.println(array2[1]);
		System.out.println(array2[2]);
		System.out.println(array2[3]);

		for (int i = 0; i < array1.length; i++)
			System.out.println(array1[i]);

		for (int i = 0; i < array2.length; i++)
			System.out.println(array2[i]);

		for (int arrayIterator : array1)
			System.out.println(arrayIterator);

		for (int arraysIterator : array2)
			System.out.println(arraysIterator);

		String[] name1 = { "Naren", "Bagavathy", "Selenium" };

		for (int i = 0; i < name1.length; i++)
			System.out.println(name1[i]);

		for (String namesListIterator : name1)
			System.out.println(namesListIterator);

		int[] mutiples_of_two = { 1, 2, 4, 5, 6, 7, 8, 9, 10, 122 };

		// 2,4,6,8,10
		for (int i = 0; i < mutiples_of_two.length; i++) {
			if (mutiples_of_two[i] % 2 == 0) {
				System.out.println(mutiples_of_two[i]);
				break;
			} else {
				System.out.println(mutiples_of_two[i] + " is not a multiple of 2");
			}
		}

		System.out.println();

		ArrayList<String> narenBagavathySelenium = new ArrayList<String>();
		narenBagavathySelenium.add("naren");
		narenBagavathySelenium.add("bagavathy");
		narenBagavathySelenium.add("selenium");
		System.out.println(narenBagavathySelenium.get(2));

		System.out.println();

		String s1 = "hello";
		String s2 = new String("Bagavathy");

		System.out.println();

		String nameChar = "Naren Bagavathy Selenium";
		String[] $splitString = nameChar.split(" ");

		System.out.println($splitString);
		System.out.println($splitString[0]);
		System.out.println($splitString[1]);

		System.out.println();

		String stringCharacters = "Rahul Shetty Academy";
		String[] splitString = stringCharacters.split("Shetty");
		System.out.println(splitString);
		System.out.println(splitString[0]);
		System.out.println(splitString[1]);
		System.out.println(splitString[1].trim());

		System.out.println();

		for (int i = 0; i < stringCharacters.length(); i++)
		System.out.println(stringCharacters.charAt(i));
		
		System.out.println();

		
		for(int i=stringCharacters.length()-1; i>=0;i--)
	    System.out.println(stringCharacters.charAt(i));
		
		System.out.println();


	}
}
