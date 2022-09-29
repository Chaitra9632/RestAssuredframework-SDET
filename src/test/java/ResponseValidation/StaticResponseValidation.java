package ResponseValidation;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class StaticResponseValidation {
	
	@Test
	public void staticResponseV()
	{
		//Step 1: create pre requisites
		baseURI = "http://localhost";
		port = 8084;
		
		JSONObject obj = new JSONObject();
		obj.put("createdBy", "Deepak");
		obj.put("projectName", "SDET39-Online");
		obj.put("status", "On Going");
		obj.put("teamSize", 12);
		
		String expData = "SDET39-Online";
		
		//Step 2: send the request
		Response resp = given()
						.body(obj)
						.contentType(ContentType.JSON)
						.when()
						.post("/addProject");
		
		//Step 3: validate the response
		String actData = resp.jsonPath().get("projectName");
		Assert.assertEquals(actData, expData);
		resp.then().log().all();
	}

}
