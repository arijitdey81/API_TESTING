package com.parameters;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class gitHubParamsTest {
	@Test
	public void pathAndQueryParam() {
		given()
			.pathParam("username", "arijitdey81")
			.queryParam("sort", "created")
		.when()
			.get("https://api.github.com/users/{username}/repos")
		.then()
			.assertThat().statusCode(200).log().all();
	}

}
