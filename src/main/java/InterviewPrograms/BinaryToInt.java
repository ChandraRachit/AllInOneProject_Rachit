package InterviewPrograms;

public class BinaryToInt {

	public static void main(String[] args) {
		int value = 10001;
		int no = 0;
		int length = String.valueOf(value).length();
		String values = String.valueOf(value);
		for (int i = length - 1; i > 0; i--) {
			for (int j = 0; j < length; j++) {
				//System.out.println(values.charAt(j));
				if (values.charAt(j) == '1') {
					no = no + (int) Math.pow(2, i);
				}
			}
		}
			System.out.println(no);
		
	}
}
