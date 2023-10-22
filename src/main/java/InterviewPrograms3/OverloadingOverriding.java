package InterviewPrograms3;

public class OverloadingOverriding {

	public static void main(String[] args) {
		MyClass a = new YourClass();
		a.sum(10, 20);
		MyClass m = new MyClass();
		m.sum(10, 20);
		m.sum(10.0, 20.0);
	}
}

class MyClass {
	void sum(int a, int b) {
		System.out.println(a + b + " MyClass");
	}

	void sum(double a, double b) {
		System.out.println(a + b + " MyClassDouble");
	}
}

class YourClass extends MyClass {
	void sum(int a, int b) {
		System.out.println(a + b + " YourClass");

	}
}