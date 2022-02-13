package mypack;

interface Exercise {
	// default method

	default void jogging() {
		System.out.println("Default Method invoked");
	}
	// abstract method

	abstract void swimming(String msg);
}

class ExtracurricularActivities implements Exercise {
	// Implementation of abstract method
	public void swimming(String msg) {
		System.out.println(msg);

	}
}

public class DefaultMethodsInInterface {
	public static void main(String args[]) {
		ExtracurricularActivities extracurricularActivities = new ExtracurricularActivities();
		// default method
		extracurricularActivities.jogging();
//abstract method
		extracurricularActivities.swimming("Abstract Method invoked");

	}
}
//DefaultMethodsInInterface has an implentation inside the interface