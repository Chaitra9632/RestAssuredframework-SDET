package DifferentWaysToPOST;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.File;

public class CreateProjectUsingJSONFile {
	
	@Test
	public void createProject()
	{
		baseURI = "http://localhost";
		port = 8084;
		
		//create Prerequisites
		File file = new File(".\\data.json");
		
		//send request and validate response
		given()
		 .body(file)
		 .contentType(ContentType.JSON)
		.when()
		 .post("/addProject")
		.then()
		 .log().all();
	}

}
