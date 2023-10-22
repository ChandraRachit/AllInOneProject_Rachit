package RestAssuredPrograms;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class RestAssured_002 {

	@Test
	public void testMethod() {
		baseURI = "https://reqres.in/api";
		given().
			get("/users?page=2").
		then().
			statusCode(200).
			body("data[4].first_name", equalTo("George")).
			body("data.first_name", hasItems("George", "Rachel"));
	}
	
	@Test
	public void testMethod2() {
		Map<String,Object> map=new HashMap<>();
		map.put("Rachit", "100");
		map.put("Raunak", "500");
		JSONObject jo=new JSONObject(map);
		System.out.println(jo);
		System.out.println(jo.toJSONString());
		
		baseURI="https://reqres.in/api";
		given().
			body(jo.toJSONString()).
		when().
			post("/users").
		then().
			statusCode(201).log().all();
		
	}
	
	@Test
	public void testMethod3() {
		JSONObject jo=new JSONObject();
		jo.put("Rachit", "100");
		jo.put("Raunak", "500");
		System.out.println(jo);
		System.out.println(jo.toJSONString());
		
		baseURI="https://reqres.in/api";
		given().
			header("Content-Type","application/json").
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(jo.toJSONString()).
		when().
			post("/users").
		then().
			statusCode(201).log().all();
		
	}


}
