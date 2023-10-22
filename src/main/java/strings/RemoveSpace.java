package strings;

public class RemoveSpace {

	public static void main(String[] args) {
		removeSpace("vcv sdfsdf sewet fthtrfh ertwet wesdf d");
	}
	
	static void removeSpace(String value) {
		value=value.replace(" ", "");
		System.out.println("Space Removed = "+value);
	}

}
