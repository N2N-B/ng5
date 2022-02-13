package mypack;

public class IfElseControlStatements {
	public static void main(String[] args) {

		// If Statements
		// It evaluates a Boolean expression and enables the program to enter a block of
		// code if the expression evaluates to true.

		int x = 10;
		int y = 12;
		if (x + y > 20) {
			System.out.println("x + y is greater than 20");
		}
		// If-else Statements
		int xi = 10;
		int yo = 12;
		if (xi + yo < 10) {
			System.out.println("xi + yo is less than      10");
		} else {
			System.out.println("xi + yo is greater than 20");
		}
		// if-else-if statement
		String city = "Delhi";
		if (city == "Meerut") {
			System.out.println("city is meerut");
		} else if (city == "Noida") {
			System.out.println("city is noida");
		} else if (city == "Agra") {
			System.out.println("city is agra");
		} else {
			System.out.println(city);
		}
		// Nested if-statement

		// In nested if-statements, the if statement can contain a if or if-else
		// statement inside another if or else-if statement.

		// Syntax of Nested if-statement is given below.

//		if(condition 1) {    
//			statement 1; //executes when condition 1 is true   
//			if(condition 2) {  
//			statement 2; //executes when condition 2 is true   
//			}  
//			else{  
//			statement 2; //executes when condition 2 is false   
//			}  
//			}  
		String address = "Mumbai, India";

		if (address.endsWith("India")) {
			if (address.contains("Meerut")) {
				System.out.println("Your city is Meerut");
			} else if (address.contains("Noida")) {
				System.out.println("Your city is Noida");
			} else {
				System.out.println(address.split(",")[0]);
			}
		} else {
			System.out.println("You are not living in India");
		}
	}
}
