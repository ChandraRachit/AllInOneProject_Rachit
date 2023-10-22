package Patterns;

public class StartPattern_2_1 {

	public static void main(String args[]) {

		int count = 5;

		for (int i = 0; i < count; i++) {
			for (int j = count - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		for (int i = 0; i < count; i++) {
			for (int j = count - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print(k + 1 + " ");
			}
			System.out.println();
		}
		
		for(int i=0;i<count;i++) {
			for(int j=count-i;j>0;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print(i+1+" ");
			}
			System.out.println();
				
		}
	}

}
