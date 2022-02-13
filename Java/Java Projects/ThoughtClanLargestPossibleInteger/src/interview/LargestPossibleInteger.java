package interview;

import java.util.*;

public class LargestPossibleInteger {

	@SuppressWarnings("rawtypes")

	/*
	 * 1.static void printLargestPossibleInteger(ArrayList<String> array) method has
	 * an ArrayList of Strings.
	 * 
	 * 2.static void printLargestPossibleInteger(ArrayList<String> array) returns
	 * the largest integer by appending String and comparing numbers using
	 * compareTo() method.
	 */
	static void printLargestPossibleInteger(ArrayList<String> array) {

		Collections.sort(array, new Comparator<String>() {

			// Overriding the public int compare() method in Comparator interface
			@Override
			public int compare(String A, String B) {

				String AB = A + B; // Append B at the end of A

				String BA = B + A; // Append A at the end of B

				/*
				 * Checking two numbers , which one is greater
				 */

				return AB.compareTo(BA) > 0 ? -1 : 1;
			}
		});

		// Iterator loops or iterates the given list of integers
		Iterator iterator = array.iterator();

		// hasNext() checks whether there is a next element or not and next() method
		// returns the next element
		while (iterator.hasNext())

			// Printing the largest possible integer
			System.out.print(iterator.next());
	}

	public static void main(String[] args) {

		ArrayList<String> array;
		array = new ArrayList<>();

		// Adding the given list [10, 7, 76, 415] of numbers in ArrayList

		array.add("10");
		array.add("7");
		array.add("76");
		array.add("415");

		// Passing the given list [10, 7, 76, 415] of numbers in ArrayList to static
		// void printLargestPossibleInteger(ArrayList<String> array) method
		printLargestPossibleInteger(array);

	}
}
