package Parameters;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class FormParameter {
	
	@Test
	public void formParameter()
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
		  .contentType(ContentType.JSON)

		.when()
		  .post("/addProject")
		.then()
		  .log().all();
		
	}

}
