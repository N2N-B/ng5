package pack2;

public class TypeSafeEnum {
	// defining the enum inside the class
	public enum Season {
		WINTER, SPRING, SUMMER, FALL
	}

	// main method
	public static void main(String[] args) {
		// traversing the enum
		for (Season s : Season.values())
			System.out.println(s);
	}
}


//The Enum in Java is a data type which contains a fixed set of constants.

//It can be used for days of the week (SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, and SATURDAY) ,
//directions (NORTH, SOUTH, EAST, and WEST), season (SPRING, SUMMER, WINTER, and AUTUMN or FALL), 
//colors (RED, YELLOW, BLUE, GREEN, WHITE, and BLACK) etc. 
//According to the Java naming conventions, we should have all constants in capital letters. 
//So, we have enum constants in capital letters.

//Java Enums can be thought of as classes which have a fixed set of constants (a variable that does not change). 
//The Java enum constants are static and final implicitly. It is available since JDK 1.5.