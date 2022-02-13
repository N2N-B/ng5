package mypack;

public class AddTwoNumbers {
	// Non-void Method Using int
	public int perfecto(int a, int b) {
		System.out.println(a + b);
		return a;
	}

	// Method Using Wrspper Class Integer
	public Integer sum(Integer arg1, Integer arg2) {
		Integer result = arg1 + arg2;
		return result;
	}

	public static void main(String[] args) {
		AddTwoNumbers add = new AddTwoNumbers();
		add.perfecto(30, 50);
		Integer result = add.sum(50,50);
		System.out.println("Addition of two numbers is" + " " + result);


	}

}

//Addition of two numbers using Non-void methods and Wrapper class(Integer,String) methods

//Non-void methods differ from void methods in that they give something back (or) returns something back.
