package basic.CRUDOperations;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteProjectTest {
	
	@Test
	public void deleteProject()
	{
		//Step 1: create pre requisites
		
		//step 2: send the request
		Response resp = RestAssured.delete("http://localhost:8084/projects/TY_PROJ_9805");
		
		//Step 3: validate the response
		System.out.println(resp.getStatusCode());
	}

}
