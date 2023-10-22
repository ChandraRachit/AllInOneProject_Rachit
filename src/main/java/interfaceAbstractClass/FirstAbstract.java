package interfaceAbstractClass;

public abstract class FirstAbstract {

	public static void main(String[] args) {
		System.out.println("Under FirstAbstract Class main method");
	}
	
	
	//Constructor
	FirstAbstract(){
		System.out.println("Constructor");
	}

	//Variables
	 int a=10;
	 final int b=20;
	 private int c=2;
	 protected int d=30;
	 public int e=0;
	 static int f=98;
	 
	//Abstract Methods
	abstract void car();
	abstract void truck();
	
	//Final Non-Abstract Methods
	final void finalMethod() {
		System.out.println("Final Method");
	}
	
	//static Non-Abstract Methods
	static void staticMethod() {
		System.out.println("Static Method");
	}
	
	//Non-Abstract Methods
	void nonStaticMethod() {
		System.out.println("Non-Static Method");
	}
	
}
