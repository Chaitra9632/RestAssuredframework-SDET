package DifferentWaysToPOST;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

public class CreateProjectUisngHashMap {
	
	@Test
	public void createProject()
	{
		baseURI = "http://localhost";
		port = 8084;
		
		//Create pre requisites
		HashMap map = new HashMap();
		map.put("createdBy", "VChaitra");
		map.put("projectName", "SDET");
		map.put("status", "Created");
		map.put("teamSize", 10);
		
		//send the request and validate
		given()
		 .body(map)
		 .contentType(ContentType.JSON)
		.when()
		 .post("/addProject")
		.then()
		  .assertThat().statusCode(201).log().all();
	}

}
