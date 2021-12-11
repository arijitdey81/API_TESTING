package com.crudOperationWithoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class createResourceTest {
	@Test
	public void create() {
		JSONObject jObj = new JSONObject();
		jObj.put("createdBy", "Arijit");
		jObj.put("projectName", "Vtiger_09_34");
		jObj.put("status", "Ongoing");
		jObj.put("teamSize", 15);
		
		RequestSpecification requestSpec = RestAssured.given();
		requestSpec.contentType(ContentType.JSON);
		requestSpec.body(jObj);
		
		Response response = requestSpec.post("http://localhost:8084/addProject");
		ValidatableResponse validateRes = response.then();
		
		validateRes.statusCode(201);
		validateRes.contentType(ContentType.JSON);
		validateRes.log().all();
		
	}
	

}
