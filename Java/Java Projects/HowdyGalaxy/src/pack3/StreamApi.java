package pack3;

import java.util.*;

class Product {
	int id;
	String name;
	float price;

	public Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class StreamApi {

	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();
		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));
		// This is more compact approach for filtering data
		productsList.stream().filter(product -> product.price == 30000)
				.forEach(product -> System.out.println(product.name));
	}

}

//Java Stream Example: Filtering and Iterating Collection
//In the following example, we are using filter() method. Here, you can see code is optimized and very concise.
//
//Java 8 Stream
//Java provides a new additional package in Java 8 called java.util.stream. 
//This package consists of classes, interfaces and enum to allows functional-style operations on the elements. 
//You can use stream by importing java.util.stream package.