package javacollection;

import java.util.*;

public class ArrayListCollectionCodeReusability {
	@SuppressWarnings("rawtypes")
	public static void main(String args[]) {
		List returnedArrayList = new ArrayListCollectionCodeReusability().createArrayListForCars();
		new ArrayListCollectionCodeReusability().printarraylistforcars(returnedArrayList);
	}

	@SuppressWarnings("rawtypes")
	private List createArrayListForCars() {
		ArrayList<String> cars = new ArrayList<String>();// Creating arraylist of cars
		cars.add("Benz");// Adding first object in arraylist
		cars.add("Porche");// Adding second object in arraylist
		cars.add("Maserati");// Adding third object in arraylist
		cars.add("Tesla");// Adding fourth object in arraylist
		return cars;
	}

	@SuppressWarnings("rawtypes")
	private void printarraylistforcars(List list) {
		// Traversing list through Iterator
		Iterator traversingListThroughIterator = list.iterator();
		while (traversingListThroughIterator.hasNext()) {// check if iterator has the elements
			System.out.println("Value of Element in a set through iterator: " +traversingListThroughIterator.next());// printing the element and move to next
		}
		// Traversing list through for-each loop
		for (Object traversinglistthroughforeachloop : list) {
			System.out.println("Value of Element in a set through for-each loop: " +traversinglistthroughforeachloop);

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
