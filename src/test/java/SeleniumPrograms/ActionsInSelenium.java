package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsInSelenium {
	public static void main() {
		System.setProperty("webdriver.edge.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		WebElement element=driver.findElement(By.xpath("Hi"));
		
		Actions builder = new Actions(driver);

		// Mouse Over
		Action mouseOverHome = builder.moveToElement(element).build();
		mouseOverHome.perform();
		
		Action seriesOfActions =builder.moveToElement(element).click().keyDown(Keys.ENTER).sendKeys("Hello").doubleClick().build();
		seriesOfActions.perform();
		
//		clickAndHold()
//		contextClick()
//		doubleClick()
//		dragAndDrop(source, target)
//		dragAndDropBy(source, x-offset, y-offset)
//		keyDown(modifier_key)
//		keyUp(modifier _key)
//		moveByOffset(x-offset, y-offset)
//		moveToElement(toElement)
//		release()
//		sendKeys(onElement, charsequence)

	}

}
