package org.testing.TestCase;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.StatusCodeValidation;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.PropertiesFile;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC7_GetReqRes {
	@Test
	public void TC7() throws IOException {
		Properties pr = PropertiesFile.readProperties("../ApiFram/URI.properties");
		HTTPMethods http = new HTTPMethods(pr);
		Response response = http.GetRequest("REQ_RES_URL", "2");
		//System.out.println("Status code "+response.statusCode());
		StatusCodeValidation.StatusCodeMatch(200, response);
		System.out.println("Status code "+response.asString());
	}
}