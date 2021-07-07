package org.testing.TestCase;

import java.io.IOException;
import java.util.Properties;
import org.testng.annotations.Test;
import org.testing.ResponseValidation.StatusCodeValidation;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.JsonFile;
import org.testing.utilities.PropertiesFile;
import org.testing.utilities.RandomData;
import org.testing.utilities.JsonParsingUsingOrgJson;
import org.testing.utilities.JsonVariableReplacement;

import io.restassured.response.Response;

public class TC1_PostRequest {
	static String idValue;
	@Test
	public void TC1() throws IOException {
		Integer randomNumber = RandomData.genrateRandomNumber();
		Properties p = PropertiesFile.readProperties("../ApiFram/URI.properties");
		String bodyData = JsonFile.readJson("../ApiFram/src/test/java/org/testing/resource/BodyData.json");
		bodyData = JsonVariableReplacement.jsonReplace(bodyData, "id", randomNumber.toString());
		
		HTTPMethods http = new HTTPMethods(p);
		Response res = http.PostRequest(bodyData, "BASE_URL");
		
		idValue = JsonParsingUsingOrgJson.parseJson(res.asString(), "id");
		System.out.println("Id value is : "+idValue);
		
		StatusCodeValidation.StatusCodeMatch(201, res);
	}

}
