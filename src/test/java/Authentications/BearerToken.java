package Authentications;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class BearerToken {

	@Test
	public void bearerToken()
	{
	   baseURI = "https://api.github.com";
	   
	   JSONObject jObj = new JSONObject();
	   jObj.put("name", "SDET39-REST");
	   jObj.put("description", "HybridFW");
	   
	   
	   given()
	     .auth()
	     .oauth2("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")
	     .body(jObj)
	     .contentType(ContentType.JSON)
	   .when()
	     .post("/user/repos")
	   .then()
	     .log().all();
	}
}
