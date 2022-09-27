package com.crudOperationwithoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class getSingleProjectTest {
	@Test
	public void getallProject() {
		Response response = RestAssured.get("http://localhost:8084/projects/TY_PROJ_235");
		System.out.println(response.getContentType());
		System.out.println(response.getHeader("Vary"));
		System.out.println(response.getStatusCode());
		System.out.println(response.getBody());
		System.out.println(response.getTime());
		
		
		ValidatableResponse val = response.then();
		val.statusCode(200);
		val.log().all();

}
}
	
