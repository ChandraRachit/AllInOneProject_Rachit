package Patterns;

import java.util.Scanner;

/**
 * Enter the Pattern Height
6
      1 
     2 2 
    3 3 3 
   4 4 4 4 
  5 5 5 5 5 
 6 6 6 6 6 6 
  5 5 5 5 5 
   4 4 4 4 
    3 3 3 
     2 2 
      1 
       
--------------------------------
      * 
     * * 
    * * * 
   * * * * 
  * * * * * 
 * * * * * * 
  * * * * * 
   * * * * 
    * * * 
     * * 
      * 
       

 * @author Rachit
 *
 */
public class StarPattern_4 {
	public static void main(String args[]) {
		System.out.println("Enter the Pattern Height");
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();

		/**
		 * ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		 */
		for (int i = 0; i < value; i++) {
			for (int k = value - i; k > 0; k--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(i + 1 + " ");
			}
			System.out.println();
		}
		for (int i = value; i > 0; i--) {
			for (int k = 0; k <= value - i + 1; k++) {
				System.out.print(" ");
			}
			for (int j = i - 1; j > 0; j--) {
				System.out.print(i - 1 + " ");
			}
			System.out.println();
		}
		System.out.println("--------------------------------");
		/**
		 * ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		 */
		for (int i = 0; i < value; i++) {
			for (int k = value - i; k > 0; k--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = value; i > 0; i--) {
			for (int k = 0; k <= value - i + 1; k++) {
				System.out.print(" ");
			}
			for (int j = i - 1; j > 0; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
