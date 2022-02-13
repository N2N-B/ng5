package javacollection;

import java.util.*;

public class LinkedListSample {
	@SuppressWarnings("rawtypes")
	public static void main(String args[]) {
		LinkedListSample linkedListSample = new LinkedListSample();
		LinkedList linkedlist = LinkedListSample.createLinkedlistForEmployees();
		linkedListSample.printLinkedlistForEmployees(linkedlist);
	}

	@SuppressWarnings("rawtypes")
	private static LinkedList createLinkedlistForEmployees() {
		LinkedList<String> linkedlistofemployees = new LinkedList<String>();
		// Creating Linked List of employees //
		linkedlistofemployees.add("Ravi"); // Adding first object in LinkedList
		linkedlistofemployees.add("Vijay"); // Adding second object in LinkedList
		linkedlistofemployees.add("Ajay"); // Adding third object in LinkedList
		linkedlistofemployees.add("Anuj"); // Adding fourth object in LinkedList
		linkedlistofemployees.add("Gaurav"); // Adding fifth object in LinkedList
		linkedlistofemployees.add("Harsh"); // Adding sixth object in LinkedList
		linkedlistofemployees.add("Virat"); // Adding seventh object in LinkedList
		linkedlistofemployees.add("Gaurav"); // Adding eighth object in LinkedList
		linkedlistofemployees.add("Harsh"); // Adding ninth object in LinkedList
		linkedlistofemployees.add("Amit"); // Adding tenth object in LinkedList
		return linkedlistofemployees;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void printLinkedlistForEmployees(LinkedList linklist) {
		System.out.println("Initial list of elements: " + linklist);
		// Removing specific element from arraylist
		linklist.remove("Vijay");
		System.out.println("After invoking remove(object) method: " + linklist);
		// Removing element on the basis of specific position
		linklist.remove(0);
		System.out.println("After invoking remove(index) method: " + linklist);
		LinkedList<String> linklist1 = new LinkedList<String>();
		linklist1.add("Ravi");
		linklist1.add("Hanumat");
		// Adding new elements to arraylist
		linklist.addAll(linklist1);
		System.out.println("Updated list : " + linklist);
		// Removing all the new elements from arraylist
		linklist.removeAll(linklist1);
		System.out.println("After invoking removeAll() method: " + linklist);
		// Removing first element from the list
		linklist.removeFirst();
		System.out.println("After invoking removeFirst() method: " + linklist);
		// Removing first element from the list
		linklist.removeLast();
		System.out.println("After invoking removeLast() method: " + linklist);
		// Removing first occurrence of element from the list
		linklist.removeFirstOccurrence("Gaurav");
		System.out.println("After invoking removeFirstOccurrence() method: " + linklist);
		// Removing last occurrence of element from the list
		linklist.removeLastOccurrence("Harsh");
		System.out.println("After invoking removeLastOccurrence() method: " + linklist);

		// Removing all the elements available in the list
		linklist.clear();
		System.out.println("After invoking clear() method: " + linklist);
	}

}


//Java LinkedList class uses a doubly linked list to store the elements. It provides a linked-list data structure. 
//It inherits the AbstractList class and implements List and Deque interfaces.

//The important points about Java LinkedList are:

//Java LinkedList class can contain duplicate elements.
//Java LinkedList class maintains insertion order.
//In Java LinkedList class, manipulation is fast because no shifting needs to occur.
//Java LinkedList class can be used as a list, stack or queue.
//LinkedList<String> linkedlistofemployees = new LinkedList<String>();


//Doubly Linked List
//In the case of a doubly linked list, we can add or remove elements from both sides.
//
//A doubly linked list has an additional pointer known as the previous pointer in its node apart from the data part
//and the next pointer as in the singly linked list.
//
//A node in the doubly linked list looks as follows:
//
//node in the doubly linked list
//
//Here, “Prev” and “Next” are pointers to the previous and next elements of the node respectively. 
//The ‘Data’ is the actual element that is stored in the node.

//Java List
//List in Java provides the facility to maintain the ordered collection. 
//It contains the index-based methods to insert, update, delete and search the elements. 
//It can have the duplicate elements also. We can also store the null elements in the list.
//
//The List interface is found in the java.util package and inherits the Collection interface.
//It is a factory of ListIterator interface. Through the ListIterator, we can iterate the list in forward and backward directions. 
//The implementation classes of List interface are ArrayList, LinkedList, Stack and Vector.
//The ArrayList and LinkedList are widely used in Java programming. The Vector class is deprecated since Java 5.
//
//List Interface declaration
//public interface List<E> extends Collection<E>  

//Queue Interface
//Queue interface maintains the first-in-first-out order.
//It can be defined as an ordered list that is used to hold the elements which are about to be processed.
//There are various classes like PriorityQueue, Deque, and ArrayDeque which implements the Queue interface.
//
//Queue interface can be instantiated as:
//
//Queue<String> q1 = new PriorityQueue();  
//Queue<String> q2 = new ArrayDeque();  

//Queue Interface declaration
//public interface Queue<E> extends Collection<E>  

