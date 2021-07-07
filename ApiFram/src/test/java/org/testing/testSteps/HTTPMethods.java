package org.testing.testSteps;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class HTTPMethods {
	Properties pr;
	
	public HTTPMethods(Properties pr) {
		this.pr = pr;
	}
	
	//Post and add record
	public Response PostRequest(String bodyData, String uriKey) {
		Response response =
				given()
				.contentType(ContentType.JSON)
				.body(bodyData)
				.when()
				.post(pr.getProperty(uriKey));		
		return response;
	}
	
	//Get specific records
	public Response GetRequest(String uriKey,String pathParam) {
		String endPoint = pr.getProperty(uriKey)+"/"+pathParam;
		Response response =
				given()
				.contentType(ContentType.JSON)
				.when()
				.get(endPoint);	
		return response;
	}
	
	public Response GetRequest(String uriKey){
		Response response =
				given()
				.when()
				.get(pr.getProperty(uriKey));
		return response;
	}
	
	
	//Update Specific records
	public Response UpdateRequest(String updateData, String uriKey, String pathParam) {
		String uri = pr.getProperty(uriKey)+"/"+pathParam;
		Response response =
				given()
				.contentType(ContentType.JSON)
				.body(updateData)
				.when()
				.put(uri);
		return response;
	}
	
	//Delete Record
	public Response DeleteRequest(String uriKey, String pathParam) {
		String uri = pr.getProperty(uriKey)+"/"+pathParam;
		Response response = 
				given()
				.contentType(ContentType.JSON)
				.when()
				.delete(uri);
		return response;
	}
}