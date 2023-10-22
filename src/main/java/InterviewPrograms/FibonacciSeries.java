package InterviewPrograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a=0,b=1,c;
		System.out.print(a+" "+b+" ");
		
		for(int i=0;i<100;i++) {
			c=a+b;
			a=b;
			b=c;
			if(c>100) {
				break;
			}
			System.out.print(c+" ");
			
		}

	}

}
