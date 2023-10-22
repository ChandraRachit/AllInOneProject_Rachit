package InterviewPrograms;

import java.util.Scanner;

public class YoutubeReverseAString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.next();
		reverseString1(str);
		reverseString2(str);
		reverseString3(str);
		reverseString4(str);
	}
	
	static void reverseString1(String str) {
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
	}
	
	static void reverseString2(String str) {
		char[] arr=str.toCharArray();
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}
	
	static void reverseString3(String str) {
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
	}
	
	static void reverseString4(String str) {
		StringBuilder sb=new StringBuilder(str);
		System.out.println(sb.reverse());
	}

}
