package javacollection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashLinkedHashTreeMapDemo {
	public static void main(String args[]) {
		HashLinkedHashTreeMapDemo hashLinkedHashTreeMapDemo = new HashLinkedHashTreeMapDemo();
		hashLinkedHashTreeMapDemo.printMap(hashLinkedHashTreeMapDemo.createHashMap());
		hashLinkedHashTreeMapDemo.printMap(hashLinkedHashTreeMapDemo.createLinkedHashMap());
		hashLinkedHashTreeMapDemo.printMap(hashLinkedHashTreeMapDemo.createTreeMap());
	}

	private Map<Integer, String> createHashMap() {
		Map<Integer, String> employeemap = new HashMap<>();// Creating HashMap
		employeemap.put(50, "A");// first object in HashMap
		employeemap.put(8999, "K");// second object in HashMap
		employeemap.put(999, "P");// third object in HashMap
		employeemap.put(1000, "O");// fourth object in HashMap
		employeemap.put(88, "Q");// fifth object in HashMap
		employeemap.put(170, "W");// sixth object in HashMap
		employeemap.put(1, "J");// seventh object in HashMap
		employeemap.put(88, "D");// eighth object in HashMap
		return employeemap;
	}

	private Map<Integer, String> createLinkedHashMap() {
		Map<Integer, String> employeemap = new LinkedHashMap<>();// Creating LinkedHashMap
		employeemap.put(50, "A");// first object in LinkedHashMap
		employeemap.put(8999, "K");// second object in LinkedHashMap
		employeemap.put(999, "P");// third object in LinkedHashMap
		employeemap.put(1000, "O");// fourth object in LinkedHashMap
		employeemap.put(88, "Q");// fifth object in LinkedHashMap
		employeemap.put(170, "W");// sixth object in LinkedHashMap
		employeemap.put(1, "J");// seventh object in LinkedHashMap
		employeemap.put(88, "D");// eighth object in LinkedHashMap
		return employeemap;
	}

	private Map<Integer, String> createTreeMap() {
		Map<Integer, String> employeemap = new TreeMap<>();// Creating TreeMap
		employeemap.put(50, "A");// first object in TreeMap
		employeemap.put(8999, "K");// second object in TreeMap
		employeemap.put(999, "P");// third object in TreeMap
		employeemap.put(1000, "O");// fourth object in TreeMap
		employeemap.put(88, "Q");// fifth object in TreeMap
		employeemap.put(170, "W");// sixth object in TreeMap
		employeemap.put(1, "J");// seventh object in TreeMap
		employeemap.put(88, "D");// eighth object in TreeMap
		return employeemap;
	}

	@SuppressWarnings({ "rawtypes", "unused" })
	private void printMap(Map<Integer, String> printmap) {
		Set keys = printmap.keySet();
		System.out.println(printmap);

	}

}

//Java HashMap class implements the Map interface which allows us to store key and value pair,
//where keys should be unique.
//
//Points to remember
//Java HashMap contains values based on the key.
//Java HashMap contains only unique keys.
//Java HashMap may have one null key and multiple null values.
//Java HashMap is non synchronized.
//Java HashMap maintains no order.
//The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.
//
//public class HashMap<K,V> extends AbstractMap<K,V> implements Map<K,V>, Cloneable, Serializable  
//HashMap class Parameters
//Let's see the Parameters for java.util.HashMap class.
//
//K: It is the type of keys maintained by this map.
//V: It is the type of mapped values.

//Java LinkedHashMap class is Hashtable and Linked list implementation of the Map interface, 
//with predictable iteration order. 
//It inherits HashMap class and implements the Map interface.
//
//Points to remember
//Java LinkedHashMap contains values based on the key.
//Java LinkedHashMap contains unique elements.
//Java LinkedHashMap may have one null key and multiple null values.
//Java LinkedHashMap is non synchronized.
//Java LinkedHashMap maintains insertion order.
//The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.

//LinkedHashMap class declaration
//Let's see the declaration for java.util.LinkedHashMap class.
//
//public class LinkedHashMap<K,V> extends HashMap<K,V> implements Map<K,V>  
//LinkedHashMap class Parameters
//Let's see the Parameters for java.util.LinkedHashMap class.
//
//K: It is the type of keys maintained by this map.
//V: It is the type of mapped values.

//Java TreeMap class is a red-black tree based implementation. It provides an efficient means of storing key-value
//pairs in sorted order.
//
//The important points about Java TreeMap class are:
//
//Java TreeMap contains values based on the key. It implements the NavigableMap interface and extends AbstractMap 
//class.
//Java TreeMap contains only unique elements.
//Java TreeMap cannot have a null key but can have multiple null values.
//Java TreeMap is non synchronized.
//Java TreeMap maintains ascending order.
//TreeMap class declaration
//Let's see the declaration for java.util.TreeMap class.
//
//public class TreeMap<K,V> extends AbstractMap<K,V> implements NavigableMap<K,V>, Cloneable, 

//Java Map Interface
//A map contains values on the basis of key, i.e. key and value pair. 
//Each key and value pair is known as an entry. A Map contains unique keys.
//A Map is useful if you have to search, update or delete elements on the basis of a key.
//
//Java Map Hierarchy
//There are two interfaces for implementing Map in java: Map and SortedMap, and three classes: HashMap, 
//LinkedHashMap, and TreeMap.

//Multithreading in Java is a process of executing multiple threads simultaneously.
//
//A thread is a lightweight sub-process, the smallest unit of processing. Multiprocessing and multithreading, 
//both are used to achieve multitasking.
//
//However, we use multithreading than multiprocessing because threads use a shared memory area.
//They don't allocate separate memory area so saves memory, and context-switching between the threads takes less 
//time than process.


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