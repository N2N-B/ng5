package packet;

import java.io.*;

public class ObjectOutputInputStreamSerializeDeserialize {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		VehicleInfo rollsroyce = new VehicleInfo("Rolls Royce", 4, 30);
		File serializedeserializefile = new File("C:\\NarenIO\\serializedFile.bin");
		new ObjectOutputInputStreamSerializeDeserialize().serialize(serializedeserializefile, rollsroyce);
		new ObjectOutputInputStreamSerializeDeserialize().deserialize(serializedeserializefile);

	}

	private void serialize(File file, VehicleInfo instanceofvehicleinfo) throws IOException {
		FileOutputStream fileoutputstream = new FileOutputStream(file);
		ObjectOutputStream objectoutputstream = new ObjectOutputStream(fileoutputstream);
		objectoutputstream.writeObject(instanceofvehicleinfo);
		objectoutputstream.flush();
		objectoutputstream.close();
	}

	private void deserialize(File file) throws IOException, ClassNotFoundException {
		FileInputStream fileinputstream = new FileInputStream(file);
		ObjectInputStream objectinputstream = new ObjectInputStream(fileinputstream);
		VehicleInfo deserializeobject = (VehicleInfo) objectinputstream.readObject();
		System.out.println(
				"[Deserialization] Name of the vehicle in serialized file: " + deserializeobject.nameofthevehicle);
		System.out.println("[Deserialization] Number of wheels in the vehicle in serialized file: "
				+ deserializeobject.numberofwheels);
		System.out.println("[Deserialization] Mileage of the vehicle in serialized file: " + deserializeobject.mileage);

		objectinputstream.close();
	}
}

//Serialization in Java is a mechanism of writing the state of an object into a byte-stream. 
//It is mainly used in Hibernate, RMI, JPA, EJB ,cloud and JMS technologies

//For serializing the object, we call the writeObject() method of ObjectOutputStream class, and 
//for deserialization we call the readObject() method of ObjectInputStream class.

//We must have to implement the Serializable interface for serializing the object.
//Advantages of Java Serialization
//It is mainly used to travel object's state on the network(ex:distributed computer network) (that is known as marshalling).

//java.io.Serializable interface
//Serializable is a marker interface (has no data member and method).
//It is used to "mark" Java classes so that the objects of these classes may get a certain capability.
//The String class and all the wrapper classes implement the java.io.Serializable interface by default.

//ObjectOutputStream class
//The ObjectOutputStream class is used to write primitive data types, and Java objects to an OutputStream.

//Externalizable in java
//The Externalizable interface provides the facility of writing the state of an object into a byte stream in compress format. It is not a marker interface.

//The Externalizable interface provides two methods:
//
//public void writeExternal(ObjectOutput out) throws IOException
//public void readExternal(ObjectInput in) throws IOException


//If you don't want to serialize any data member of a class, you can mark it as transient.
//
//Employee.java
//
//class Employee implements Serializable{  
// transient int id;  
// String name;  
// public Student(int id, String name) {  
//  this.id = id;  
//  this.name = name;  
// }  
//}  
//Now, id will not be serialized, so when you deserialize the object after serialization, you will not get the value of id. 
//It will return default value always. In such case, it will return 0 because the data type of id is an integer.

//ObjectInputStream class
//An ObjectInputStream deserializes objects and primitive data written using an ObjectOutputStream.

//SerialVersionUID
//The serialization process at runtime associates an id with each Serializable class which is known as SerialVersionUID.
//It is used to verify the sender and receiver of the serialized object.


//Java Deserialization
//Deserialization is the process of reconstructing the object from the serialized state.
//It is the reverse operation of serialization. Let's see an example where we are reading the data from a deserialized object.

//Java-Explicitly Throw IOException
//
//In the above program, the main( ) method declares that it throws IOException and therefore we need not use try……….catch statements.
//I/O exceptions explicitly thrown out of main( ), this method likely to generate exceptions types of I/O exceptions. 
//Instead of handling this object by itself, this method instructs its caller(JVM) to handle this object.


//IOException has many sub classes that are specific in nature. 
//That means, when your application searching to read a file, if the file is not found that there is a FileNotFoundException to be thrown. 
//FileNotFoundException is a subclass of IOException

//An SQLException can occur both in the driver and the database. 
//When such an exception occurs, an object of type SQLException will be passed to the catch clause.

////Java File Class. The File class is an abstract representation of file and directory pathname. A pathname can be either absolute or relative.
