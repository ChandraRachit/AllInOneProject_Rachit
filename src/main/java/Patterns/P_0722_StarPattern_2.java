package Patterns;

import java.util.Scanner;

public class P_0722_StarPattern_2 {
	public static void main(String args[]) {
		System.out.println("Enter Height");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = n - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();

		for (int i = 1; i <= n; i++) {
			for (int j = n - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int l = 1; l <= i; l++) {
				System.out.print(i);
			}
			System.out.println();
		}

		System.out.println();

		for (int i = 1; i <= n; i++) {
			for (int j = n - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int l = 1; l <= i; l++) {
				System.out.print(l);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=1;i<=n;i++) {
			for(int j=n-i;j>0;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=1;i<=n;i++) {
			for(int j=n-i;j>0;j--) {
				System.out.print(" ");
			}
			for(int l=1;l<=i;l++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=1;i<=n;i++) {
			for(int j=n-i;j>0;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}

}
