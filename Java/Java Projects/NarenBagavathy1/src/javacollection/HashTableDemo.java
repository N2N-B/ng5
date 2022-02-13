package javacollection;

import java.util.*;

public class HashTableDemo {
	public static void main(String args[]) {

		Hashtable<Integer, String> map = new Hashtable<Integer, String>();
		map.put(100, "Amit");
		map.put(102, "Ravi");
		map.put(101, "Vijay");
		map.put(103, "Rahul");
		System.out.println("Initial Map: " + map);
		// Inserts, as the specified pair is unique
		map.putIfAbsent(104, "Gaurav");
		System.out.println("Updated Map: " + map);
		// Returns the current value, as the specified pair already exist
		map.putIfAbsent(101, "Vijay");
		System.out.println("Updated Map: " + map);
		
	}

}

//Java Hashtable class
//Java Hashtable class implements a hashtable, which maps keys to values. It inherits Dictionary class and implements the Map interface.
//
//Points to remember
//A Hashtable is an array of a list. Each list is known as a bucket. The position of the bucket is identified by calling the hashcode() method. 
//A Hashtable contains values based on the key.
//Java Hashtable class contains unique elements.
//Java Hashtable class doesn't allow null key or value.
//Java Hashtable class is synchronized.
//The initial default capacity of Hashtable class is 11 whereas loadFactor is 0.75.
//Hashtable class declaration
//Let's see the declaration for java.util.Hashtable class.
//
//public class Hashtable<K,V> extends Dictionary<K,V> implements Map<K,V>, Cloneable, Serializable
//
//Hashtable class Parameters
//Let's see the Parameters for java.util.Hashtable class.
//
//K: It is the type of keys maintained by this map.
//V: It is the type of mapped values.

//Java - The Dictionary Class ... Dictionary is an abstract class that represents a key/value storage repository and operates much like Map

//Difference between HashMap and Hashtable
//HashMap and Hashtable both are used to store data in key and value form. Both are using hashing technique to store unique keys.