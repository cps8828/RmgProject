package com.differentWaysToPost;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProjectUsingHashMap {
	
	
	@Test
	public void createProject() {
		
		HashMap hm = new HashMap();
		
		hm.put("createdBy", "Srivastava");
		hm.put("projectName", "Sony ");
		hm.put("status", "Created");
		hm.put("teamSize", 5);
		
        given()
        .body(hm)
        .contentType(ContentType.JSON)
        .when()
        .post("http://localhost:8084/addProject")
        .then()
        .assertThat().statusCode(201)
        .log().all();
		
		
		
		
	}

}
