package InterviewPrograms2;

public class Swap2Nos {

	public static void main(String[] args) {
		int a=10,b=20;
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a= "+a+" b= "+b);
		
		int d=10,e=20;
		int temp;
		temp=d;
		d=e;
		e=temp;
		System.out.println("d= "+d+" e= "+e);
	}

}
