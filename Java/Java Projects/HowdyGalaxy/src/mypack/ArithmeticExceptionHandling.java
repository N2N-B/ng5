package mypack;

public class ArithmeticExceptionHandling {
	public static void main(String[] args) {
		int denominator = 0;
		try {
			System.out.println(1000/denominator);
		} catch (ArithmeticException exception) {
			System.out.println("Dividing any number by zero gives an arithmetic exception:  " + exception.getMessage());
          }
		finally {
			System.out.println("Whether successful or unsuccessful execution, Statements in the finally block are executed.");

		}
	}

}

//Unchecked Exception
//The classes that inherit the RuntimeException are known as unchecked exceptions or runtime exceptions. 
//For example, ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, etc. 
//Unchecked exceptions are not checked at compile-time, but they are checked at runtime.