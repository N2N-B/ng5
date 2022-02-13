package solid;


//public interface Athlete {
//
//    void compete();
//
//    void swim();
//
//    void highJump();
//
//    void longJump();
//
//}

//We have added the method compete, but also there some extra methods like swim, highJump , and longJump.
//
//Suppose that John Doe is a swimming athlete. By implementing the Athlete interface, 
//we have to implement methods like highJump and longJump, which JohnDoe will never use.

//public class JohnDoe implements Athlete {
//
//    @Override
//    public void compete() {
//        System.out.println("John Doe started competing");
//    }
//
//    @Override
//    public void swim() {
//        System.out.println("John Doe started swimming");
//    }
//
//    @Override
//    public void highJump() {
//    }
//
//    @Override
//    public void longJump() {
//    }
//}

//The same problem will occur for another athlete who might be a field Athlete competing in the high jump and long 
//jump.
//
//We will follow the interface segregation principle and refactor the original interface:

interface Athlete {

	void compete();
}

//Then we will create two other interfaces — one for Jumping athletes and one for Swimming athletes.

interface SwimmingAthlete extends Athlete {

	void swim();
	
	
	

}

interface JumpingAthlete extends Athlete {

	void highJump();

	void longJump();

}

//And therefore John Doe will not have to implement actions that he is not capable of performing:

class JohnDoe implements SwimmingAthlete {
	public void compete() {
		System.out.println("John Doe started competing");
	}

	public void swim() {
		System.out.println("John Doe started swimming");
	}

}

public class InterfaceSegregationPrinciple {
	public static void main(String[] args) {
		SwimmingAthlete swimmingAthlete = new JohnDoe();
		swimmingAthlete.compete();
		swimmingAthlete.swim();

	}
}

//Interface Segregation Principle
//The principle states that the larger interfaces split into smaller ones. Because the implementation classes use 
//only the methods that are required. We should not force the client(JohnDoe) to use the methods such as void highJump();

//void longJump(); 
//that client(JohnDoe) not want to use.
//
//The goal of the interface segregation principle is similar to the single responsibility principle.