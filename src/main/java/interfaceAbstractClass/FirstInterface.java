package interfaceAbstractClass;

/**
 * public,static,final variables
 * Can only have abstract methods + Static & Defaults also from Java 8
 * @author Rachit
 *
 */
public interface FirstInterface extends SecondInterface {
	public static final int a = 0;
	final int b=10;
	static int c=10;
	
	
	static void onStart() {
		System.out.println("Hello");
	}
	
	default void onStop() {
		System.out.println("Hello2");
	}
	
	static void onSkip() {
		System.out.println("Hello3");
	}
	
	default void onEnd() {
		System.out.println("Hello3");
	}
	
	
	abstract void getPassword();

}
