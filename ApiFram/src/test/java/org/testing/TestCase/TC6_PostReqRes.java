package org.testing.TestCase;
import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.StatusCodeValidation;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.PropertiesFile;
import org.testng.annotations.Test;
import org.testing.utilities.JsonFile;
import io.restassured.response.Response;

public class TC6_PostReqRes {
	@Test
	public void TC6() throws IOException {
		Properties pr = PropertiesFile.readProperties("../ApiFram/URI.properties");
		String bodyData = JsonFile.readJson("../ApiFram/src/test/java/org/testing/resource/reqBody.json");
		HTTPMethods http = new HTTPMethods(pr);
		Response response = http.PostRequest(bodyData, "REQ_RES_URL");
		//System.out.println("Req res " + response.statusCode());
		StatusCodeValidation.StatusCodeMatch(201, response);
	}

}
