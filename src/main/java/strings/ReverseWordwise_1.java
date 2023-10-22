package strings;

public class ReverseWordwise_1 {

	public static void main(String[] args) {
		String value = "This is my country";
		int beginIndex = 0;
		for (int i = 0; i <= value.length(); i++) {
			if (Character.toString(value.charAt(i)).equals(" ")) {
				//System.out.println("Begin="+beginIndex+" i="+i);
				String word = value.substring(beginIndex, i-1);
				//System.out.println("$"+word+"$");
				reverseWord(word);
				beginIndex = i + 1;
			}
		}

	}

	public static void reverseWord(String word) {
		//System.out.println(word);
		for (int i = word.length() - 1; i >= 0; i--) {
			System.out.print(word.charAt(i));
		}
		System.out.print(" ");
	}

}
