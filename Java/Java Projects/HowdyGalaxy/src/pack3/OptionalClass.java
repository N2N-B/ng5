package pack3;

import java.util.Optional;

public class OptionalClass {
	public static void main(String[] args) {
		String[] str = new String[10];
		str[5] = "null"; // Setting value for 5th index
		Optional<String> checkNull = Optional.ofNullable(str[5]);
		checkNull.ifPresent(System.out::println); // printing value by using method reference
		System.out.println(checkNull.get()); // printing value by using get method
		System.out.println(str[5].toLowerCase());// printing value in lowercase
	}

}

//Java Optional Class
//Java introduced a new class Optional in jdk8. It is a public final class and used to deal with NullPointerException in Java application. 
//You must import java.util package to use this class. 
//It provides methods which are used to check the presence of value for particular variable.


//Java Optional Class Methods
//Methods	Description
//public static <T> Optional<T> empty( )=>	It returns an empty Optional object. No value is present for this Optional.
//public static <T> Optional<T> of(T value)=>	It returns an Optional with the specified present non-null value.
//public static <T> Optional<T> ofNullable(T value)=>	It returns an Optional describing the specified value, if non-null, otherwise returns an empty Optional.
//public T get()=>	If a value is present in this Optional, returns the value, otherwise throws NoSuchElementException.
//public boolean isPresent()=>	It returns true if there is a value present, otherwise false