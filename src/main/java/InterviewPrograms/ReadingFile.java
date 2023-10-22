package InterviewPrograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFile {

	public static void main(String[] args) throws FileNotFoundException {
		File file=new File(System.getProperty("user.dir")+"/src/com/rachit/files/fileExample.txt");
		Scanner sc=new Scanner(file);
		while(sc.hasNextLine()) {
			String value=sc.nextLine();
			System.out.println(value);
		}

	}

}
