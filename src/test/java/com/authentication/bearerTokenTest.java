package com.authentication;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class bearerTokenTest {
	@Test
	public void bearer() {
		
		given()
			.auth().oauth2("ghp_s5slYiLZ4PSIl9HT9GL3h4BJqkMdeZ3SZBfJ")
			.pathParam("username", "arijitdey81")
		.when()
			.get("https://api.github.com/users/{username}/repos")
		.then()
			.assertThat().statusCode(200).log().all();
	}

}
