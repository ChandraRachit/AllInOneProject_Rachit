package InterviewPrograms;

public class YoutubeFactorial {

	public static void main(String args[]) {
		/*
		 * int num=5; int no=1; for(;num>0;num--) { no=no*num; } System.out.println(no);
		 */
		System.out.println(fact(5));		
	}

	static int fact(int num) {
		if(num==0) {
			return 1;
		}else {
			return (num*fact(num-1));
		}
	}
}
