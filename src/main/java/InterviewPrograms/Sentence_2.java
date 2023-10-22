package InterviewPrograms;

public class Sentence_2 {
	
	public static void main(String args[]) {
		String value="My name is rachit Chandra";
		String tmp[]=value.split(" ");
		System.out.println("No of words in Sentence "+ tmp.length);
		for(int j=0;j<tmp.length;j++) {
			tmp[j]=tmp[j].substring(0,1).toUpperCase()+tmp[j].substring(1);
		}
		String ans="";
		for(int i=tmp.length-1;i>=0;i--) {
			ans +=tmp[i]+" ";
		}
		System.out.println(ans);
	}
	
}
