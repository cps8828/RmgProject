package com.crudOperationwithBDD;


import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class getAllProjects {

	
	@Test
	public void getallProject() {
		
	given()
		.get("http://localhost:8084/projects")
		.then().assertThat().contentType(ContentType.JSON)
		.statusCode(200)
		.log().all();
		
}
}
