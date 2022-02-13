package com.calculatesalestax;

import org.junit.jupiter.api.Test;

import com.calculatesalestax.receipts.Receipts;

//SalesTaxCalculatorApplicationTest Class is the test class, which generates the receipts based on the input.

//JUnit is a Java unit testing framework that's one of the best test methods for regression testing.

//An open-source framework, it is used to write and run repeatable automated tests.

//Regression testing is testing existing software applications to make sure that a change or addition hasn't broken any existing functionality.

//The Test annotation tells JUnit that the public void method to which it is attached can be run as a test case. 

//To run the method, JUnit first constructs a fresh instance of the class then invokes the annotated method. 

//Any exceptions thrown by the test will be reported by JUnit as a failure.

//This very class is more of a single responsibility principle.

//Single Responsibility Principle is one of the SOLID Principles Java

//In Java, SOLID principles are an object-oriented approach that are applied to software structure design.

//The single responsibility principle states that every Java class must perform a single functionality. 

//Implementation of multiple functionalities in a single class mashup the code and if any modification is required may affect the whole class. 

//It is precise and the code can be easily maintained.

public class SalesTaxCalculatorApplicationTest {

	private SalesTaxCalculatorApplication salesTaxCalculatorApplication = new SalesTaxCalculatorApplication();

	@Test
	void test() {

		String[] input1 = { "1 book at 12.49", "1 music CD at 14.99", "1 chocolate bar at 0.85" };

		Receipts receipt = salesTaxCalculatorApplication.generateReceipt(input1);

		System.out.println(receipt);

	}

	@Test
	void test2() {

		String[] input2 = { "1 imported box of chocolates at 10.00", "1 imported bottle of perfume at 47.50" };

		Receipts receipt = new SalesTaxCalculatorApplication().generateReceipt(input2);
		System.out.println(receipt);

	}

	@Test
	void test3() {

		String[] input3 = { "1 imported bottle of perfume at 27.99", "1 bottle of perfume at 18.99",
				"1 packet of headache pills at 9.75", "1 box of imported chocolates at 11.25" };

		Receipts receipt = new SalesTaxCalculatorApplication().generateReceipt(input3);
		System.out.println(receipt);

	}
}
/* Author: Naren Bagavathy */