package InterviewPrograms1;

import java.util.Scanner;

public class YoutubeReverseANumber {

	public static void main(String[] args) {
		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();// 12345
		System.out.println("Number is " + num);
		reverseNumber1(num);
		reverseNumber2(num);
		reverseNumber3(num);
	}

	static void reverseNumber1(int num) {
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("Reversed Number = "+rev);
	}
	
	static void reverseNumber2(int num) {
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		System.out.println("Reversed Number = "+sb.reverse());
	}
	
	static void reverseNumber3(int num) {
		StringBuilder sb=new StringBuilder();
		sb.append(num);
		System.out.println("Reversed Number = "+sb.reverse());
	}

}
