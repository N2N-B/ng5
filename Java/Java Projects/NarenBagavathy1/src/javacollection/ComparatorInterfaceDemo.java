package javacollection;

import java.util.*;

class Studentslist {
	int rollno;
	String name;
	int age;

	Studentslist(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
}

class AgesComparator implements Comparator<Studentslist> {
	public int compare(Studentslist s1, Studentslist s2) {
		if (s1.age == s2.age)
			return 0;
		else if (s1.age > s2.age)
			return 1;
		else
			return -1;
	}
}

class NamesComparator implements Comparator<Studentslist> {
	public int compare(Studentslist s1, Studentslist s2) {
		return s1.name.compareTo(s2.name);
	}
}

public class ComparatorInterfaceDemo {
	public static void main(String args[]) {

		ArrayList<Studentslist> al = new ArrayList<Studentslist>();
		al.add(new Studentslist(101, "Vijay", 23));
		al.add(new Studentslist(106, "Ajay", 27));
		al.add(new Studentslist(105, "Jai", 21));

		System.out.println("Sorting by Name");

		Collections.sort(al, new NamesComparator());
		for (Studentslist st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

		System.out.println("Sorting by age");

		Collections.sort(al, new AgesComparator());
		for (Studentslist st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}

}
//The Comparator is used to sort attributes of different objects.