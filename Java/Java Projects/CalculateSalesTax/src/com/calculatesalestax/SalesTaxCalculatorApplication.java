package com.calculatesalestax;

import java.util.List;

import com.calculatesalestax.products.taxcalculator.productslist.Products;
import com.calculatesalestax.products.taxcalculator.productslist.collection.ProductsCollection;
import com.calculatesalestax.receipts.Receipts;

public class SalesTaxCalculatorApplication {
	Receipts generateReceipt(String[] inputs) {
		List<Products> products = ProductsCollection.from(inputs);
		return new Receipts(products);
	}

}

//This class follows single responsibility principle, which is one of the SOLID Object-oriented approach.

/* Author: Naren Bagavathy */