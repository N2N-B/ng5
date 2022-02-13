package javacollection;

import java.util.*;

public class ArrayListCollection {
	@SuppressWarnings("rawtypes")
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();// Creating arraylist
		list.add("Mango");// Adding object in arraylist
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		// Traversing list through Iterator
		Iterator traversinglistthroughiterator = list.iterator();// getting the Iterator
		while (traversinglistthroughiterator.hasNext()) {// check if iterator has the elements
			System.out.println(traversinglistthroughiterator.next());// printing the element and move to next
		}

		// Traversing list through for-each loop
		for (String traversinglistthroughforeachloop : list) {
			System.out.println(traversinglistthroughforeachloop);

		}
	}

}

//Java ArrayList class uses a dynamic array for storing the elements.It is found in the java.util package. 
//It is like an array, but there is no size limit. We can add or remove elements anytime.
//The ArrayList in Java can have the duplicate elements.The ArrayList maintains the insertion order internally.
//It implements the List interface so we can use all the methods of List interface here. 

//Looping Through a Collection
//To loop through a collection, use the hasNext() and next() methods of the Iterator.


//boolean java.util.Iterator.hasNext()
//hasNext() method returns true if it has next element.


//Object java.util.Iterator.next()
//
//
//next() method returns the next element in the iteration.
//Returns:the next element in the iteration
//Throws:NoSuchElementException - if the iteration has no more elements


//Java Iterator
//An Iterator is an object that can be used to loop through collections, such as ArrayList and HashSet.
//It is called an "iterator" because "iterating" is the technical term for looping.
//
//To use an Iterator, you must import it from the java.util package.
