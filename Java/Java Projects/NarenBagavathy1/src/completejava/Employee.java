package completejava;

import java.math.BigDecimal;

class Employee {

	byte _age = 1_8; // [-128 to 127].
	short $rank = 1_6_5; // [ -32768 to 32767].Underscore represents readability.
	int employeeID = 3_00_00_00_00; // [-2147483648 to 2147483647].
	long phone_Number = 22_34_56_78_90L;// [-9223372036854775808 to 9223372036854775807].

	// Integer literals: int literal , long literal.
	// For example: byte age = 18; Here 18 is the int literal; long phoneNumber =
	// 2234567890L is long literal;
	// From Java 7 ,Underscore represents readability in int literal , long literal
	// ends with L.

	// Floating Point Numbers such as float, double are mostly used in approximating gpa of students so as to get round off or approximate results or figures.
	float $employeeSalary = 56569.9760f;
	double _taxSalary = 1565.8e4;

	// BigDecimal is mostly used in financial calculations so as to get exact results or figures.
	BigDecimal salary = new BigDecimal("56569.9760");

	// Integer Numbers
	byte minValueByte = Byte.MIN_VALUE;
	byte maxValueByte = Byte.MAX_VALUE;

	short minValueShort = Short.MIN_VALUE;
	short maxValueShort = Short.MAX_VALUE;

	int minValueInteger = Integer.MIN_VALUE;
	int maxValueInteger = Integer.MAX_VALUE;

	long minValueLong = Long.MIN_VALUE;
	long maxValueLong = Long.MAX_VALUE;

	float minValueFloat = Float.MIN_VALUE;
	float maxValueFloat = Float.MAX_VALUE;

	double minValueDouble = Double.MIN_VALUE;
	double maxValueDouble = Double.MAX_VALUE;

	void compute() {
		int nextEmployeeID = employeeID + 1000;
		System.out.println("Employee ID: " + employeeID);
		System.out.println("Next Employee ID: " + nextEmployeeID);
		System.out.println("Age of the employee: " + _age);
		System.out.println("Rank of the employee: " + $rank);
		System.out.println("Phonenumber of the employee: " + phone_Number);
		System.out.println("Salary of the employee: " + $employeeSalary);
		System.out.println("Salary tax of the employee: " + _taxSalary);
		System.out.println("Minimum value of the byte: " + minValueByte);
		System.out.println("Maximum value of the byte: " + maxValueByte);
		System.out.println("Minimum value of the short: " + minValueShort);
		System.out.println("Maximum value of the short: " + maxValueShort);
		System.out.println("Minimum value of the integer: " + minValueInteger);
		System.out.println("Maximum value of the integer: " + maxValueInteger);
		System.out.println("Minimum value of the long: " + minValueLong);
		System.out.println("Maximum value of the long: " + maxValueLong);
		System.out.println("Minimum value of the float: " + minValueFloat);
		System.out.println("Maximum value of the float: " + maxValueFloat);
		System.out.println("Minimum value of the double: " + minValueDouble);
		System.out.println("Maximum value of the double: " + maxValueDouble);
		System.out.println("Salary of the employee: " + salary);

	}

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.compute();

		// Float and Double is used to get approximate results
		System.out.println(1 - 0.9);
		System.out.println(0.1 + 0.2);

		// BigDecimal is used to get exact results
		BigDecimal point1 = new BigDecimal("0.1");
		BigDecimal point2 = new BigDecimal("0.2");
		System.out.println(point1.add(point2));

		BigDecimal one = new BigDecimal("1");
		BigDecimal point9 = new BigDecimal("0.9");
		System.out.println(one.subtract(point9));

	}
}
