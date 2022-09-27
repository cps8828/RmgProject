package com.dataDrivenTesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pojo.ProjectTest;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class AddProjectUsingDataProviderTest {
	
	@Test(dataProvider = "bodyData")
	public void addProject(String createdBy,String projectName,String status,int teamSize) {
		
	ProjectTest obj = new ProjectTest(createdBy, projectName,status,teamSize);
	given()
	.body(obj).contentType(ContentType.JSON)
	.when()
	.post("http://localhost:8084/addProject")
	.then()
	.assertThat().statusCode(201).contentType(ContentType.JSON).log().all();
			}
	@DataProvider
	public Object[][] bodyData(){
		Object[][] objArray = new Object[4][4];
		objArray[0][0]="Abhi";
		objArray[0][1]="Crauscade";
		objArray[0][2]="Completed";
		objArray[0][3]=4;
		
		objArray[1][0]="Ram";
		objArray[1][1]="EuroRiding";
		objArray[1][2]="On Going";
		objArray[1][3]=6;
		
		objArray[2][0]="Shyam";
		objArray[2][1]="Bilab";
		objArray[2][2]="completed";
		objArray[2][3]=7;
		
		objArray[3][0]="parul";
		objArray[3][1]="JT";
		objArray[3][2]="Completed";
		objArray[3][3]=8;
		
		
		return objArray;
		
		
		
 	}
}