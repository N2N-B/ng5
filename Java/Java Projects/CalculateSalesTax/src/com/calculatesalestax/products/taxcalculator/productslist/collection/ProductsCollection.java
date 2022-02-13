package com.calculatesalestax.products.taxcalculator.productslist.collection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.calculatesalestax.products.taxcalculator.ProductMatcherInputUsingRegex;
import com.calculatesalestax.products.taxcalculator.ProductsTaxCalculator;
import com.calculatesalestax.products.taxcalculator.productslist.Products;

public class ProductsCollection {
	public static List<Products> from(String[] inputs) {
		return Arrays.stream(inputs).map(ProductsCollection::from).collect(Collectors.toList());
	}

	private static Products from(String input) {
		Products products = ProductMatcherInputUsingRegex.createProductsFromString(input);
		ProductsTaxCalculator.applyTaxes(products);
		return products;
	}

}

//This class follows single responsibility principle, which is one of the SOLID Object-oriented approach.

/* Author: Naren Bagavathy */