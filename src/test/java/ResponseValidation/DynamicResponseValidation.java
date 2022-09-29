package ResponseValidation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.List;

public class DynamicResponseValidation {
	
	@Test
	public void dynamicResponseV()
	{
		//Step 1: create Pre requisites
		baseURI = "http://localhost";
		port = 8084;
		
		String expData = "TY_PROJ_9614";
		
		//Step 2: send the request
		Response resp = when()
						.get("/projects");
	  
		//Step 3: validate the response
		boolean flag = false;
		List<String> list = resp.jsonPath().get("projectId");
		for(String actData:list)
		{
			if(actData.equalsIgnoreCase(expData))
			{
				System.out.println(actData);
				flag = true; //flag rising
				break;
			}
		}
		
		Assert.assertTrue(flag);
		
//		if(flag)
//		{
//			System.out.println("pass");
//		}
//		else
//		{
//			System.out.println("fail");
//		}
		
		
	}

}
