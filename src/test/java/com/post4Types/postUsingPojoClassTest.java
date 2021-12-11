package com.post4Types;

import org.testng.annotations.Test;

import com.pojoUtility.PojoClass;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class postUsingPojoClassTest {
	@Test
	public void usingPojoLibrary() {
		PojoClass pj=new PojoClass("Arijit", "Rmg_Yantra","Ongoing", 52);
		
		given()
			.contentType(ContentType.JSON)
			.body(pj)
			
		.when()
			.post("http://localhost:8084/addProject")
			
		.then()
			.assertThat().statusCode(201).contentType(ContentType.JSON).log().all();
		
	}

}
