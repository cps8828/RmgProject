package com.crudOperationwithoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class UpdateProjectTest {
	@Test
	public void update() {
		
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "C.p.kSrtavaaa");
		jobj.put("projectName", "Molbdd");
		jobj.put("status", "on going");
		jobj.put("teamsize", 8);
		
		//precondition (body and content type)
		RequestSpecification reqspe = RestAssured.given();
		reqspe.contentType(ContentType.JSON);
		reqspe.body(jobj);
		
		//action
		Response response = reqspe.put("http://localhost:8084/projects/TY_PROJ_235");
		ValidatableResponse validate = response.then();
		validate.assertThat().contentType(ContentType.JSON);
		validate.assertThat().statusCode(200);
		validate.log().all();
		
		
		
	}

}
