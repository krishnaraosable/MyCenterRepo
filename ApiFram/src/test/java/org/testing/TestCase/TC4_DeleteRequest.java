package org.testing.TestCase;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.StatusCodeValidation;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.PropertiesFile;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC4_DeleteRequest {
	@Test
	public void TC4() throws IOException {
		Properties pr = PropertiesFile.readProperties("../ApiFram/URI.properties");
		HTTPMethods http = new HTTPMethods(pr);
		Response res = http.DeleteRequest("BASE_URL",TC1_PostRequest.idValue);
		//System.out.println("Delete Status Code : "+res.statusCode());
		StatusCodeValidation.StatusCodeMatch(200, res);
	}
}
