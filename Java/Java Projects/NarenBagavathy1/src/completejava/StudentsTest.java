package completejava;

public class StudentsTest {
	public static void main(String[] args) {
		// 1.Creating a student object
		Students students = new Students();

		// 2.Setting student's state
		students._id = 1;
		students.name = "Joan";
		students.$age = 20;
		students.gender = "Male";

		// 3.Setting student's behavior i.e, Update profile with a students age
		students.updateProfile(2, 18, "Joanna", "Female");
		// Printing the updated students details
		System.out.println(students.updateProfile(2, 18, "Joanna", "Female"));
	}
}
