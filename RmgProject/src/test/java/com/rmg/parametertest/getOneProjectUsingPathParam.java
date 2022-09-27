package com.rmg.parametertest;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class getOneProjectUsingPathParam {
	
	@Test
	public void getRepoTest() {
		
		given()
		.auth().basic("cps8828", "molu1234@S")
		
		.when()
		.get("https://github.com/cps8828/SDET37")
		.then()
		.log().all();
	}

}
