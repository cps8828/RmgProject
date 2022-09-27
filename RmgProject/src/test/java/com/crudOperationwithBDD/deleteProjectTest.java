package com.crudOperationwithBDD;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class deleteProjectTest {
	@Test
	public void deleteProject() {
		
		given()
		.delete("http://localhost:8084/projects/TY_PROJ_602")
		.then().assertThat().contentType(ContentType.JSON)
		.log().all();
		
		
	}

}
