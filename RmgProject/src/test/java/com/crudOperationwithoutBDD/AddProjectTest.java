package com.crudOperationwithoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class AddProjectTest {
	
	@Test
	public void Create() {
		//json body
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "C.p.Srivastavaaa");
		jobj.put("projectName", "Molbiodd");
		jobj.put("status", "created");
		jobj.put("teamsize", 6);
		
		
		//precondition(body and content type) 
		
		RequestSpecification reqspe = RestAssured.given();
		reqspe.body(jobj);
		reqspe.contentType(ContentType.JSON);
		
		//action
		Response response = reqspe.post("http://localhost:8084/addProject");
		ValidatableResponse validate = response.then();
		validate.assertThat().contentType(ContentType.JSON);
		validate.assertThat().statusCode(201);
		validate.log().all();//print everything
		
		
		}

}
