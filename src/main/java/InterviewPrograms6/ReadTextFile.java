package InterviewPrograms6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadTextFile {

	public static void main(String[] args) throws FileNotFoundException {
		File file=new File(System.getProperty("user.dir")+"\\src\\main\\resources\\TextFiles\\fileExample.txt");
		Scanner sc=new Scanner(file);
		while(sc.hasNextLine()) {
			String data=sc.nextLine();
			System.out.println(data);
		}

	}

}
