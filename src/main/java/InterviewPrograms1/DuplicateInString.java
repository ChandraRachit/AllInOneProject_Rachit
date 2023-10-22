package InterviewPrograms1;

import java.util.HashMap;
import java.util.Set;

public class DuplicateInString {
	public static void main(String args[]) {
		findDuplicate("RachitChandra");
		findDuplicate("RakeshRaushan");
		findDuplicate("RachitRaunak");
		findDuplicate("Modi");
	}

	static void findDuplicate(String str) {
		HashMap<Character,Integer> charCountMap=new HashMap<Character,Integer>();
		char[] charArray=str.toCharArray();
		for(char c : charArray) {
			if(charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c)+1);
			}else {
				charCountMap.put(c,1);
			}
		}
		Set<Character> charInString = charCountMap.keySet();
		System.out.println("Duplicate in String "+str);
		for(char a : charInString) {
			if(charCountMap.get(a)>1) {
				System.out.println(a+"="+charCountMap.get(a));
			}
		}
	}
}
