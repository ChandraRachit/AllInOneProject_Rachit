package Patterns;

public class StarPattern_4_1 {
	
	public static void main(String args[]) {
		int count=5;
		for(int i=0;i<count;i++) {
			for(int j=count-i;j>0;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
			
			for(int i=count-1;i>0;i--) {
				for(int k=0;k<=count-i;k++) {
					System.out.print(" ");
				}
				for(int j=i;j>0;j--) {
					System.out.print("* ");
				}
				System.out.println();
			}
		}
	}

