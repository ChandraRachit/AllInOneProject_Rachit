package SeleniumPrograms;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumBasicOpertaions {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		WebElement element =driver.findElement(By.xpath(""));
		List<WebElement> elements=driver.findElements(By.xpath(""));
		
		driver.get("https://www.saucedemo.com/");
		
		//Driver get commands
		String url=driver.getCurrentUrl();
		String source=driver.getPageSource();
		String title=driver.getTitle();
		
		//Driver Navigate - Back() forward() refresh() to(String) to("www.g.com")
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().to("www.google.com");
		String urlValue="www.google.com";
		driver.navigate().to(urlValue);;
		driver.navigate().refresh();
		
		driver.notify();
		
		
		//Close & quit
		driver.quit();
		driver.close();

		
		//Alerts
		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().accept();
		driver.switchTo().alert().getText();
		driver.switchTo().alert().sendKeys("Hello");
		
		//frame
		driver.switchTo().frame(0);
		driver.switchTo().frame("FrameName");
		//driver.switchTo().frame(frameElement);
		driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		
		//Element
		driver.switchTo().activeElement();
		
		//Driver Window handle
		String windowHandle=driver.getWindowHandle();
		Set<String> windowHandles=driver.getWindowHandles();
		//window
		//driver.switchTo().window(nameOrHandle);
		//driver.switchTo().newWindow(typeHint);
		
	
		//
		driver.findElement(By.xpath("hi")).clear();
		driver.findElement(By.xpath("hi")).click();
		driver.findElement(By.xpath("hi")).getAttribute("tag");
		driver.findElement(By.xpath("hi")).getText();
		driver.findElement(By.xpath("hi")).submit();
		driver.findElement(By.xpath("hi")).sendKeys("Hello");
		driver.findElement(By.xpath("hi")).isDisplayed();
		driver.findElement(By.xpath("hi")).isEnabled();
		driver.findElement(By.xpath("hi")).isSelected();
		
		
		
		
	}

}
