package com.calculatesalestax.products.taxcalculator;

import com.calculatesalestax.products.taxcalculator.productslist.Products;

public class ProductsTaxCalculator {
	private static final double SALES_TAX_PERCENT = 0.1;
	private static final double ADDITIONAL_SALES_TAX_PERCENT = 0.05;

	public static void applyTaxes(Products products) {
		if (!products.isExempted()) {
			products.setBasicSalesTaxAmount(SALES_TAX_PERCENT);
		}

		if (products.isImported()) {
			products.setAdditionalSalesTax(ADDITIONAL_SALES_TAX_PERCENT);
		}
	}

}

//This class follows single responsibility principle, which is one of the SOLID Object-oriented approach.

/* Author: Naren Bagavathy */