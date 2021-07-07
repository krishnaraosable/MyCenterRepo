package org.testing.TestCase;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.StatusCodeValidation;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.JsonFile;
import org.testing.utilities.PropertiesFile;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC9_UpdateReqRes {
	@Test
	public void TC9() throws IOException {
		Properties pr = PropertiesFile.readProperties("../ApiFram/URI.properties");
		String bodyData = JsonFile.readJson("../ApiFram/src/test/java/org/testing/resource/UpdateReqRes.json");
		HTTPMethods http = new HTTPMethods(pr);
		Response response = http.UpdateRequest(bodyData, "REQ_RES_URL", "2");
		//System.out.println("Update Res Req Status "+response.statusCode());
		StatusCodeValidation.StatusCodeMatch(200, response);
		System.out.println("Update Response "+response.asString());
	}
}
