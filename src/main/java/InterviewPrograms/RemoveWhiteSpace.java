package InterviewPrograms;

public class RemoveWhiteSpace {
	public static void main(String args[]) {
		String value="Hello this is interview program practise ";
		String[] values=value.split(" ");
		for(String i : values) {
			System.out.print(i);
		}
		System.out.println();
		
		String value2=value.replace(" ", "");
		System.out.println(value2);
		System.out.println();
		
		char[] a=value.toCharArray();
		for(int i=0;i<a.length;i++) {
			if(a[i]!=' ') {
				System.out.print(a[i]);
			}
		}
	}

}
