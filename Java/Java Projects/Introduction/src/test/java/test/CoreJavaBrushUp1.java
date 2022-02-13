package test;

public class CoreJavaBrushUp1 {
	public static void main(String[] args) {
		int[] arrayOne = { 1, 2, 4, 5, 6, 7, 8, 9, 10, 122 };
		for (int i = 0; i < arrayOne.length; i++) {
			if (arrayOne[i] % 2 == 0) {
				System.out.println(arrayOne[i] + " is a multiple of 2");
				break;
			}
			else{
				System.out.println(arrayOne[i] + " is not a multiple of 2");
			}
		}
	}
}
