package basic.CRUDOperations;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateProjectTest {
	
	@Test
	public void updateProject()
	{
		//Step 1: create pre requisites
		JSONObject obj = new JSONObject();
		obj.put("createdBy", "Chaitra");
		obj.put("projectName", "SDET39");
		obj.put("status", "Completed");
		obj.put("teamSize", 12);
		
		//Step 2: send the request
		RequestSpecification req = RestAssured.given();
		
		req.body(obj);
		req.contentType(ContentType.JSON);
		
		Response res = req.put("http://localhost:8084/projects/TY_PROJ_9805");
		
		//Step 3: validate the response
		System.out.println(res.getStatusCode());
	}

}
