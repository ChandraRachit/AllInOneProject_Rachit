package InterviewPrograms1;

public class Sentence_1 {

	public static void main(String[] args) {
		String value="This is my laptop";
		String a[]=value.split(" ");
		String ans="";
		for(int i=a.length-1;i>=0;i--) {
			ans += a[i]+" ";
		}
		System.out.println(ans);

	}

}
