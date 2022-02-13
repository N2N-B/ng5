package javacollection;

import java.util.*;

public class DequeSample {
	@SuppressWarnings("rawtypes")
	public static void main(String args[]) {
		DequeSample dequeSample = new DequeSample();
		Deque dequelist = dequeSample.createDequelistForEmployees();
		dequeSample.printDequelistForEmployees(dequelist);
	}

	@SuppressWarnings("rawtypes")
	private Deque createDequelistForEmployees() {
		Deque<String> dequeueofemployees = new ArrayDeque<String>();// Creating Dequelist of employees
		dequeueofemployees.offerFirst("Naren Bagavathy");// Adding first object in Dequelist
		dequeueofemployees.offer("Maheshwari");// Adding second object in Dequelist
		dequeueofemployees.offer("Akash Nambi");// Adding third object in Dequelist
		dequeueofemployees.add("Arun Pandi");// Adding fourth object in Dequelist
		return dequeueofemployees;
	}

	@SuppressWarnings("rawtypes")
	private void printDequelistForEmployees(Deque deque) {
		System.out.println("After offerFirst Traversal......");
		// Traversing Deque List For Employees through for-each loop
		for (Object traversingDequeListForEmployeesThroughForEachLoop : deque) {
			System.out.println(traversingDequeListForEmployeesThroughForEachLoop);

		}
		// deque.poll();
		// deque.pollFirst();//it is same as poll()
		deque.pollLast();
		System.out.println("After pollLast() Traversal...");
		for (Object traversingDequeListForEmployeesThroughForEachLoop1 : deque) {
			System.out.println(traversingDequeListForEmployeesThroughForEachLoop1);
		}
	}
}


//Java Deque Interface
//Java Deque Interface is a linear collection that supports element insertion and removal at both ends.
//Deque is an acronym for "double ended queue".

//Deque Interface declaration
//public interface Deque<E> extends Queue<E>  

//Methods of Java Deque Interface
//Method	Description
//boolean add(object)	It is used to insert the specified element into this deque and return true upon success.

//boolean offer(object)	It is used to insert the specified element into this deque.

//Object remove()	It is used to retrieves and removes the head of this deque.

//Object poll()	It is used to retrieves and removes the head of this deque, or returns null if this deque is empty.

//Object peek()	It is used to retrieves, but does not remove, the head of this deque, or returns null if this deque is empty.

//ArrayDeque class
//The ArrayDeque class provides the facility of using deque and resizable-array.
//It inherits AbstractCollection class and implements the Deque interface.