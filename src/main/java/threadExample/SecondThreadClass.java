package threadExample;

public class SecondThreadClass implements Runnable {

	@Override
	public void run() {
		System.out.println("Run >>> >> >>>>>>>");
	}
	
	
	public static void main(String args[]) {
		SecondThreadClass t1=new SecondThreadClass();
		SecondThreadClass t2=new SecondThreadClass();
		SecondThreadClass t3=new SecondThreadClass();
		SecondThreadClass t4=new SecondThreadClass();
		SecondThreadClass t5=new SecondThreadClass();
		Thread tr1=new Thread(t1);
		tr1.start();
	}

}
