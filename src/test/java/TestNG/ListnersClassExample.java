package TestNG;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;

public class ListnersClassExample implements ITestListener{
	
//	listens to every event that occurs in a selenium code. 
//	Listeners are activated either before the test or after the test case
//  ITestListener interface
//	@Listeners annotation within the class AND Use within the testng.xml
//	@Listeners(ListnersClassExample.class) in class
	
//	<suite name="Suite">  
//	<listeners>  
//	<listener class-name="com.javatpoint.Listener"/>  
//	</listeners>  
//	<test name="Listeners_program">  
//	<classes>  
//	<class name="com.javatpoint.Testcases"></class>  
//	</classes>  
//	</test>  
//	</suite>   
//	<!-- Suite -->  
	
	
	public void onTestStart(ITestResult result) {
		System.out.println("#####ListnersClassExample - OnTestStart#####");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("#####ListnersClassExample - OnTestSuccess#####");
	}

	public void onTestFailure(ITestResult result) {
	}

	public void onTestSkipped(ITestResult result) {
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	public void onTestFailedWithTimeout(ITestResult result) {
	}

	public void onStart(ITestContext context) {
		System.out.println("#####ListnersClassExample - OnStart#####");
	}

	public void onFinish(ITestContext context) {
		System.out.println("#####ListnersClassExample - OnFinish#####");
	}

}
