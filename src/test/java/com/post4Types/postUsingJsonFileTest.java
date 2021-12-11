package com.post4Types;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.File;

public class postUsingJsonFileTest {
	@Test
	public void usingJsonFile() {
		File file = new File("./src/test/resources/testData.json");
		given()
			.contentType(ContentType.JSON)
			.body(file)
		.when()
			.post("http://localhost:8084/addProject")
		.then()
			.assertThat().statusCode(201).contentType(ContentType.JSON).log().all();
	}

}
