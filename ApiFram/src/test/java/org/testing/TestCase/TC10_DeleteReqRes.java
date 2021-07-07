package org.testing.TestCase;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.StatusCodeValidation;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.PropertiesFile;
import org.testng.annotations.Test;
import io.restassured.response.Response;

public class TC10_DeleteReqRes {
	@Test
	public void TC10() throws IOException {
		Properties pr = PropertiesFile.readProperties("../ApiFram/URI.properties");
		HTTPMethods http = new HTTPMethods(pr);
		Response response = http.DeleteRequest("REQ_RES_URL", "2");
		//System.out.println("Delete Req Res Status Code "+response.statusCode());
		StatusCodeValidation.StatusCodeMatch(204, response);
	}
}
