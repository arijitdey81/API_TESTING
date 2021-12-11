package com.validationResponse;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class validateUsingStaticResponseTest {
	@Test
	public void staticResponseTest() {
		
		String expectedProjectName = "EFGH";
		Response response = when()
			.get("http://localhost:8084/projects");
		String actualProjectname = response.jsonPath().get("[0].projectName");
		
		System.out.println("Actual ProjectName is-->"+actualProjectname);
		System.out.println("Expected ProjectName is-->"+expectedProjectName);
		
		response.then()
			.assertThat().statusCode(200).contentType(ContentType.JSON).log().all();
		
		Assert.assertEquals(expectedProjectName, actualProjectname);
		
	}

}
