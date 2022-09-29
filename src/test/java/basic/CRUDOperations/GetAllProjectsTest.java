package basic.CRUDOperations;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetAllProjectsTest {
	
	@Test
	public void getAllProject()
	{
		//Step 1: create pre requisites
		
		//Step 2: send the request
		Response resp = RestAssured.get("http://localhost:8084/projects");
		
		//Step 3: validate the resposnse
		int expStatus = 200;
		int actStatus = resp.getStatusCode();
		Assert.assertEquals(actStatus, expStatus);
	}

}
