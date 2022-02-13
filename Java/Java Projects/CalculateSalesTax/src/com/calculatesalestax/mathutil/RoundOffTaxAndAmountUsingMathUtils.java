package com.calculatesalestax.mathutil;

//RoundOffTaxAndAmountUsingMathUtils has two methods that round off the amount and sales tax using class math

//java.lang.Math

//The class Math contains methods for performing basic numeric operations such as the elementary exponential, logarithm, square root, and 
//trigonometric functions. 

////This class follows single responsibility principle, which is one of the SOLID Object-oriented approach.

public class RoundOffTaxAndAmountUsingMathUtils {
	public static double roundOffTax(double number) {
		return Math.ceil(number * 20) / 20;
	}

	public static double roundOffAmount(double number) {
		return Math.round(number * 100.0) / 100.0;
	}

}

/* Author: Naren Bagavathy */