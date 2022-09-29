package Authentications;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class BasicAuthentication {
	
	@Test
	public void basicAuthentication()
	{
		baseURI = "http://localhost";
		port = 8084;
		
		//create Pre requisites
		given()
		  .auth()
		  .basic("rmgyantra", "rmgy@9999")
		.when()
		  .get("/login")
		.then()
		  .log().all();
		
		//send the request and validate the response
	}
	
	@Test
	public void digestiveAuthentication()
	{
		baseURI = "http://localhost";
		port = 8084;
		
		given()
		  .auth()
		  .digest("rmgyantra", "rmgy@9999")
		.when()
		  .get("/login")
		.then().log().all();
		  
	  
	}
	
	@Test
	public void preemptiveAuth()
	{
		baseURI = "http://localhost";
		port = 8084;
		
		given()
		  .auth()
		  .preemptive().basic("rmgyantra", "rmgy@9999")
		.when()
		  .get("/login")
		.then().log().all();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
