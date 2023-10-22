package InterviewPrograms2;

public class Factorial2 {

	public static void main(String[] args) {
		int no=5;
		System.out.println("Factorial of "+ no+" is "+fact(no));
	}
	
	static int fact(int no) {
		if(no==1) {
			return 1;
		}else {
			return(no*fact(no-1));
		}
	}

}
