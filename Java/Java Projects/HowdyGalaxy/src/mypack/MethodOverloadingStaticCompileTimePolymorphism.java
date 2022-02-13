package mypack;

public class MethodOverloadingStaticCompileTimePolymorphism {
	// 1)Method Overloading: changing no. of arguments
	// In this example, we have created two methods, first add() method performs
	// addition of two numbers and second add method performs addition of three
	// numbers.
	//
	// In this example, we are creating static methods so that we don't need to
	// create instance for calling methods.

	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}

//	2) Method Overloading: changing data type of arguments
//	In this example, we have created two methods that differs in data type. 
	// The first mul method receives two integer arguments and second mul method
	// receives two double arguments.

	static int mul(int y, int z) {
		return y * z;
	}

	static double mul(double y, double z) {
		return y * z;
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		MethodOverloadingStaticCompileTimePolymorphism stu1 = new MethodOverloadingStaticCompileTimePolymorphism();

		System.out.println(MethodOverloadingStaticCompileTimePolymorphism.add(8, 8, 8));
		System.out.println(MethodOverloadingStaticCompileTimePolymorphism.mul(6.6d, 6.6d));

	}

}
