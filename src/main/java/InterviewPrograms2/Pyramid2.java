package InterviewPrograms2;

public class Pyramid2 {

	public static void main(String[] args) {

//		1
//		22
//		333
//		4444
//		55555

		int depth = 5;

		for (int i = 1; i <= depth; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i = 1; i <= depth; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}
}
