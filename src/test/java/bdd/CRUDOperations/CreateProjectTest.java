package bdd.CRUDOperations;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProjectTest {
	
	@Test
	public void createProject()
	{
		baseURI = "http://localhost";
		port = 8084;
		
		//Create Pre requisities
		JSONObject obj = new JSONObject();
		obj.put("createdBy", "Deepak");
		obj.put("projectName", "SDET39-Online");
		obj.put("status", "On Going");
		obj.put("teamSize", 12);
		
		//Send the request
		given()
		  .body(obj)
		  .contentType(ContentType.JSON)
		.when()
		  .post("/addProject")
		.then()
		  .assertThat().statusCode(201)
		  .log().all();
		
		//Validate the response
	}

}
