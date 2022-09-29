package Authentications;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Oauth2_0Authentication {
	
	@Test
	public void Oauth2Auth()
	{
		//Step 1: generate the access Token - post
		baseURI = "http://coop.apps.symfonycasts.com";
		
		Response resp = given()
						.formParam("client_id", "SDET39")
						.formParam("client_secret", "74568d7663fb2891b920bbceb224f978")
						.formParam("grant_type", "client_credentials")
						.formParam("redirect_uri", "http://example.com")
						.formParam("code", "authorization_code")
						.when()
						.post("/token");
		
		//Step 2: capture the access token
		String token = resp.jsonPath().get("access_token");
		System.out.println(token);
		
		//Step 3: use it for other endpoints
		given()
		  .pathParam("USER_ID", 1914)
		  .auth()
		  .oauth2(token)
		.when()
		  .post("/api/{USER_ID}/eggs-collect")
		.then().log().all();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
