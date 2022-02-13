package mypack;

class EmployeeName {
	String firstname;
	String lastname;

	public EmployeeName(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}
}

class EmployeeInfo {
	int id;
	EmployeeName employeename;

	EmployeeInfo(int id, EmployeeName employeename) {
		this.id = id;
		this.employeename = employeename;

	}

	void showemployeedetails() {
		System.out.println("Employee Id: " + " " + id);
		System.out.println("Employee Name is" + " " + employeename.firstname + " " + employeename.lastname);

	}

}

public class HasARelationshipOrAggregation {
	public static void main(String[] args) {
		EmployeeName employeename = new EmployeeName("Naren", "Bagavathy");
		EmployeeInfo eo = new EmployeeInfo(1, employeename);
		eo.showemployeedetails();
	}

}


// Has-A Relationship
//class EmployeeName has 2 properties firstname and lastname of an entity.It's not associated with anything.
//employeename is nothing but the instance of the class EmployeeName
//EmployeeInfo has EmployeeName employeename as a property.

//Has-A Relationship has class as a property in a class.
//Has-A Relationship is a containment.

//Example
//EmployeeInfo containing EmployeeName employeename.
//EmployeeInfo has a EmployeeName employeename. Vice versa can't be true.That's what Has-A Relationship is all about.
//employeename could be used anywhere else.It's sort of detached.It's not associated with anything.
//It's loosely coupled
