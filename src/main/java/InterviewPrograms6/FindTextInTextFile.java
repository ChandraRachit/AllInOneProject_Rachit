package InterviewPrograms6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindTextInTextFile {

	public static void main(String[] args) {
		String value="Java";
		File file=new File(System.getProperty("user.dir")+"\\src\\main\\resources\\TextFiles\\fileExample.txt");
		try {
		Scanner sc=new Scanner(file);
		while(sc.hasNextLine()) {
			String data=sc.nextLine();
			if(data.contains(value)) {
				System.out.println("Text Found");
			}
			else {
				System.out.println("Text Not Found");
			}
		}
		}catch(FileNotFoundException w) {
			w.printStackTrace();
		}

	}

}
