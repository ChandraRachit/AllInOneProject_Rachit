package InterviewPrograms4;

public class Swap2Nos {

	public static void main(String[] args) {
	int a=10,b=20;
	int temp;
	
	temp=a;
	a=b;
	b=temp;
	System.out.println("a="+a+" b="+b);
	
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("a="+a+" b="+b);
	
	a=a*b;
	b=a/b;
	a=a/b;
	System.out.println("a="+a+" b="+b);
	}

}
