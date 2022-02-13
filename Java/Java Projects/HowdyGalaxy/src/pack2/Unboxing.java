package pack2;

public class Unboxing {
	@SuppressWarnings("removal")
	public static void main(String args[]) {
		Integer i = new Integer(50);
		int a = i;

		System.out.println(a);
	}
}

//Autoboxing and Unboxing:
//The automatic conversion of primitive data types into its equivalent Wrapper type is known as boxing and 
//opposite operation is known as unboxing. 
//This is the new feature of Java5. So java programmer doesn't need to write the conversion code.

//Advantage of Autoboxing and Unboxing:
//No need of conversion between primitives and Wrappers manually so less coding is required.