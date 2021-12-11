package com.post4Types;

import static io.restassured.RestAssured.given;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class postUsingJsonObjectTest {
	@Test
	public void usingjsonobject() {
		Random random = new Random();
		int randomNumber = random.nextInt(10000);
		JSONObject jObj = new JSONObject();
		jObj.put("createdBy", "Arijit");
		jObj.put("projectName", "Vtiger_09_34"+randomNumber);
		jObj.put("status", "Ongoing");
		jObj.put("teamSize", 15);
		
		given()
			.contentType(ContentType.JSON)
			.body(jObj)
			
		.when()
			.post("http://localhost:8084/addProject")
			
		.then()
			.assertThat().statusCode(201).contentType(ContentType.JSON).log().all();
			
	}

}
