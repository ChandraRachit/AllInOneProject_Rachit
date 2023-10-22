package strings;

import java.util.Map;
import java.util.TreeMap;

public class DuplicateLetters {

	public static void main(String args[]) {
		getDuplicateCharacter("RachitRacfgdgfgsdfgsdfgerjgncvbnv");
	}

	public static void getDuplicateCharacter(String value) {
		char charArray[] = value.toCharArray();

		Map<Character, Integer> charMap = new TreeMap<>();
		for (char a : charArray) {
			if (charMap.containsKey(a)) {
				charMap.put(a, charMap.get(a) + 1);
			} else {
				charMap.put(a, 1);
			}
		}

		System.out.println("Your String value = "+value);
		System.out.print("Repeated Characters = ");
		for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.print(entry.getKey() + " ");
			}
		}
	}

}
