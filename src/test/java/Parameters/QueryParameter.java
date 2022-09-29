package Parameters;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class QueryParameter {
	
	@Test
	public void queryParameter()
	{
		//Step 1: create pre requites
		baseURI = "https://reqres.in";
		
		//Step 2: send request and validate the response
		given()
		 .queryParam("page", 3)
		.when()
		 .get("/api/users")
		.then()
		 .assertThat().statusCode(200).log().all();
	}

}
