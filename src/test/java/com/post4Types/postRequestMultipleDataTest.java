package com.post4Types;

import static io.restassured.RestAssured.given;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pojoUtility.PojoClass;

import io.restassured.http.ContentType;

public class postRequestMultipleDataTest {
	@Test(dataProvider = "provideData")
	public void postResquestMultipleData(String createBy, String projectName, String status, int teamSize) {
  
	PojoClass pj=new PojoClass(createBy, projectName, status, teamSize);
		
		given()
			.contentType(ContentType.JSON)
			.body(pj)
			
		.when()
			.post("http://localhost:8084/addProject")
			
		.then()
			.assertThat().statusCode(201).contentType(ContentType.JSON).log().all();
	}
	
	@DataProvider
	public Object[][] provideData() {
		Object[][] obj = new Object[2][4];
		obj[0][0]="Arijit2";
		obj[0][1]="AD_Pro3";
		obj[0][2]="Ongoing";
		obj[0][3]=7;
		
		obj[1][0]="Arijit3";
		obj[1][1]="AD_Pro4";
		obj[1][2]="Completed";
		obj[1][3]=11;
		
		return obj;
		
	}

}
