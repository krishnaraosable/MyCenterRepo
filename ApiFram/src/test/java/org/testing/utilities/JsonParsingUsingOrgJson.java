package org.testing.utilities;

import org.json.JSONArray;
import org.json.JSONObject;
import io.restassured.response.Response;

public class JsonParsingUsingOrgJson {
	
	public static String parseJson(String data,String key) {
		if(data.startsWith("{")) {
			JSONObject obj = new JSONObject(data);
			return obj.getString(key);
		}
		return key;
	}
	
	public static JSONArray parseJsonArray(Response response,String key) {
		JSONObject objArray = new JSONObject(response.asString());
		return objArray.getJSONArray(key);
	}
}
