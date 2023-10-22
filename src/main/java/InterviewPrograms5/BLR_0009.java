package InterviewPrograms5;

//exp1 ? exp2 : exp3

public class BLR_0009 {
	public static void main(String args[]) {
		int a=3,b=233,max;
		max= (a>b) ? a : b;
		System.out.println(max);
		
		int x=111,y=22,z=3,max2;
		max2=(x>y)?(x>z?x:z):(y>z?y:z);
		System.out.println(max2);
	}
	
	

}
