package InterviewPrograms;

public class BLR_0008 {
	
	public static void main(String args[]) {
		for(int a=1;a<=100;a++) 
		isPrime(a);
		
	}
	
	static void isPrime(int n) {
		int count=0;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				count=1;
				break;
			}
		}
		if(count==0) {
			System.out.println("Number "+ n +" is prime");
		}else {
			System.out.println("Number "+ n +" is NOT prime");
		}
		
	}

}
