package mypack;

public class FinallyInAssociationWithTryCatchStatement {
	// A method that throws an exception and has finally.
	// This method will be called inside try-catch.
	static void A() {
		try {
			System.out.println("inside A");
			throw new RuntimeException("demo");
		} finally {
			System.out.println("A's finally");
		}
	}

	// This method also calls finally. This method
	// will be called outside try-catch.
	static void B() {
		try {
			System.out.println("inside B");
			return;
		} finally {
			System.out.println("B's finally");
		}
	}

	public static void main(String args[]) {
		try {
			A();
		} catch (Exception e) {
			System.out.println("Exception caught");
		}
		B();
	}

}

//The finally keyword is used in association with a try/catch block and guarantees that a section of code will be 
//executed, even if an exception is thrown. 
//Just as final is a reserved keyword, finally is also a reserved keyword in java i.e, we can’t use it as an 
//identifier