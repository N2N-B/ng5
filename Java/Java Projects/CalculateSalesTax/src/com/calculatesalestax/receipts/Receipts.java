package com.calculatesalestax.receipts;

import java.util.List;

import com.calculatesalestax.products.taxcalculator.productslist.Products;
import com.calculatesalestax.mathutil.RoundOffTaxAndAmountUsingMathUtils;

//Receipts class returns totalAmount and totalSalesTax of products.

//This class follows single responsibility principle, which is one of the SOLID Object-oriented approach.

public class Receipts {
	private double totalSalesTax = 0.0;
	private double totalAmount = 0.0;
	private String productDetails;

	public Receipts(List<Products> products) {

		StringBuffer productDetails = new StringBuffer();

		for (Products product : products) {
			productDetails.append(product.toString()).append("\n");
			totalSalesTax += product.getTaxAmount();
			totalAmount += product.getFinalPrice();
		}
		totalAmount = RoundOffTaxAndAmountUsingMathUtils.roundOffAmount(totalAmount);
		totalSalesTax = RoundOffTaxAndAmountUsingMathUtils.roundOffAmount(totalSalesTax);

		this.productDetails = productDetails.toString();
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public double getTotalSalesTax() {
		return totalSalesTax;
	}

	@Override
	public String toString() {
		return "Output: " + "\n" + productDetails + "Sales Tax: " + totalSalesTax + "\n" + "Total: " + totalAmount
				+ "\n############################################################################\n";
	}

}
/* Author: Naren Bagavathy */