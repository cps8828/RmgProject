package com.crudOperationwithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class AddProjectTest {
	
	@Test
	public void Create() {
		JSONObject jobj= new JSONObject();
		jobj.put("createdBy", "Ganesh");
		jobj.put("projectName", "Festival");
		jobj.put("status", "idk");
		jobj.put("teamSize", 100);
		
		given()//method chaining the return type of given is Response
		.contentType(ContentType.JSON)
		.body(jobj)
		.when()
		.post("http://localhost:8084/addProject")
		.then().assertThat().contentType(ContentType.JSON);
		
		
		
		
		
	}

}
