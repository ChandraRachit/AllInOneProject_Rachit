package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class JavaScriptProg {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		
		
		//syntex & command
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		
		
		//Syntex
		js.executeScript(Script,Arguments);
		
		//click
		js.executeScript("arguments[0].click();", Element);
		
		//To generate a alert
		js.executeScript("alert('Welcome to Guru99');");
		
		//To navigate to url
		 js.executeScript("window.location = 'https://demo.guru99.com/'");
		 
		 //Call executeAsyncScript() method to wait for 5 seconds
		 js.executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 5000);");
		 
		 
		 //-----------------------------------------------------------------------------------
		 
		//To scroll
		 //js.executeScript("window.scrollBy(x-pixels,y-pixels)");
		 js.executeScript("window.scrollBy(0,600)");
		 
		//This will scroll the page till the element is found		
	     js.executeScript("arguments[0].scrollIntoView();", Element);
	     
	     
	     //This will scroll the web page till end.		
	     js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	     
	     //-----------------------------------------------------------------------------------

	}

}
