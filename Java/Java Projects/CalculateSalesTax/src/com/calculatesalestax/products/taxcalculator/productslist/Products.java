package com.calculatesalestax.products.taxcalculator.productslist;

import java.util.stream.Stream;

import com.calculatesalestax.mathutil.RoundOffTaxAndAmountUsingMathUtils;

public class Products {
	private String name;
	private int quantity;
	private double basePrice;
	private double basicSalesTaxAmount;
	private double additionalSalesTaxAmount;

	public Products(String quantity, String name, String basePrice) {
		this.name = name;
		this.quantity = Integer.valueOf(quantity);
		this.basePrice = Double.valueOf(basePrice);
	}

	public double getFinalPrice() {
		return RoundOffTaxAndAmountUsingMathUtils.roundOffAmount(quantity * basePrice + getTaxAmount());
	}

	public double getTaxAmount() {
		return quantity * (basicSalesTaxAmount + additionalSalesTaxAmount);
	}

	public boolean isImported() {
		return name.contains("imported");
	}

	public boolean isExempted() {
		return Stream.of("book", "chocolate", "pill").anyMatch(exemptedItem -> name.contains(exemptedItem));
	}

	public void setBasicSalesTaxAmount(double factor) {
		basicSalesTaxAmount = basePrice * factor;
	}

	public void setAdditionalSalesTax(double additionalSalesTaxPercent) {
		additionalSalesTaxAmount = RoundOffTaxAndAmountUsingMathUtils
				.roundOffTax(basePrice * additionalSalesTaxPercent);
	}

	public String toString() {
		return String.valueOf(quantity) + " " + name + ":" + " " + getFinalPrice();
	}

}

//This class follows single responsibility principle, which is one of the SOLID Object-oriented approach.

/* Author: Naren Bagavathy */