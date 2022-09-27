package com.genericLib;

import org.openqa.selenium.remote.Response;

public class RestAssuredLibrary {
	
	/*
	 * this method will give the json data through json path from response body
	 */

	public String getJsonData(Response response, String path)
	{
		String jsonData=((Object) response).jsonPath().get(path);
		return jsonData;
	}

}
