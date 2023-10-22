package InterviewPrograms;

public class ConvertToBinary {

	public static void main(String[] args) {
		int no=35;
		String binary = "";
		while(no>0) {
			binary=binary+ String.valueOf(no%2);
			no=no/2;
		}
		StringBuffer sb=new StringBuffer(binary);
		System.out.println(sb.reverse());

	}

}
