package pack4;

public class ThreeWaysToAccessThePackage {

	public static void main(String args[]) {
		mypack.AddTwoNumbers ma = new mypack.AddTwoNumbers();
		ma.perfecto(30, 50);
		Integer result = ma.sum(50, 50);
		System.out.println("Addition of two numbers is" + " " + result);

	}
}


//Three Ways To Access The Package From Outside The Package
// 1.import mypack.*; (import package.*;) & create an object using the pack1 class name i.e.,AddTwoNumbers
// 2. import mypack.AddTwoNumbers; (import package.classname;) & create an object using the pack1 class name i.e.,AddTwoNumbers
// 3. fully qualified name => mypack.AddTwoNumbers (package.classname)