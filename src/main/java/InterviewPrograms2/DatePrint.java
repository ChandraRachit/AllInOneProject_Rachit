package InterviewPrograms2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePrint {

	public static void main(String[] args) {
		Date date=new Date();
		SimpleDateFormat df=new SimpleDateFormat("ddMMyyyy");
		
		System.out.println(df.format(date));
		

	}

}
