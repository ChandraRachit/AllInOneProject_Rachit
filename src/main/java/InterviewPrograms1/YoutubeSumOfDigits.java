package InterviewPrograms1;

public class YoutubeSumOfDigits {
	
	public static void main(String args[]) {
		System.out.println("Sum of Number = "+sumOfDigits(321));
	}
	
	static int sumOfDigits(int num) {
		int sum=0;
		while(num!=0) {
			sum=sum+num%10;
			num=num/10;
		}
		return sum;
	}

}
