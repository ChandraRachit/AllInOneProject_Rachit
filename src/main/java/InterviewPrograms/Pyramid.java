package InterviewPrograms;

public class Pyramid {

	public static void main(String[] args) {
	//			*
	//		*		*
	//	*		*		*
		int depth=5;
		
		
		for(int i=1;i<=depth;i++) {
			for(int j=depth-i;j>0;j--) {
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
