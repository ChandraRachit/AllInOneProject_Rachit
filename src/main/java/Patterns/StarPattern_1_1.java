package Patterns;

public class StarPattern_1_1 {
	public static void main(String args[]) {
		int count = 5;
		for (int i = 0; i <= count; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("###########################");

		for (int i = 0; i <= count; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		System.out.println("###########################");

		for (int i = 0; i <= count; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(j + 1 + " ");
			}
			System.out.println();
		}
		System.out.println("###########################");

		for (int i = count; i > 0; i--) {
			for(int j=i;j>0;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("###########################");
		
		for(int i=count;i>0;i--) {
			for(int j=i;j>0;j--) {
				System.out.print(j+"");
			}
			System.out.println();
		}
		System.out.println("###########################");
		
		for(int i=count;i>0;i--) {
			for(int j=i;j>0;j--) {
				System.out.print(i+"");
			}
			System.out.println();
		}
		System.out.println("###########################");

	}
}
