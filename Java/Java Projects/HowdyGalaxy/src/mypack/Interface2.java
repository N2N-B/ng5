package mypack;

interface Naren {
	void carrer();
}

class Humanitarian implements Naren {
	public void carrer() {
		System.out.println("Best humanitarian in the galaxy");
	}
}

class Programmer implements Naren {
	public void carrer() {
		System.out.println("Best programmer in the galaxy");
	}
}

class Tycoon implements Naren {
	public void carrer() {
		System.out.println("Best tycoon in the galaxy");
	}
}

class Industrialist implements Naren {
	public void carrer() {
		System.out.println("Best industrialist in the galaxy");
	}
}

class Enterpreneur implements Naren {
	public void carrer() {
		System.out.println("Best enterpreneur in the galaxy");
	}
}

class Simpleperson implements Naren {
	public void carrer() {
		System.out.println("Simple person in the galaxy");
	}
}

class BoyNextDoor implements Naren {
	public void carrer() {
		System.out.println("I am the boy next door type");
	}
}

class Director implements Naren {
	public void carrer() {
		System.out.println("Best director in the galaxy");
	}
}

class MostDesirablePerson implements Naren {
	public void carrer() {
		System.out.println("Most Desirable Person in the galaxy");
	}
}

class YouthSensation implements Naren {
	public void carrer() {
		System.out.println("Youth Sensation of the galaxy");
	}
}

class HandsomeHunk implements Naren {
	public void carrer() {
		System.out.println("Handsome Hunk of the galaxy");
	}
}

class FootballPlayer implements Naren {
	public void carrer() {
		System.out.println("Best football player in the galaxy");
	}
}

class MrCool implements Naren {
	public void carrer() {
		System.out.println("Naren is the coolest person in the galaxy");
	}
}

class ManOfHumour implements Naren {
	public void carrer() {
		System.out.println("Best man Of humour in the galaxy");
	}
}

public class Interface2 {
	public static void main(String args[]) {
		Naren nn = new Humanitarian();
		nn.carrer();

		Naren nn1 = new Simpleperson();
		nn1.carrer();

		Naren nn2 = new ManOfHumour();
		nn2.carrer();

		Naren nn3 = new MrCool();
		nn3.carrer();

		Naren nn4 = new FootballPlayer();
		nn4.carrer();

		Naren nn5 = new Programmer();
		nn5.carrer();

		Naren nn6 = new Enterpreneur();
		nn6.carrer();

		Naren nn7 = new Tycoon();
		nn7.carrer();

		Naren nn8 = new Industrialist();
		nn8.carrer();

		Naren nn9 = new Director();
		nn9.carrer();

		Naren nn10 = new HandsomeHunk();
		nn10.carrer();

		Naren nn11 = new YouthSensation();
		nn11.carrer();

		Naren nn12 = new MostDesirablePerson();
		nn12.carrer();

		Naren nn13 = new BoyNextDoor();
		nn13.carrer();

	}

}
