package com.rmg.crudTest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import junit.framework.Assert;

public class getProjects {
	/**
	 * get():get all the resourse from the server
	 * URI:http://localhost:8084/projects
	 */
	@Test
	public void getAllProjectTest() {
		Response rsp= RestAssured.get("http://localhost:8084/projects");
		
		//get status code
		System.out.println(rsp.getStatusCode());
		//put a explicit assertion
		Assert.assertEquals(200, rsp.getStatusCode());
		
		//get the content-type
		System.out.println(rsp.getContentType());
		ValidatableResponse resVal = rsp.then();
		resVal.log().all();
	}

}
