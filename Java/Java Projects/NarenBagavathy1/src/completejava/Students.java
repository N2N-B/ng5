package completejava;

public class Students {
	int _id;
	int $age;
	String gender;
	String name;

	boolean updateProfile(int newid, int newAge, String newGender, String newName) {
		_id = newid;
		$age = newAge;
		gender = newGender;
		name = newName;
		return true;
	}
}
