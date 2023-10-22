package threadExample;

public class FirstThreadClass extends Thread{

	public static void main(String args[]) {
		FirstThreadClass f1=new FirstThreadClass();
		FirstThreadClass f2=new FirstThreadClass();
		FirstThreadClass f3=new FirstThreadClass();
		FirstThreadClass f4=new FirstThreadClass();
		FirstThreadClass f5=new FirstThreadClass();
		f1.start();
		f2.start();
		f3.start();
		f4.start();
		f5.start();
		
	}
	
	public void run() {
		System.out.println("Run >>> >>>> >>>");
	}
}
