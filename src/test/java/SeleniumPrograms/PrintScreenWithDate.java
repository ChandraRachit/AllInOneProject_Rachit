package SeleniumPrograms;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PrintScreenWithDate {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		
		
		Date date=new Date();
		SimpleDateFormat df=new SimpleDateFormat("yyyymmss");
		System.out.println(df.format(date));
		
		TakesScreenshot sc=((TakesScreenshot)driver);
		File f=sc.getScreenshotAs(OutputType.FILE);
		File dest=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Screenshots\\"+df.format(date)+".png");
		FileUtils.copyFile(f,dest);
		
		driver.close();
	}

}
