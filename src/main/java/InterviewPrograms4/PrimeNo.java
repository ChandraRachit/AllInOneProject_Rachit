package InterviewPrograms4;

public class PrimeNo {

	public static void main(String[] args) {
		int number =11;
		int count=1;
		if(number>1) {
		for(int i=2;i<number/2;i++) {
			if(number%i==0) {
				count++;
				break;
			}
		}
		if(count>1) {
			System.out.println("Not a prime no "+ number);
		}else {
			System.out.println("Prime no "+ number);
		}
		
		}else  {
			System.out.println("Not a prime no "+ number);
		}
	
	}

}
