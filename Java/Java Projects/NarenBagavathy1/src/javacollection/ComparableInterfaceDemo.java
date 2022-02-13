package javacollection;

import java.util.*;

class Students implements Comparable<Students> {
	int rollno;
	String name;
	int age;

	Students(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public int compareTo(Students st) {
		if (age == st.age)
			return 0;
		else if (age < st.age)
			return 1;
		else
			return -1;
	}
}

public class ComparableInterfaceDemo {
	public static void main(String args[]) {
		ArrayList<Students> al = new ArrayList<Students>();
		al.add(new Students(101, "Vijay", 23));
		al.add(new Students(106, "Ajay", 27));
		al.add(new Students(105, "Jai", 21));

		Collections.sort(al);
		for (Students st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}

}

//Java Comparable interface
//Java Comparable interface is used to order the objects of the user-defined class.
//This interface is found in java.lang package and contains only one method named compareTo(Object).
//It provides a single sorting sequence only, i.e., you can sort the elements on the basis of single data member only. 
//For example, it may be rollno, name, age or anything else.
//
//compareTo(Object obj) method
//public int compareTo(Object obj): It is used to compare the current object with the specified object. It returns
//positive integer, if the current object is greater than the specified object.
//negative integer, if the current object is less than the specified object.
//zero, if the current object is equal to the specified object.
