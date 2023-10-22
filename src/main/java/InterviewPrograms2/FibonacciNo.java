package InterviewPrograms2;

public class FibonacciNo {

	public static void main(String[] args) {
		int a=0,b=1;
		int temp;
		
		System.out.print("0 1 ");
		for(int i=0;i<=10;i++) {
			temp=a+b;
			a=b;
			b=temp;
			
			System.out.print(b+" ");
		}
		

	}

}
