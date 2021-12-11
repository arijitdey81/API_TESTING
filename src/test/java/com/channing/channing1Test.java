package com.channing;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class channing1Test {
	@Test
	public void requestChanning() {
		Response response = when()
			.get("http://localhost:8084/projects");
		String proId = response.jsonPath().get("[2].projectId");
		
		given()
			.pathParam("projectId", proId)
		.when()
			.delete("http://localhost:8084/projects/{projectId}")
		.then()
			.log().all();
	}

}
