package InterviewPrograms4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DuplicateChar2 {

	public static void main(String[] args) {
		String value = "aaabccccd";
		char[] values = value.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<>();
		for (int i = 0; i < value.length(); i++) {
			if (hm.containsKey(values[i])) {
				int count = hm.get(values[i]);
				hm.put(values[i], count + 1);
			} else {
				hm.put(values[i], 1);
			}
		}

		System.out.println(hm);
		System.out.println();

		for (char a : hm.keySet()) {
			if(hm.get(a)>1) {
				System.out.println("Duplicate value "+a);
			}
		}
		
		System.out.println();
		
		Iterator<Character> it=hm.keySet().iterator();
		while(it.hasNext()) {
			char val=(char)it.next();
			if(hm.get(val)>1) {
				System.out.println("Duplicate value "+val);
			}
		}
		
		System.out.println();
		
		for(Map.Entry<Character,Integer> entry : hm.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println("Duplicate value "+entry.getKey());
			}
		}
	}

}
