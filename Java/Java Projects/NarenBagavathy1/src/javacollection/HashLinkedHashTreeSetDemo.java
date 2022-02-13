package javacollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashLinkedHashTreeSetDemo {
	@SuppressWarnings("rawtypes")
	public static void main(String args[]) {
		HashLinkedHashTreeSetDemo hashLinkedHashTreeSetDemo = new HashLinkedHashTreeSetDemo();
		Set hashSetSample = hashLinkedHashTreeSetDemo.createHashSetOfIntegers();
		Set linkedHashSetSample = hashLinkedHashTreeSetDemo.createLinkedHashSetOfIntegers();
		Set treeSetSample = hashLinkedHashTreeSetDemo.createTreeSetOfIntegers();
		hashLinkedHashTreeSetDemo.printSetOfIntegers(hashSetSample);
		hashLinkedHashTreeSetDemo.printSetOfIntegers(linkedHashSetSample);
		hashLinkedHashTreeSetDemo.printSetOfIntegers(treeSetSample);

	}

	@SuppressWarnings("rawtypes")
	private Set createHashSetOfIntegers() {
		HashSet<Integer> setofintegers = new HashSet<Integer>();// Creating Hashset of Integers
		setofintegers.add(50);// Adding first object in Hashset
		setofintegers.add(8999);// Adding second object in Hashset
		setofintegers.add(999);// Adding third object in Hashset
		setofintegers.add(1000);// Adding fourth object in Hashset
		setofintegers.add(88);// Adding fifth object in Hashset
		setofintegers.add(170);// Adding sixth object in Hashset
		setofintegers.add(1);// Adding seventh object in Hashset
		setofintegers.add(88);// Adding fifth object in Hashset
		return setofintegers;
	}

	@SuppressWarnings("rawtypes")
	private Set createLinkedHashSetOfIntegers() {
		LinkedHashSet<Integer> setofintegers = new LinkedHashSet<Integer>();// Creating LinkedHashSet of Integers
		setofintegers.add(50);// Adding first object in LinkedHashSet
		setofintegers.add(8999);// Adding second object in LinkedHashSet
		setofintegers.add(999);// Adding third object in LinkedHashSet
		setofintegers.add(1000);// Adding fourth object in LinkedHashSet
		setofintegers.add(88);// Adding fifth object in LinkedHashSet
		setofintegers.add(170);// Adding sixth object in LinkedHashSet
		setofintegers.add(1);// Adding seventh object in LinkedHashSet
		setofintegers.add(88);// Adding eighth object in LinkedHashSet
		return setofintegers;
	}

	@SuppressWarnings("rawtypes")
	private Set createTreeSetOfIntegers() {
		TreeSet<Integer> setofintegers = new TreeSet<Integer>();// Creating TreeSet of Integers
		setofintegers.add(50);// Adding first object in TreeSet
		setofintegers.add(8999);// Adding second object in TreeSet
		setofintegers.add(999);// Adding third object in TreeSet
		setofintegers.add(1000);// Adding fourth object in TreeSet
		setofintegers.add(88);// Adding fifth object in TreeSet
		setofintegers.add(170);// Adding sixth object in TreeSet
		setofintegers.add(1);// Adding seventh object in TreeSet
		setofintegers.add(88);// Adding eighth object in TreeSet
		return setofintegers;
	}

	@SuppressWarnings("rawtypes")
	private void printSetOfIntegers(Set set) {
		// Traversing set through Iterator
		Iterator traversingSetThroughIterator = set.iterator();
		while (traversingSetThroughIterator.hasNext()) {// check if iterator has the elements
			// next() => printing the element and move to next
			System.out.println("Value of Element in a set through iterator: " + traversingSetThroughIterator.next());
		}
		// Traversing set through for-each loop
		for (Object traversingSetThroughForEachLoop : set) {
			System.out.println("Value of Element in a set through for-each loop: " + traversingSetThroughForEachLoop);

		}
	}

}

//Java HashSet class is used to create a collection that uses a hash table for storage. It inherits the AbstractSet class and implements Set interface.
//
//The important points about Java HashSet class are:
//
//HashSet stores the elements by using a mechanism called hashing.
//HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
//HashSet contains unique elements only.
//HashSet allows null value.
//HashSet is the best approach for search operations.
//The initial default capacity of HashSet is 16, and the load factor is 0.75

//Difference between List and Set
//A list can contain duplicate elements whereas Set contains unique elements only.

//HashSet class declaration
//Let's see the declaration for java.util.HashSet class.
//
//public class HashSet<E> extends AbstractSet<E> implements Set<E>, Cloneable, Serializable  

//Java LinkedHashSet class is a Hashtable and Linked list implementation of the set interface. It inherits HashSet class and implements Set interface.
//
//The important points about Java LinkedHashSet class are:
//
//Java LinkedHashSet class contains unique elements only like HashSet.
//Java LinkedHashSet class provides all optional set operation and permits null elements.
//Java LinkedHashSet class maintains insertion order.

//LinkedHashSet class declaration
//public class LinkedHashSet<E> extends HashSet<E> implements Set<E>, Cloneable, Serializable  
//
//Java TreeSet class implements the Set interface that uses a tree for storage. It inherits AbstractSet class and implements the NavigableSet interface.
//The objects of the TreeSet class are stored in ascending order.
//
//The important points about Java TreeSet class are:
//
//Java TreeSet class contains unique elements only like HashSet.
//Java TreeSet class access and retrieval times are quiet fast.
//Java TreeSet class doesn't allow null element.
//Java TreeSet class maintains ascending order.
//
//TreeSet class declaration
//Let's see the declaration for java.util.TreeSet class.
//
//
//public class TreeSet<E> extends AbstractSet<E> implements NavigableSet<E>, Cloneable, Serializable



//Multithreading in Java is a process of executing multiple threads simultaneously.
//
//A thread is a lightweight sub-process, the smallest unit of processing. Multiprocessing and multithreading, both are used to achieve multitasking.
//
//However, we use multithreading than multiprocessing because threads use a shared memory area.
//They don't allocate separate memory area so saves memory, and context-switching between the threads takes less time than process.


//The object cloning is a way to create exact copy of an object. The clone() method of Object class is used to clone an object.
//
//The java.lang.Cloneable interface must be implemented by the class whose object clone we want to create. 
//If we don't implement Cloneable interface, clone() method generates CloneNotSupportedException.
//
//The clone() method is defined in the Object class. Syntax of the clone() method is as follows:
//
//protected Object clone() throws CloneNotSupportedException  
//Why use clone() method ?
//The clone() method saves the extra processing task for creating the exact copy of an object. 
//If we perform it by using the new keyword, it will take a lot of processing time to be performed that is why we use object cloning.

//java.io.Serializable interface
//Serializable is a marker interface (has no data member and method). 
//It is used to "mark" Java classes so that the objects of these classes may get a certain capability.
//The Cloneable and Remote are also marker interfaces.
//
//The Serializable interface must be implemented by the class whose object needs to be persisted.
//
//The String class and all the wrapper classes implement the java.io.Serializable interface by default

//The RMI (Remote Method Invocation) is an API that provides a mechanism to create distributed application in java
//In RMI, a remote interface is an interface that declares a set of methods that may be invoked from a remote Java virtual machine