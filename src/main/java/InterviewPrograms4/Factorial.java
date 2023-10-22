package InterviewPrograms4;

public class Factorial {

	public static void main(String[] args) {
		int no=5;
		int fac=1;
		while(no>0) {
			fac=fac*(no);
			no=no-1;
		}
		System.out.println(fac);
		System.out.println();
		
		System.out.println(fact(6));
	}
	
	static int fact(int nos) {
		if(nos<=0) {
			return 1;
		}
		return fact(nos-1)*nos;
	}

}
