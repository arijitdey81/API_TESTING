package com.crudOperationWithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class createResourceTest {
	@Test
	public void create() {
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
