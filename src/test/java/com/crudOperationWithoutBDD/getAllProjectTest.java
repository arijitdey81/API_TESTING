package com.crudOperationWithoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class getAllProjectTest {
	@Test
	public void getAllProjects() {
		
		Response response = RestAssured.get("http://localhost:8084/projects");
		ValidatableResponse validateresponse = response.then();
		validateresponse.log().all();
		validateresponse.assertThat().statusCode(200);
		validateresponse.contentType(ContentType.JSON);
		
	}

}
