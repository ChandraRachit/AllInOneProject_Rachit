package InterviewPrograms;

import java.util.Arrays;

public class Anagram {
	
	public static void main(String args[]) {
		String str1="Keep2";
		String str2="Peek";
		System.out.println("Two Strings are "+str1+" $ "+str2);
		isAnagram(str1,str2);
	}
	static void isAnagram(String str1,String str2) {
		String copyOfStr1=str1.replaceAll("\\s", "").toLowerCase();
		String copyOfStr2=str2.replaceAll("\\s", "").toLowerCase();
		boolean status=false;
		if(copyOfStr1.length()!=copyOfStr2.length()) {
		}else {
			//changing into Array to perform Sort and equals function
			char[] ChStr1=copyOfStr1.toCharArray();
			char[] ChStr2=copyOfStr2.toCharArray();
			Arrays.sort(ChStr1);
			Arrays.sort(ChStr2);
			status=Arrays.equals(ChStr1, ChStr2);
		}
			if(status) {
				System.out.println("Anagram");
			}else {
				System.out.println("Not Anagram");
			}
	}
}
