package OverloadingOverriding;

public class Overloading_1 {
	
	public static void main(String args[]) {
		getSum(1,2);
		getSum(2,3,4);
		getSum(6,4);
		getSum(6,7,7);
		getSum(1,1);
		getSum(2,2,2);
		getSum(1,2);
	}
	
	public static void getSum(int a,int b,int c) {
		System.out.println("Sum = "+(a+b+c));
	}
	
	public static void getSum(int a,int b) {
		System.out.println("Sum = "+(a+b));
	}

}
