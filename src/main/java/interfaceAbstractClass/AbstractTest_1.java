package interfaceAbstractClass;


/**
 * Final,non-final,static,non-static,public ,private,protected,default variables 
 * Abstract method,Non-abstract Methods(final,static)
 * @author Rachit
 *
 */
public abstract class AbstractTest_1 {
	
	AbstractTest_1(){
		System.out.println("Under Abstract class consttructor");
	}
	
	//default
	int a=1;
	//private
	private int b=2;
	//public
	public int c=3;
	//protected
	protected int d=4;
	//final
	final int e=5;
	//static
	static int f=6;
	
	//Abstract Methods
	public abstract void getSpeed();
	public abstract void getRpm();
	
	//Non-abstract Method
	public void getPetrol() {
		System.out.println("Petrol full");
	}
	
	//Final Non-abstract method
	public final int getPrivateValue() {
		return b;
	}
	
	//static non-abstract method
	public static void main(String args[]) {
		System.out.println("Under main Method");
	}

}
