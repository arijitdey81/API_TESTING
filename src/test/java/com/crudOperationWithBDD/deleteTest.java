package com.crudOperationWithBDD;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class deleteTest {
	@Test
	public void Delete() {
		when()
			.delete("http://localhost:8084/projects/TY_PROJ_402")
			
		.then()
			.assertThat().statusCode(204).contentType(ContentType.JSON).log().all();
	
	}

}
