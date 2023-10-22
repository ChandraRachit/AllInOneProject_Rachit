package InterviewPrograms4;

public class SecondHighestInArray {

	public static void main(String[] args) {
		int a = 2, b = 3, c = 1;
		int largest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
		System.out.println(largest);
		System.out.println();

		int[] values = { 1, 2, 3, 4, 5, 6, 6, 4 };
		int temp;
		for (int i = 0; i < values.length; i++) {
			for (int j = i + 1; j < values.length; j++) {
				if (values[i] > values[j]) {
					temp = values[i];
					values[i] = values[j];
					values[j] = temp;
				}
			}
		}

		for (int an : values) {
			System.out.println(an);
		}

		System.out.println();

		System.out.println(values[values.length - 2]);

	}

}
