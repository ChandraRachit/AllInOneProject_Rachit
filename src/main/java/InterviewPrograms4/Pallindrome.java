package InterviewPrograms4;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		//int no = 123212;
		int newNo = no;
		int r = 0;
		while (no > 0) {
			r = (r * 10) + (no % 10);
			no = no / 10;
		}
		if (r == newNo) {
			System.out.println("Pallindrome");
		} else {
			System.out.println("Not Pallindrome");
		}

	}

}
