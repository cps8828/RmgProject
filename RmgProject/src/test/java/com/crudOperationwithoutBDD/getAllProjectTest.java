package com.crudOperationwithoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class getAllProjectTest {
	
	@Test
	public void getallProject() {
		Response response = RestAssured.get("http://localhost:8084/projects");
		System.out.println(response.getContentType());
		System.out.println(response.getHeader("Vary"));
		System.out.println(response.getStatusCode());
		System.out.println(response.getBody());
		System.out.println(response.getTime());
		
		
		ValidatableResponse val = response.then();
		val.log().all();
		
		
		
	}

}
