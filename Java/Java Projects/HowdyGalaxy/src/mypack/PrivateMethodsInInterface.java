package mypack;

interface Passesinfootball {
	// default method

	default void shortpass() {
		longpass();
	}
	// private method

	private void longpass() {
		System.out.println(
				"Switching the play from one side of the field to the other side where a player may have more space.");
	}

}

public class PrivateMethodsInInterface implements Passesinfootball {
	public static void main(String args[]) {
		Passesinfootball passesinfootball = new PrivateMethodsInInterface();
		passesinfootball.shortpass();

	}

}
//private method is defined within the the interface
// private method is implemented within the interface