 package InterviewPrograms;

public class BLR_0011 {

	public static void main(String[] args) {
		String name="RACAR";
		String rev= "";
		for(int i=name.length()-1;i>=0;i--) {
			//System.out.print(name.charAt(i));
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
	if(rev.equalsIgnoreCase(name)) {
		System.out.println("Pallindrome");
	}else {
		System.out.println("Not Pallindrome");
	}

	}

}
