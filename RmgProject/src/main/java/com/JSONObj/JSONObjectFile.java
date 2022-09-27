package com.JSONObj;

import java.util.Random;

import org.json.simple.JSONObject;

public class JSONObjectFile {


	public Object jsonObjectFile()
	{
		Random ran = new Random();
		int randomNum = ran.nextInt(100);
		
		JSONObject jsob = new JSONObject();
		jsob.put("createdBy", "ChandrapRakash");
		jsob.put("projectName", "FFF"+randomNum);
		jsob.put("status", "Created");
		jsob.put("teamSize", 35);
		
		return jsob;
	}
	
	
	
}
