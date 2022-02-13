package mypack;

public class MultipleCatchBlocks {

	@SuppressWarnings({ "null", "unused" })
	public static void main(String[] args) {
		try {
			
			Object[] stringArray = new String[4];
			stringArray[1] = "w3spoint";
			stringArray[2] = 20; // ArrayStoreException

			String t = "abc";
			int i = Integer.parseInt(t);// NumberFormatException

			String s = null;
			System.out.println(s.length());// NullPointerException

			int denominator = 0;
			System.out.println(1000 / denominator);// ArithmeticException
			// Array initializaton
			// Creating an integer array values
			int[] sa = { 2, 4, 6, 8, 10 };
			System.out.println("Element at Index 0: " + " " + sa[10]);// ArrayIndexOutOfBoundsException
		} catch (ArrayStoreException exception) {
			exception.printStackTrace();
		} catch (NumberFormatException exception) {
			System.out.println("Number Format Exception has occurred");
		}

		catch (NullPointerException exception) {
			System.out.println("Null Pointer Exception has occurred");
		}

		catch (ArithmeticException exception) {
			System.out.println("Arithmetic Exception has occurred");
		}

		catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("Array Index Out Of Bounds Exception has occurred");
		}

		catch (Exception exception) {
			System.out.println("Generic Exception Handler");
		}
	}

}

//Common Scenarios of Java Exceptions
//There are given some scenarios where unchecked exceptions may occur. They are as follows:

//1) A scenario in which ArithmeticException occurs
//If we divide any number by zero, there occurs an ArithmeticException.

//2) A scenario in which NullPointerException occurs
//If we have a null value in any variable, performing any operation on the variable throws a NullPointerException.

//3) A scenario in which NumberFormatException occurs
//If the formatting of any variable or number is mismatched, it may result into NumberFormatException. 
//Suppose we have a string variable that has characters;
//converting this variable into digit will cause NumberFormatException.

//4) A scenario in which ArrayIndexOutOfBoundsException occurs
//When an array exceeds to it's size, the ArrayIndexOutOfBoundsException occurs. 
//there may be other reasons to occur ArrayIndexOutOfBoundsException

//5 A scenario where ArrayStoreException occurs
//The java.lang.ArrayStoreException is an unchecked exception and it can occur when we try to store an object of a
//type in an array of objects of a different datatype. Usually, one would come across java.lang.ArrayStoreException:
//java.lang.Integer which occurs when an attempt is made to store an integer in an 
//array of different type like an array of String or array of float, etc.