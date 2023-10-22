package InterviewPrograms;

public class LargestNumber {

	public static void main(String[] args) {
		System.out.println("Largest = "+largestNo(111,22,3333));

	}

	static int largestNo(int a,int b,int c) {
		if(a>b && a>c) {
			return a;
		}else if(a>b && a<c) {
			return c;
		}else {
			return b;
		}
	}
	

}
