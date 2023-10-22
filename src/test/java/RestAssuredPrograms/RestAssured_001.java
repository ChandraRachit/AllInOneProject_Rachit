package RestAssuredPrograms;

import static io.restassured.RestAssured.get;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class RestAssured_001 {
	
	@Test
	public void testMethod() {
		Response response=get("https://reqres.in/api/users?page=2");
				
		System.out.println("Status Code= "+response.getStatusCode());
		System.out.println("Status Line= "+response.getStatusLine());
		System.out.println("Headers = "+response.getHeaders());
		System.out.println("Content-type = "+response.getContentType());
		System.out.println("Connection = "+response.getHeader("Connection"));
		System.out.println("Body = "+response.getBody());
		System.out.println("Get Time = "+response.getTime());
		System.out.println("Response = "+response.asString());
		
		
	}

}
