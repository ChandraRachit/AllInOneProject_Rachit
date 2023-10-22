package InterviewPrograms2;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String value=sc.nextLine();
		
		for(int i=value.length()-1;i>=0;i--) {
			System.out.print(value.charAt(i));
		}
		
		

	}

}
