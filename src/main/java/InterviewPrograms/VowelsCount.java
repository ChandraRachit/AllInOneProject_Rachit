package InterviewPrograms;

public class VowelsCount {
	public static void main(String args[]) {
		String value="aaaahello";
		char[] values=value.toCharArray();
		int count=0;
		for(int i=0;i<values.length;i++) {
			if(values[i]=='a' || values[i]=='e' || values[i]=='i' || values[i]=='o' ||values[i]=='u' ) {
				System.out.println("Vowel found ="+values[i]);
			count++;
			}
		}
		System.out.println("Number of vowels = "+count);
	}
}
