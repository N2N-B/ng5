package pack3;

import java.util.ArrayList;
import java.util.List;

public class ForEachMethod {
	public static void main(String[] args) {
		List<String> gamesList = new ArrayList<String>();
		gamesList.add("Football");
		gamesList.add("Cricket");
		gamesList.add("Chess");
		gamesList.add("Hocky");
		System.out.println("------------Iterating by passing lambda expression--------------");
		gamesList.forEach(games -> System.out.println(games));
		System.out.println("------------Iterating by passing method reference---------------");
		gamesList.forEach(System.out::println);
		System.out.println(
				"------------Iterating by passing lambda expression using java stream foreach ordered---------------");
		gamesList.stream().forEachOrdered(games -> System.out.println(games));
		System.out.println(
				"------------Iterating by passing method reference using java stream foreach ordered---------------");
		gamesList.stream().forEachOrdered(System.out::println);

	}

}

//Java forEach loop
//Java provides a new method forEach() to iterate the elements. It is defined in Iterable and Stream interface. 
//It is a default method defined in the Iterable interface. 
//Collection classes which extends Iterable interface can use forEach loop to iterate elements.
//
//This method takes a single parameter which is a functional interface.
//So, you can pass lambda expression as an argument.

//forEach() Signature in Iterable Interface
//default void forEach(Consumer<super T>action)  

//Java Stream forEachOrdered() Method
//Along with forEach() method, Java provides one more method forEachOrdered(). 
//It is used to iterate elements in the order specified by the stream.

//Signature:
//void forEachOrdered(Consumer<? super T> action)  

