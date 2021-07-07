package org.testing.TestCase;

import java.io.IOException;
import java.util.Properties;

import org.json.JSONObject;
import org.testing.ResponseValidation.StatusCodeValidation;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.PropertiesFile;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC3_PutRequest {
	
	@Test
	public void TC3() throws IOException {
		JSONObject js = new JSONObject(TC2_GetRequest.obj);
		JSONObject putObject = new JSONObject();
		putObject.put("id", TC1_PostRequest.idValue);
		putObject.put("firstName", "krishna res");
		putObject.put("lastName", js.get("lastName"));
		putObject.put("age", js.get("age"));
		
		Properties pr = PropertiesFile.readProperties("../ApiFram/URI.properties");
		HTTPMethods http = new HTTPMethods(pr);
		Response res = http.UpdateRequest(putObject.toString(),"BASE_URL",TC1_PostRequest.idValue);
		//System.out.println("Update Status Code : "+res.statusCode());
		StatusCodeValidation.StatusCodeMatch(200, res);
		System.out.println("Update Record : "+res.asString());
	}

}
