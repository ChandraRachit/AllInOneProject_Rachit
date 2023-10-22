package TextRead;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintDateTime {

	public static void main(String[] args) {
		Date date=new Date();
		SimpleDateFormat df=new SimpleDateFormat("MM/dd/yyyy");
		String dateToPrint=df.format(date);
		System.out.println(dateToPrint);
		
		df=new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
		dateToPrint=df.format(date);
		System.out.println(dateToPrint);
		
	}

}
