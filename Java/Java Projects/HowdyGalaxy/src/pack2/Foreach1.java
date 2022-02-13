package pack2;

public class Foreach1 {

	public static void main(String args[]) {
		// declaring an array
		int arr[] = { 12, 13, 14, 44 };
		// traversing the array with for-each loop
		for (int i : arr) {
			System.out.println(i);
		}
	}

}

//Java For-each Loop | Enhanced For Loop
//It provides an alternative approach to traverse the array or collection in Java. 
//It is mainly used to traverse the array or collection elements. 
//The advantage of the for-each loop is that it eliminates the possibility of bugs and makes the code more readable.