package Patterns;

import java.util.Scanner;

public class P_0722_StarPattern_3 {
	public static void main(String args[]) {
		System.out.println("Enter Height");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=n-i;j>0;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		/*
		 * for(int i=1;i<=n;i++) { for() { System.out.print(); } for() {
		 * System.out.print(); } System.out.println(); }
		 */
	}

}
