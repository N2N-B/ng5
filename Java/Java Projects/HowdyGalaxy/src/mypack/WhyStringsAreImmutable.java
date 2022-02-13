package mypack;

public class WhyStringsAreImmutable {
	public static void main(String args[]) {
		String s = "Sachin";
		s.concat(" Tendulkar");// concat() method appends the string at the end
		System.out.println(s);// will print Sachin because strings are immutable objects

		// As you can see in the above program that two objects are created but s
		// reference variable still refers to "Sachin" not to "Sachin Tendulkar".

		// But if we explicitly assign it to the reference variable, it will refer to
		// "Sachin Tendulkar" object.For example:

		String s9 = "Sachin";
		s9 = s9.concat(" Tendulkar");
		System.out.println(s9);

		// In such case, s points to the "Sachin Tendulkar". Please notice that still
		// sachin object is not modified.

		// Suppose there are 5 reference variables,all referes to one object "sachin".
		// If one reference variable changes the value of the object, it will be
		// affected to all the reference variables.
		// That is why string objects are immutable in java.
		
		String s1 = "Sachin";
		s1 = "Sachin";
		s1 = "Sachin";
		s1 = "Sachin";
		s1 = "Dhoni";

		System.out.println(s1);


	}

}

//Why string objects are immutable in java?
//Because java uses the concept of string literal.Suppose there are 5 reference variables,all referes to one object "sachin".
//If one reference variable changes the value of the object, it will be affected to all the reference variables. 
//That is why string objects are immutable in java.