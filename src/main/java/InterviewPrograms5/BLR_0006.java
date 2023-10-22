package InterviewPrograms5;

public class BLR_0006 {
	public static void main(String args[]) {
		int a=10,b=20;
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		int c=a+b;
		a=c-a;
		b=c-a;
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		int x=40,y=50;
		System.out.println("x="+x);
		System.out.println("y="+y);
		
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("x="+x);
		System.out.println("y="+y);
		
		int d=11,e=22;
		System.out.println("d="+d);
		System.out.println("e="+e);
		
		int temp=d;
		d=e;
		e=temp;
		System.out.println("d="+d);
		System.out.println("e="+e);
	}
}
