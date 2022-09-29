package End2EndScenario;

import org.testng.Assert;
import org.testng.annotations.Test;

import GenericLibraries.BaseAPIClass;
import GenericLibraries.BaseAPIClassWithSpecBuilders;
import GenericLibraries.EndPointsLibrary;
import POJOLibraries.ProjectLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.sql.SQLException;

public class CreateProjectAndVerifyInDB extends BaseAPIClassWithSpecBuilders{
	
	@Test
	public void createProject() throws SQLException
	{
		//step 1: create pre requisites
		ProjectLibrary pLib = new ProjectLibrary("Chaitra", "SDET39"+jLib.getRandomNumber(), "Created", 12);
		
		//Step 2: send the post request
		Response resp = given()
						.spec(requestSpec)
						.body(pLib)
						//.contentType(ContentType.JSON)
						.when()
						.post(EndPointsLibrary.createProject);
		resp.then().log().all();
		
		//Step 3: capture the project ID
		String expData = rLib.getJsonData(resp, "projectId");
		System.out.println(expData);
		
		//Step 4: verify the project ID in database
		String query = "select * from project;";
		String actData = dbLib.executeQueryandReturnData(query, 1, expData);
		Assert.assertEquals(actData, expData);
		  
	  
		  
	}

}
