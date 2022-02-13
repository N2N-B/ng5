package com.calculatesalestax.products.taxcalculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.calculatesalestax.products.taxcalculator.productslist.Products;

//The Java Regex or Regular Expression is an API to define a pattern for searching or manipulating strings.

// java.util.regex.Pattern

//A compiled representation of a regular expression.

public class ProductMatcherInputUsingRegex {
	private static final String PRODUCTS_ENTRY_REGEX = "(\\d+) ([\\w\\s]* )at (\\d+.\\d{2})";// String to be tested

	public static Products createProductsFromString(String input) {

//Pattern java.util.regex.Pattern.compile(String regex)

//Compiles the given regular expression into a pattern

		Pattern pattern = Pattern.compile(PRODUCTS_ENTRY_REGEX);

//java.util.regex.Matcher

//An engine that performs match operations on a character sequence by interpreting a Pattern. 

		Matcher matcher = pattern.matcher(input);
		matcher.find();

//boolean java.util.regex.Matcher.find()

//Attempts to find the next subsequence of the input sequence that matches the pattern.

		return new Products(matcher.group(1), matcher.group(2), matcher.group(3));// String
																					// java.util.regex.Matcher.group(int
																					// group).Returns the input
																					// subsequence captured by the given
																					// group during the previous match
																					// operation

	}

}

//This class follows single responsibility principle, which is one of the SOLID Object-oriented approach.
