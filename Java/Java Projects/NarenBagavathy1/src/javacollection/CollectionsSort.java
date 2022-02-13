package javacollection;

import java.util.*;

class Student implements Comparable<Student> {  
    public String name;  
  public Student(String name) {  
    this.name = name;  
  }  
  public int compareTo(Student person) {  
    return name.compareTo(person.name);  
      
  }   
}  

public class CollectionsSort {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String args[]) {
		// Example to sort string objects in reverse order
		ArrayList<String> al = new ArrayList<String>();
		al.add("Viru");
		al.add("Saurav");
		al.add("Mukesh");
		al.add("Tahir");

		Collections.sort(al, Collections.reverseOrder());
		Iterator i = al.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		// Example to sort Wrapper class objects

		ArrayList a2 = new ArrayList();
		a2.add(Integer.valueOf(201));
		a2.add(Integer.valueOf(101));
		a2.add(230);// internally will be converted into objects as Integer.valueOf(230)

		Collections.sort(a2);

		Iterator itr = a2.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		//Example to sort user-defined class objects
		
		 ArrayList<Student> a3=new ArrayList<Student>();  
	      a3.add(new Student("Sethu"));  
	      a3.add(new Student("Tamoor"));  
	      a3.add(new Student("Basha"));  
	      a3.add(new Student("Abbas"));  
	      
	    Collections.sort(a3);  
	    for (Student s : a3) {  
	      System.out.println(s.name);  
	    }  
	}

}

//Sorting in Collection
//We can sort the elements of:
//
//String objects
//Wrapper class objects
//User-defined class objects
//Collections class provides static methods for sorting the elements of a collection. If collection elements are of a Set type, we can use TreeSet.
//However, we cannot sort the elements of List. Collections class provides methods for sorting the elements of List type elements.
//Method of Collections class for sorting List elements
//public void sort(List list): is used to sort the elements of List. List elements must be of the Comparable type.
