package InterviewPrograms1;

public class YoutubeSwap2Numbers {

	public static void main(String[] args) {

		int a=10,b=20;
		System.out.println("Value of a = "+a+" b= "+b);
		reverseNumber1(1,2);
		reverseNumber2(3,4);
		reverseNumber3(5,6);
		reverseNumber4(7,8);
		reverseNumber5(9,10);
	}
	
	static void reverseNumber1(int a,int b) {
		int tmp=a;
		a=b;
		b=tmp;
		System.out.println("Value of a = "+a+" b= "+b);
	}
	
	static void reverseNumber2(int a,int b) {
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Value of a = "+a+" b= "+b);
	}
	
	static void reverseNumber3(int a,int b) {
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("Value of a = "+a+" b= "+b);
	}
	
	static void reverseNumber4(int a,int b) {
		a=a^b;//XOR - Same then Zero otherwise 1
		b=a^b;
		a=a^b;
		System.out.println("Value of a = "+a+" b= "+b);
	}
	
	static void reverseNumber5(int a,int b) {
		b=a+b-(a=b);
		System.out.println("Value of a = "+a+" b= "+b);
	}

}
