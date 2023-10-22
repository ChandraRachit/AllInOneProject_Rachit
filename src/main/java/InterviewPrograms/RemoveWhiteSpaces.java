package InterviewPrograms;

public class RemoveWhiteSpaces {

	public static void main(String args[]) {
		String name= "This is for example";
		String nameWithoutSpace=name.replaceAll("\\s+", "");
		System.out.println(nameWithoutSpace);
	}
}
