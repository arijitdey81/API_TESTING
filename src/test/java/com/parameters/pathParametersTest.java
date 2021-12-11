package com.parameters;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class pathParametersTest {
	@Test
	public void pathparameter() {
		String proId = "TY_PROJ_802";
		given()
			.pathParam("projectId", proId)
		.when()
			.get("http://localhost:8084/projects/{projectId}")
		.then()
			.assertThat().statusCode(200).log().all();
	}

}
