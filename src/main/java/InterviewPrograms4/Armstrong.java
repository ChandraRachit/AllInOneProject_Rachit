package InterviewPrograms4;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();

		if (isArmstrong(no)) {
			System.out.println(no + " is Armstrong");
		} else {
			System.out.println(no + " is not Armstrong");
		}

	}

	static boolean isArmstrong(int n) {
		int temp, digits = 0, last = 0, sum = 0;
		temp = n;

		while (temp > 0) {
			temp = temp / 10;
			digits++;
		}
		temp = n;

		while (temp > 0) {
			last = temp % 10;
			sum += (Math.pow(last, digits));
			temp = temp / 10;
		}
		if (n == sum)
			return true;
		else
			return false;
	}

}
