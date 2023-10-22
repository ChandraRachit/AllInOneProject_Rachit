package InterviewPrograms;

public class YoutubeLargestOf3Num {

	public static void main(String[] args) {
		int a=341,b=2345,c=5;
		/*
		 * if(a>b&&a>c) { System.out.println("a is largest "+a); }else if(b>a && b>c){
		 * System.out.println("b is largest "+b); }else {
		 * System.out.println("c is largest "+c); }
		 */
		
		System.out.println(((a>b?a:b)>c?(a>b?a:b):c));
			
	}

}
