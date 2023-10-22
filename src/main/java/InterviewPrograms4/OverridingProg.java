package InterviewPrograms4;

class Bank {
	int getInterest() {
		return 1;
	}
}

class Axis extends Bank {
	int getInterest() {
		return 5;
	}
}

class Icici extends Bank {
	int getInterest() {
		return 6;
	}
}

class Hdfc extends Bank {
	int getInterest() {
		return 7;
	}
}

public class OverridingProg {

	public static void main(String[] args) {
		Axis a = new Axis();
		System.out.println("Axis = " + a.getInterest());

		Icici i = new Icici();
		System.out.println("Icici = " + i.getInterest());

		Hdfc h = new Hdfc();
		System.out.println("Hdfc = " + h.getInterest());
	}

}
