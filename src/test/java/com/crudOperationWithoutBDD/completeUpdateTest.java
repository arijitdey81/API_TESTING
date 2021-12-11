package com.crudOperationWithoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class completeUpdateTest {
	@Test
	public void compleUpdate() {
		JSONObject jObj = new JSONObject();
		jObj.put("projectName", "Jenkins_Maven");
		
		RequestSpecification resSpec = RestAssured.given();
		resSpec.contentType(ContentType.JSON);
		resSpec.body(jObj);
		
		Response response = resSpec.put("http://localhost:8084/projects/TY_PROJ_217");
		
		ValidatableResponse validateRes = response.then();
		validateRes.assertThat().statusCode(200);
		validateRes.assertThat().contentType(ContentType.JSON);
		validateRes.log().all();
	}

}
