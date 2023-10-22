package InterviewPrograms;

public class PallindromeNo {

	public static void main(String[] args) {
		int no=12321;
		int newNo=no;
		int r=0;
		while(no>0) {
			r=r*10+no%10;
			no=no/10;
		}
		if(newNo==r) {
		 System.out.println("No is pallindrome "+r);	
		}else{
			System.out.println("No is not pallindrome "+ newNo + " "+r);
		}
		

	}

}
