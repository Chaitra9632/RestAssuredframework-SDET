package Parameters;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class PathParameter {
	
	@Test
	public void pathParameter()
	{
		//Step 1: create pre requisites
		baseURI = "http://localhost";
		port = 8084;
		
		//step 2: send the request and validate the response
		given()
		  .pathParam("pid", "TY_PROJ_9804")
		.when()
		  .delete("/projects/{pid}")
		.then()
		  .assertThat().statusCode(204).log().all();
	}

}
