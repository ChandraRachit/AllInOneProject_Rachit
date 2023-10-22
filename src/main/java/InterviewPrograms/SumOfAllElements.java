package InterviewPrograms;

public class SumOfAllElements {
	public static void main(String args[]) {
		int no=1234;
		int r=0;
		while(no>0) {
			r=r+no%10;
			no=no/10;
		}
		System.out.println(r);
	}

}
