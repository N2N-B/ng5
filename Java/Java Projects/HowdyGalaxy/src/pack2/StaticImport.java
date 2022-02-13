package pack2;

import static java.lang.System.*;

public class StaticImport {

	class StaticImportExample {
		public static void main(String args[]) {

			out.println("Hello");// Now no need of System.out
			out.println("Java");

		}
	}

}


//Java Static Import
//The static import feature of Java 5 facilitate the java programmer to access any static member of a class directly. 
//There is no need to qualify it by the class name.
//
//Advantage of static import:
//Less coding is required if you have access any static member of a class oftenly.
//Disadvantage of static import:
//If you overuse the static import feature, it makes the program unreadable and unmaintainable
