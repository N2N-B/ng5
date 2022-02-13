package solid;

//Student.java

class Student {
	String nameofthestudent;

	public void addStudent(String nameofthestudent)

	{
		System.out.println("Name of the student: " + nameofthestudent);

	}
}

// PrintStudentDetails.java

class PrintStudentDetails {
	String profession;

	public void printDetails(String profession)

	{
		System.out.println("Profession: " + profession);
	}
}

//Percentage.java

class Percentage {
	int x;
	int y;

	public void calculatePercentage(int x, int y)

	{
		int p;

		p = (x / y * 100);
		System.out.println("Percentage is: " + p + "%");

	}
}
//Hence, we have achieved the goal of the single responsibility principle by separating the functionality into three
//separate classes.

public class SingleResponsibilityPrinciple {
	public static void main(String args[]) {
		Student student = new Student();
		student.addStudent("Naren Bagavathy");

		PrintStudentDetails printStudentDetails = new PrintStudentDetails();
		printStudentDetails.printDetails("Software Engineer");

		Percentage percentage = new Percentage();
		percentage.calculatePercentage(400, 200);
	}
}

//Single Responsibility Principle
//The single responsibility principle states that every Java class must perform a single functionality. 

//Implementation of multiple functionalities in a single class will mashup the code and if any modification is required
//may affect the whole class. 

//It precise the code and the code can be easily maintained. 
