package InterviewPrograms1;

public class ReverseAString {
	public static void main(String args[]) {
		String name = "Rachit";
		System.out.println("String = " + name);
		StringBuffer sb = new StringBuffer(name);
		System.out.println("Reverse= " + sb.reverse());

		String name2 = "RachitChandra";
		System.out.println("String = " + name2);
		char[] charArry = name2.toCharArray();
		System.out.print("Reverse= ");
		for (int i = charArry.length - 1; i >= 0; i--) {
			System.out.print(charArry[i]);
		}
		System.out.println();

		String name3 = "Raunak";
		System.out.println("String = " + name3);
		System.out.print("Reverse= ");
		System.out.println(recursiveMethod(name3));
	}

	static String recursiveMethod(String str) {
		if ((str==null) || (str.length() <= 1)) {
			return str;
		}
		return recursiveMethod(str.substring(1)) + str.charAt(0);
	}
}
