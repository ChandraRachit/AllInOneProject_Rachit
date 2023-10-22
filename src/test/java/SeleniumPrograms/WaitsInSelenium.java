package SeleniumPrograms;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsInSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		//----------------------till selenium 3----------------------------------------------------------
		
		//implicitlyWait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//Explicit Wait
		//WebDriverWait wait=new WebDriverWait(driver, 20);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("hello")));
		
		//FluentWait
		Wait<WebDriver> fwait = new FluentWait<WebDriver>(driver)							
		//		.withTimeout(30, TimeUnit.SECONDS) 			
		//		.pollingEvery(5, TimeUnit.SECONDS) 			
				.ignoring(NoSuchElementException.class);
		
		WebElement clickseleniumlink = fwait.until(ExpectedConditions.elementToBeClickable(By.xpath("Hello")));

		
		//--------------------------from selenium 4--------------------------------------------------------

		//implicitlyWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Explicit Wait
		WebDriverWait wait2=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("hello")));
		
		//FluentWait
		Wait<WebDriver> fwait4 = new FluentWait<WebDriver>(driver)							
				.withTimeout(Duration.ofSeconds(30)) 			
				.pollingEvery(Duration.ofSeconds(5)) 			
				.ignoring(NoSuchElementException.class);
		
		WebElement clickseleniumlink2 = fwait4.until(ExpectedConditions.elementToBeClickable(By.xpath("Hello")));
		
		
		
		
//		alertIsPresent()
//		elementSelectionStateToBe()
//		elementToBeClickable()
//		elementToBeSelected()
//		frameToBeAvaliableAndSwitchToIt()
//		invisibilityOfTheElementLocated()
//		invisibilityOfElementWithText()
//		presenceOfAllElementsLocatedBy()
//		presenceOfElementLocated()
//		textToBePresentInElement()
//		textToBePresentInElementLocated()
//		textToBePresentInElementValue()
//		titleIs()
//		titleContains()
//		visibilityOf()
//		visibilityOfAllElements()
//		visibilityOfAllElementsLocatedBy()
//		visibilityOfElementLocated()

	}

}
