package com.crudOperationWithBDD;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class getAllProjectsTest {
	@Test
	public void getAllProjects() {
		when()
			.get("http://localhost:8084/projects")
		
		.then()
			.assertThat().statusCode(200).contentType(ContentType.JSON).log().all();
			
	}

}
