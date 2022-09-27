package authentication;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class BearerTokenTest {
	
	@Test
	public void bearerTocken()
	{
		baseURI="https://api.github.com";
		
		JSONObject jObj = new JSONObject();
		jObj.put("name", "sdet37RestAssured");
		
		given()
		.auth().oauth2("/user/repos")
		.body(jObj)
		.contentType(ContentType.JSON)
		.when()
		.post("/user/repos")
		.then()
		.log().all();
	}

}
