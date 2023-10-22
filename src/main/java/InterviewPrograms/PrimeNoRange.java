package InterviewPrograms;

public class PrimeNoRange {

	public static void main(String[] args) {
		for(int i=0;i<100;i++) {
			if(i==0||i==1) {
				//System.out.println("Not a prime no "+i);
			}else {
				boolean flag=false;
				for(int j=2;j<=i/2;j++) {
					if(i%2==0) {
						flag=true;
					}
				}
				if(flag) {
					//System.out.println("Not a prime no "+i);
				}else {
					System.out.println("Prime no "+i);
				}
			}
		}

	}

}
