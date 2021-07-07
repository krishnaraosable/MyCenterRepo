package org.testing.ResponseValidation;
import io.restassured.response.Response;

public class StatusCodeValidation {
	public static void StatusCodeMatch(int expectedCode, Response res) {
		if(res.statusCode() == expectedCode) {
			System.out.println("Status code match");
		} else {
			System.out.println("Status code not match");
		}
	}
}
