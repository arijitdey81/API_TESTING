package com.crudOperationWithBDD;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class updateTest {
	@Test
	public void update() {
		Random random = new Random();
		int randomNumber = random.nextInt(10000);
		JSONObject jObj = new JSONObject();
		jObj.put("createdBy", "Arijit"+random);
		
		given()
			.contentType(ContentType.JSON)
			.body(jObj)
		.when()
			.put("http://localhost:8084/projects/TY_PROJ_207")
		.then()
			.assertThat().statusCode(200).contentType(ContentType.JSON).log().all();
	}
	

	
	
	
}
