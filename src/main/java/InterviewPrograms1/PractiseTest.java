package InterviewPrograms1;

public class PractiseTest {

	final int num = 10;

	public void display() {
		final int num = 12;
		Runnable r = new Runnable() {
			final int num = 15;

			public void run() {
				int num = 20;
				System.out.println(this.num);
			}
		};
		r.run();
	}

	public static void main(String[] args) {
		PractiseTest sv = new PractiseTest();
		sv.display();
	}

}