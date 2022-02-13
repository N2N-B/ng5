package com.example.demo;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ListofNumbersApplication {

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

		// hasNext() checks whether there are more elementsa or not and next() method
		// returns the next element

		Iterator iterator = array.iterator();

		while (iterator.hasNext())

			// Printing the largest possible integer
			System.out.print(iterator.next());
	}

	public static void main(String[] args) {
		SpringApplication.run(ListofNumbersApplication.class, args);
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
