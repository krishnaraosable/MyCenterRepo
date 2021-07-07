package org.testing.TestCase;
import java.io.IOException;

import java.util.Properties;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import org.testing.utilities.PropertiesFile;
import org.testing.ResponseValidation.StatusCodeValidation;
import org.testing.testSteps.HTTPMethods;

public class TC2_GetRequest {
	static String obj;
	@Test
	public void TC2() throws IOException {
		Properties p = PropertiesFile.readProperties("../ApiFram/URI.properties");
		HTTPMethods http = new HTTPMethods(p);
		Response res = http.GetRequest("BASE_URL",TC1_PostRequest.idValue);
		//System.out.println("Fetch Record Status code : "+res.statusCode());
		
		StatusCodeValidation.StatusCodeMatch(200, res);
		
		System.out.println("Fetch Record : "+res.asString());
		obj = res.asString();
	}
}
