package strings;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String value=sc.next();
		System.out.println(value);

		for(int i=value.length()-1;i>=0;i--)
		{
			System.out.print(value.charAt(i));
		}
	}

}
