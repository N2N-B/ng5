package mypack;
class Animal {  
String color;  
Animal(String color){  
this.color = color;  
}  
void eat(String name) {  
System.out.println(name + " is eating .....");  
}  
void show(String name) {  
System.out.println(name + " is of " + color + " Color");  
}  
}  
 class Dog extends Animal{  
Dog(String color) {  
super(color);  
// TODO Auto-generated constructor stub  
}  
void eat(String name) {  
System.out.println(name + " is eating ....");  
}  
}  

public class ClassCastException {
	public static void main(String[] args) {  
		// TODO Auto-generated method stub  
		Dog dog = new Dog("black");  
		Animal animal = new Animal("White");  
		animal = dog;  
		animal.show("My dog");  
		  
		Animal animal1 = new Animal("White");  
		Dog d = (Dog)animal1;  
		}  

}

//ClassCast Exception in Java
//ClassCast Exception in Java is one of the unchecked exceptions that occur when we try to convert one class type object into another class type.
//
//ClassCast Exception is thrown when we try to cast an object of the parent class to the child class object.