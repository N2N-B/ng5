
package pack2;

import java.util.*;

public class TestGenerics1 {

	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("rahul");
		list.add("jai");
	//	list.add(32);//compile time error

		String s = list.get(1);// type casting is not required
		System.out.println("element is: " + s);

		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}

//Generics in Java
//The Java Generics programming is introduced in J2SE 5 to deal with type-safe objects. 
//It makes the code stable by detecting the bugs at compile time.
//generics force the java programmer to store a specific type of objects.

//Advantage of Java Generics
//There are mainly 3 advantages of generics. They are as follows:

//1) Type-safety: We can hold only a single type of objects in generics. It doesn'nt allow to store other objects.
//2) Type casting is not required: There is no need to typecast the object.
//3) Compile-Time Checking: It is checked at compile time so problem will not occur at runtime. 
//The good programming strategy says it is far better to handle the problem at compile time than runtime.



//Syntax to use generic collection

//ClassOrInterface<Type>    
//Example to use Generics in java
//ArrayList<String>    


//In the above Example of Generics in Java
//Here, we are using the ArrayList class, but you can use any collection class such as 
//ArrayList, LinkedList, HashSet, TreeSet, HashMap, Comparator etc.