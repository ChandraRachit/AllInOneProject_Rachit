package InterviewPrograms1;

public class YoutubePrimeNumber {

	public static void main(String args[]) {
		/*
		 * primeNo(1); primeNo(2); primeNo(3); primeNo(6); primeNo(8); primeNo(11);
		 */
		int start=100;
		int end=500;
		for(;start<=end;start++) {
			System.out.print(start+" is ");
			primeNo(start);	
		}

	}

	static void primeNo(int num) {
		int count = 0;
		if (num > 1) {

			for (int i = 2; i <=Math.sqrt(num); i++) {
				if (num % i == 0) {
					count++;
					break;
				}
			}
			if (count == 0) {
				System.out.println("a prime Number");
			} else {
				System.out.println("not a Prime Number");
			}

		} else {
			System.out.println("Not Prime Number");
		}
	}

}
