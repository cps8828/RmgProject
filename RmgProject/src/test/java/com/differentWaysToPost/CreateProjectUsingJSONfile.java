package com.differentWaysToPost;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProjectUsingJSONfile {
	
	@Test
	public void CreateProject() {
		
		File file = new File("./src/test/resources/data.JSON");
		
	    given()
	    .body(file)
	    .contentType(ContentType.JSON)
	    .when()
	    .post("http://localhost:8084/addProject")
	    .then()
	    .assertThat().statusCode(201)
	    .log().all();
		
		
	}

}
