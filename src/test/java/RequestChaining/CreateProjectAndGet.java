package RequestChaining;

import org.testng.annotations.Test;

import POJOLibraries.ProjectLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class CreateProjectAndGet {

	
	@Test
	public void cretaeAndGet()
	{
		Random ran = new Random();
		
		//Step 1: create pre requites for POST
		baseURI = "http://localhost";
		port = 8084;
		
		ProjectLibrary pLib = new ProjectLibrary("Monika", "Amdocs"+ran.nextInt(100), "created", 12);
		
		//Step 2: send the post request
		Response resp = given() 
						.body(pLib)
						.contentType(ContentType.JSON)
						.when()
						.post("/addProject");
		
		//Step 3: Capture the project ID writing json Path
		String projectID = resp.jsonPath().get("projectId");
		System.out.println(projectID);
		
		//Step 4: send the get request with project ID
		given()
		  .pathParam("pid", projectID)
		.when()
		   .get("/projects/{pid}")
		  //.get("/projects/"+projectID)
		.then()
		  .assertThat().statusCode(200).log().all();
	}

}
