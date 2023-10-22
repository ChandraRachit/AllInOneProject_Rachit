package InterviewPrograms;

public class OverloadingProg {

	public static void main(String[] args) {
		int a=11,b=22,c=3;
		double d=33,e=34;
		System.out.println("Sum of a & b = "+sum(a,b));
		System.out.println("Sum of a,b & c = "+sum(a,b,c));
		System.out.println("Sum of d & e = "+sum(d,e));
		
	}
	
	public static int sum(int a,int b) {
		return a+b;
	}
	
	public static int sum(int a,int b,int c) {
		return a+b+c;
	}
	
	public static double sum(double a,double b) {
		return a+b;
	}

}
