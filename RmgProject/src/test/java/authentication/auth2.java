package authentication;

import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class auth2 {
	@Test
	public void auth2() {
		Response resp = given()
				.formParam("client_id", "Prakashcp")
				.formParam("client_secret", "7270d2ba057d9403227169eaebbd8d7a")
				.formParam("grant_type", "client_credentials")
				.formParam("redirect_uri", "https://Prakashcp.com")
				.formParam("code", "authorization_code")
				.when()
				.post("http://coop.apps.symfonycasts.com/token");
		        //getting code from the response
				String tocken = resp.jsonPath().get("access_token");
				System.out.println(tocken);
				given()
				.auth().oauth2(tocken)
				.pathParam("USER_ID", "3789")
				.when()
				.post("http://coop.apps.symfonycasts.com/api/{USER_ID}/eggs-collect")
				.then()
				.assertThat().statusCode(200).contentType(ContentType.JSON).time(Matchers.lessThan(2000L)).log().all();
				
		
		
		
	}

}
