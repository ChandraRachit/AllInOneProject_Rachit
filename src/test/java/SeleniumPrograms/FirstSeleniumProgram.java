package SeleniumPrograms;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstSeleniumProgram {
		
	public static void main(String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.javatpoint.com/selenium-webdriver-first-test-case");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close();
	}

}
