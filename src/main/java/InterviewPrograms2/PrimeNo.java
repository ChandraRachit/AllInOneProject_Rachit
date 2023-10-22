package InterviewPrograms2;

public class PrimeNo {

	public static void main(String[] args) {
		int no=29;
		boolean flag=true;
		if(no==0 || no ==1) {
			System.out.println("Not a prime no ="+no);
		}else {
			for(int i=2;i<no/2;i++) {
				if(no%i==0) {
					flag=false;
					break;
				}
			}
			if(flag) {
				System.out.println("Prime no ="+no);
			}else {
				System.out.println("Not Prime no ="+no);
			}
		}

	}

}
