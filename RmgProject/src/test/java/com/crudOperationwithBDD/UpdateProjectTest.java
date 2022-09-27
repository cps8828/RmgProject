package com.crudOperationwithBDD;

import org.apache.commons.lang3.Validate;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class UpdateProjectTest {
	
	@Test
	public void update() {
		
		JSONObject jobj = new JSONObject();
		
		jobj.put("createdBy","Deepak11");
		jobj.put("projectName", "GoldItemss");
		jobj.put("status", "Completed");
		jobj.put("teamsize", 6);
		
		given()//method chaining the return type of given is Response
		.contentType(ContentType.JSON)
		.body(jobj)
		.when()
		.post("http://localhost:8084/projects/TY_PROJ_235")
		.then().assertThat().contentType(ContentType.JSON)
		.statusCode(500)
		.log().all();
		
		
		
		
		
		
	
		
		
		
	}

}
