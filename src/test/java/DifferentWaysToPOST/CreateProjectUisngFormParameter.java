package DifferentWaysToPOST;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.testng.annotations.Test;

public class CreateProjectUisngFormParameter {
	
	@Test
	public void createP()
	{
		//Create pre requisites
		baseURI = "http://localhost";
		port = 8084;
		
		//send the request and validate
		given()
		  .formParam("createdBy", "Chaitra")
		  .formParam("projectName", "SDET")
		  .formParam("status", "Created")
		  .formParam("teamSize", 12)
		.when()
		  .post("/addProject")
		.then()
		  .log().all();
	}

}
