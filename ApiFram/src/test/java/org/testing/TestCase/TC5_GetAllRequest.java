package org.testing.TestCase;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.StatusCodeValidation;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.PropertiesFile;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC5_GetAllRequest {
	@Test
	public void TC5() throws IOException {
		Properties p = PropertiesFile.readProperties("../ApiFram/URI.properties");
		HTTPMethods http = new HTTPMethods(p);
		Response res = http.GetRequest("BASE_URL");
		StatusCodeValidation.StatusCodeMatch(200, res);
		//System.out.println("Status Code "+res.statusCode());
	//	System.out.println("Total Records "+res.asString());
	}

}
