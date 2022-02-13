package pack2;

public class Boxing {

	@SuppressWarnings("removal")
	public static void main(String args[]) {
		int a = 50;
		Integer a2 = new Integer(a);// Boxing

		Integer a3 = 5;// Boxing

		System.out.println(a2 + " " + a3);

		Integer b = new Integer(50);
		
		// unboxing 
		 int c = b;  
         
			System.out.println(c);
		}
	}



//Autoboxing and Unboxing:
//The automatic conversion of primitive data types into its equivalent Wrapper type is known as boxing and 
//opposite operation is known as unboxing. 
//This is the new feature of Java5. So java programmer doesn't need to write the conversion code.

//Advantage of Autoboxing and Unboxing:
//No need of conversion between primitives and Wrappers manually so less coding is required.