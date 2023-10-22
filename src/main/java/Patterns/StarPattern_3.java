package Patterns;

import java.util.Scanner;

public class StarPattern_3 {

	public static void main(String args[]) {
		System.out.println("Enter the Pattern Height");
		Scanner sc= new Scanner(System.in); 
		int value= sc.nextInt();

		System.out.println("--------------------------------");
		/**
		 * ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		 */
		for(int i=0;i<=value;i++) {
			for(int j=value-i;j>0;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------");
		/**
		 * ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		 */
		for(int i=0;i<=value;i++) {
			for(int j=value-i;j>0;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<i;k++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("--------------------------------");
		/**
		 * ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		 */
		for(int i=0;i<=value;i++) {
			for(int j=value-i;j>0;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<i;k++) {
				System.out.print(k+1);
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------");
		/**
		 * ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		 */
		for(int i=0;i<=value;i++) {
			for(int j=value-i;j>0;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------");
		/**
		 * ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		 */
		for(int i=0;i<=value;i++) {
			for(int j=value-i;j>0;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<i;k++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println("--------------------------------");
		/**
		 * ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		 */
		for(int i=0;i<=value;i++) {
			for(int j=value-i;j>0;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<i;k++) {
				System.out.print(k+1+" ");
			}
			System.out.println();
		}
	}
}
