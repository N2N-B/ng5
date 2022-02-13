package pack2;

public class Varargs {

	static void display(String... values) {
		System.out.println("display method invoked ");
		for (String s : values) {
			System.out.println(s);
		}
	}

	public static void main(String args[]) {

		display();// zero argument
		display("hello");// one argument
		display("my", "name", "is", "varargs");// four arguments
		display("1000", "1000", "1000", "1000");// five arguments

	}

}


//Variable Argument (Varargs):
//The varrags allows the method to accept zero or muliple arguments. 
//Before varargs either we use overloaded method or take an array as the method parameter 
//but it was not considered good because it leads to the maintenance problem. 
//If we don't know how many argument we will have to pass in the method, varargs is the better approach.

//Advantage of Varargs:
//We don't have to provide overloaded methods so less code.

//Syntax of varargs:
//The varargs uses ellipsis i.e. three dots after the data type. Syntax is as follows:

//return_type method_name(data_type... variableName){}  

//For example : static void display(String... values)