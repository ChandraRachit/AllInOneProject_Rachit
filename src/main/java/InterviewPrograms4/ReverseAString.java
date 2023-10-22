package InterviewPrograms4;

public class ReverseAString {

	public static void main(String[] args) {
		String value="Rachit";
		for(int i=value.length()-1;i>=0;i--) {
			System.out.print(value.charAt(i));
		}
		
		
		System.out.println();
		
		
		StringBuilder sb=new StringBuilder(value);
		System.out.print(sb.reverse());
		
		System.out.println();
		
		char a[]=value.toCharArray();
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]);
		}

	}

}
