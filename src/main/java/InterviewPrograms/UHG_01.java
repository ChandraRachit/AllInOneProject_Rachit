package InterviewPrograms;

public class UHG_01 {
	
	public static void main(String args[]) {
		String name="Rachit Chandra";
		System.out.println("Highest Occurance of a in "+name+"="+ findNumber(name,'a'));
		
	}
	
	static int findNumber(String Word,char ch) {
		Word= Word.toLowerCase().replace(" ","");
		int count=0;
		for(int i=0;i<Word.length();i++) {
			if(Word.charAt(i)=='a') {
				count++;
			}
		}
		return count;
	}

}
