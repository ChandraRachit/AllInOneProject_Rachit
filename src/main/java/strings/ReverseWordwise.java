package strings;

import java.util.Scanner;

public class ReverseWordwise {

	public static void main(String[] args) {
		String Value="This is my country.";
		reverseString(Value);

	}
	static void reverseString(String Value) {
		for(int i= Value.length()-1;i>=0;i--) {
			if(Character.toString(Value.charAt(i)).equals(" ")) {
				System.out.print(" ");
			}else if(Character.toString(Value.charAt(i)).equals("\n")) {
				System.out.print("\n");
			}else {
				System.out.print(Value.charAt(i));	
			}
		}
	}

}
