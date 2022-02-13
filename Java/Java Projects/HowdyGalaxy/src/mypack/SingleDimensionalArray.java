package mypack;

public class SingleDimensionalArray {

	public static void main(String[] args) {

		// Array initializaton
		// Creating an integer array values
		int[] sa = { 2, 4, 6, 8, 10 };
		System.out.println("Element at Index 0: " + " " + sa[0]);
		System.out.println("Element at Index 1: " + " " + sa[1]);
		System.out.println("Element at Index 2: " + " " + sa[2]);
		System.out.println("Element at Index 3: " + " " + sa[3]);
		System.out.println("Element at Index 4; " + " " + sa[4]);

	}
}

//Java Arrays

//Java array is an object which contains elements of a similar data type

//Array in Java is index-based, the first element of the array is stored at the 0th index, 2nd element is stored 
//on 1st index and so on.

//Advantages
//Code Optimization: It makes the code optimized, we can retrieve or sort the data efficiently.
//Random access: We can get any data located at an index position.

//Disadvantages
//Size Limit: We can store only the fixed size of elements in the array. It doesn't grow its size at runtime. 
//To solve this problem, collection framework is used in Java which grows automatically.

//Multidimensional Array in Java
//In such case, data is stored in row and column based index (also known as matrix form).

//Syntax to Declare Multidimensional Array in Java

//dataType[][] arrayRefVar; (or)  
//dataType [][]arrayRefVar; (or)  
//dataType arrayRefVar[][]; (or)  
//dataType []arrayRefVar[];   
//Example to instantiate Multidimensional Array in Java
//
//int[][] arr=new int[3][3];//3 row and 3 column  

//Example to initialize Multidimensional Array in Java

//arr[0][0]=1; 

//Jagged Array in Java
//If we are creating odd number of columns in a 2D array, it is known as a jagged array. 
//In other words, it is an array of arrays with different number of columns.