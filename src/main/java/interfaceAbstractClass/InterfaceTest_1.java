package interfaceAbstractClass;


/**
 * public,static,final variables
 * Can only have abstract methods + Static & Defaults also from Java 8
 * @author Rachit
 *
 */
public interface InterfaceTest_1 {

	//Interface cant have constructors
	/*
	 * InterfaceTest_1(){ System.out.println("Under Interface consttructor"); }
	 */


	//Only Public static final is allowed
	//default
	int a=1;

	//private not allowed
	//private int b=2;

	//public
	public int c=3;

	//protected not permitted
	//protected int d=4;

	//final
	final int e=5;
	//static
	static int f=6;

	//Abstract Methods
	public void getSpeed();
	public abstract void getRpm();

	//Non-abstract Method
	public static void getPetrol() {
		System.out.println("Petrol full");
	}

	//Final Non-abstract method
	public default void getPrivateValue() {
	//	return b;
	}
	
	//Must be static or final
	/*
	 * public void testMethod() {
	 * 
	 * }
	 */

	//static non-abstract method
	public static void main(String args[]) {
		System.out.println("Under main Method");
	}

}
