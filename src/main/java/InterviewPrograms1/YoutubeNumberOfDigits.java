package InterviewPrograms1;

public class YoutubeNumberOfDigits {

	public static void main(String[] args) {
		getDigitCount(1112222);
	}


	static void getDigitCount(int num) {
		int countEven=0,countOdd=0;
		while(num!=0) {
			if(num%2==0) {
				countEven++;	
			}else {
				countOdd++;
			}
			num=num/10;
		}
		System.out.println("Even = "+countEven);
		System.out.println("Odd = "+countOdd);
	}
}
