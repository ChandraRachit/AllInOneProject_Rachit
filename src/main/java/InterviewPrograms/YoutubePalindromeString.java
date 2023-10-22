package InterviewPrograms;

import java.util.Scanner;

public class YoutubePalindromeString {
	public static void main(String args[]) {
		System.out.println("Enter a Number");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		isPallindrome(str);
	}

	static void isPallindrome(String str) {
		String rev="";
		String original=str;
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if(original.equals(rev)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
}
}
