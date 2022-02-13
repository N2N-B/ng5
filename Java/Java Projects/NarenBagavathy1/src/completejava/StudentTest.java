package completejava;

class Student {
	// State or variables
	int id;
	String name;
	String gender;

	// Behaviour or methods
	public String updateName(String newName) {
		name = newName;
		return name;
      }

	public int updateId(int newId) {
		id = newId;
		return id;
}

	public String updateGender(String studentGender) {
		gender = studentGender;
		return gender;
      }
}

// Encapsulated class or test class to update the profile of the student
public class StudentTest {
	public static void main(String[] args) {
		Student student = new Student();
		student.id = 3;
		student.name = "Jonh";
		student.gender = "Female";
		
		System.out.println(student.updateId(1));
        System.out.println(student.updateName("John"));
		System.out.println(student.updateGender("Male"));

	}
}
