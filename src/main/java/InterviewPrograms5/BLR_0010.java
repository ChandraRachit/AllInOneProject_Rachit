package InterviewPrograms5;

public class BLR_0010 {
	public static void main(String args[]) {
		int n=123;
		int a=0;
		while(n>0) {
			a=a*10+n%10;
			n=n/10;
		}
		System.out.println(a);
	}

}
