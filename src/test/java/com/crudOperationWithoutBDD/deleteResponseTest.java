package com.crudOperationWithoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class deleteResponseTest {
	@Test
	public void delete() {
		Response response = RestAssured.delete("http://localhost:8084/projects/TY_PROJ_219");
		ValidatableResponse validateRes = response.then();
		validateRes.log().all();
		validateRes.statusCode(204);
		validateRes.contentType(ContentType.JSON);
		
	}

}
