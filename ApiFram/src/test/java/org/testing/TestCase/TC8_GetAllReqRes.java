package org.testing.TestCase;
import java.io.IOException;
import java.util.Properties;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testing.ResponseValidation.StatusCodeValidation;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.JsonParsingUsingOrgJson;
import org.testing.utilities.PropertiesFile;
import org.testng.annotations.Test;
import io.restassured.response.Response;

public class TC8_GetAllReqRes {
	@Test
	public void TC8() throws IOException {
		Properties pr = PropertiesFile.readProperties("../ApiFram/URI.properties");
		HTTPMethods http = new HTTPMethods(pr);
		Response response = http.GetRequest("REQ_RES_URL");
		StatusCodeValidation.StatusCodeMatch(200, response);
		JSONArray jSA = new JSONArray(JsonParsingUsingOrgJson.parseJsonArray(response, "data"));
		for(int i=0;i<jSA.length();i++) {
			JSONObject ob = jSA.getJSONObject(i);
			System.out.println("id is "+ob.get("id"));
		}
	}
}