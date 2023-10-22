package InterviewPrograms;

public class UHG_1 {
	
	public static void main(String args[]) {
		String name="Rachit";
		
		System.out.println("Value="+name);
		System.out.print("Reversing the word=");
		for(int i=name.length()-1;i>=0;i--) {
			System.out.print(name.charAt(i));
		}
		System.out.println();
		StringBuffer sb=new StringBuffer(name);
		System.out.println("Reversing the word by changing to StringBuffer="+sb.reverse());
	}

}
