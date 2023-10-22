package InterviewPrograms1;

import java.util.Scanner;

public class YoutubePalindromeNum {

	public static void main(String arg[]) {
		System.out.println("Enter a Number");
		Scanner sc=new Scanner(System.in);
		long num=sc.nextLong();
		isPallindrome(num);
	}

	static void isPallindrome(long num) {
		long rev=0;
		long original=num;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		if(original==rev) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}

}
