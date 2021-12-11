package com.validationResponse;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.List;

public class validateDynamicResponseTest {
	@Test
	public void validateDynamic() {
		String expectedProjectName = "Jenkins_Maven";
		String actualProjectname = null;
		
		Response response = when()
			.get("http://localhost:8084/projects");
		List<String> listProjectName = response.jsonPath().get("projectName");
		
		for(String list:listProjectName) {
			if(expectedProjectName.equals(list)) {
				actualProjectname=list;
			}
		}
		Assert.assertEquals(expectedProjectName,actualProjectname);
	}

}
