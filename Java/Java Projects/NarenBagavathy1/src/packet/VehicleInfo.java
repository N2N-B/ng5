package packet;

import java.io.Serializable;

@SuppressWarnings("serial")
public class VehicleInfo implements Serializable {
	Integer numberofwheels;
	Integer mileage;
	String nameofthevehicle;
	VehicleInfo(String nameofthevehicle, Integer numberofwheels ,Integer mileage){
		this.numberofwheels=numberofwheels;
		this.mileage=mileage;
		this.nameofthevehicle=nameofthevehicle;

	}
}

//java.io.Serializable interface
//Serializable is a marker interface (has no data member and method).
//It is used to "mark" Java classes so that the objects of these classes may get a certain capability.
//The String class and all the wrapper classes implement the java.io.Serializable interface by default.