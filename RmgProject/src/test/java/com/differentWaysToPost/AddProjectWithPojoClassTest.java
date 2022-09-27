package com.differentWaysToPost;

import org.testng.annotations.Test;

import com.pojo.ProjectTest;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class AddProjectWithPojoClassTest {
	
	@Test
	public void addProject() {
		
		ProjectTest pj=new ProjectTest("Chandan","TestYantra","Completed",12);
		given()
		.body(pj).contentType(ContentType.JSON)
		.when()
		.post("http://localhost:8084/addProject")
		.then()
		.assertThat().statusCode(201).contentType(ContentType.JSON).log().all();
		
		
		
	}

}
