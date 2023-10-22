package interfaceAbstractClass;

public class FirstAbstractExtends extends FirstAbstract {

	public static void main(String args[]) {
		System.out.println("FirstAbstractExtends Main Method");
		staticMethod();		

		FirstAbstractExtends f=new FirstAbstractExtends();
		f.methodToCall();
	}
	
	public void methodToCall() {
		car();
		truck();
		finalMethod();
		nonStaticMethod();
	}
	

	@Override
	void car() {
		System.out.println("Car");
	}

	@Override
	void truck() {
		System.out.println("Truck");

	}

}
