package org.testing.ResponseValidation;

import io.restassured.response.Response;

public class ResponseDataValidation {
	public static void responseDataValid(String epectedData, String jsonPath, Response res) {
		if(res.jsonPath().get(jsonPath).equals(epectedData)) {
			System.out.println("Actual & Expected data matching");
		}else {
			System.out.println("Actual & Expected data not matching");
		}
		
	}
}
