package mypack;

public class ForLoopControlStatements {
	public static void main(String[] args) {
		// Java for loop
		int sum = 0;
		for (int j = 1; j <= 10; j++) {
			sum = sum + j;
		}
		System.out.println("The sum of first 10 natural numbers is " + sum);

		// Java for-each loop
		String[] languages = { "Java", "Struts", "Spring", "SpringBoot", "JavaScript", "MySQL", "Phython", "ML" };
		System.out.println("Printing the content of the array names:\n");

		for (String language : languages) {
			System.out.println(language);
		}
	}

}

//Java for loop
//for loop is used only when iteration is known to execute the block of code.
//
//for(initialization, condition, increment/decrement) {    
////block of statements    
//}    

//Java for-each loop
//Java provides an enhanced for loop to traverse the data structures like array or collection.
//In the for-each loop, we don't need to update the loop variable. 

//The syntax to use the for-each loop in java is given below.

//for(data_type var : array_name/collection_name){    
//	//statements    
//	}    