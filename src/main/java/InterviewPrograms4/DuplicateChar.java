package InterviewPrograms4;

public class DuplicateChar {

	public static void main(String[] args) {
		String value = "rachitchandra";
		char[] values = value.toCharArray();

		System.out.println("Duplicate characters in a given array");
		int count = 0;
		for (int i = 0; i < values.length; i++) {
			count = 1;
			for (int j = i + 1; j < values.length; j++) {
				if (values[i] == values[j] && values[i] != ' ') {
					count++;
				}
			}
			if (count > 1) {
				System.out.print(values[i]);

			}
		}

	}

}
