package com.post4Types;

import java.util.HashMap;
import java.util.Random;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class postUsingHashMapTest {
	@Test
	public void usingHashMap() {
		Random random = new Random();
		int randomNo = random.nextInt(10000);
		HashMap hm = new HashMap();
		hm.put("createdBy","Arijit");
		hm.put("projectName","Vtiger_09_34"+randomNo);
		hm.put("status","Created");
		hm.put("teamSize",45);
		
		given()
			.contentType(ContentType.JSON)
			.body(hm)
		.when()
			.post("http://localhost:8084/addProject")
		.then()
			.assertThat().statusCode(201).contentType(ContentType.JSON).log().all();
		
		
	}
	

}
