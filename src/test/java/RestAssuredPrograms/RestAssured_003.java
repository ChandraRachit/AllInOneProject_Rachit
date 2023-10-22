package RestAssuredPrograms;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class RestAssured_003 {
	
	@Test
	public void testMethod() {
		JSONObject jo=new JSONObject();
		jo.put("A", "a");
		jo.put("B", "b");	
		baseURI="https://reqres.in";
		given().
			header("Content-Type", "application/json").
			contentType(ContentType.JSON).
			accept(jo.toJSONString()).
			body(jo).
		when().
			post("/api/users/2").
		then().
			statusCode(201).log().all();		
	}
	
	@Test
	public void testMethod2() {
		JSONObject jo=new JSONObject();
		jo.put("A", "a");
		jo.put("B", "b");	
		baseURI="https://reqres.in";
		given().
			header("Content-Type", "application/json").
			contentType(ContentType.JSON).
			accept(jo.toJSONString()).
			body(jo).
		when().
			patch("/api/users/2").
		then().
			statusCode(200).log().all();		
	}
	
	@Test
	/**
	 * DELETE
	 */
	public void testMethod3() {
		baseURI="https://reqres.in";
		when().
			delete("/api/users/2").
		then().
			statusCode(204).
			log().all();
	}

}
