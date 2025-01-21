package org.login;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Sample1 {
	
	public static void main(String[] args) throws IOException, ParseException {
		FileReader fileReader = new FileReader("C:\\Users\\LENOVO\\newEclipseWorkspe\\AUgAPI24\\src\\test\\resources\\ReadSample.json");
		JSONParser jsonParser = new JSONParser();
		Object parse = jsonParser.parse(fileReader);
		JSONObject jsonObject = (JSONObject)parse;
		System.out.println(jsonObject.get("id"));
		System.out.println(jsonObject.get("type"));
		System.out.println(jsonObject.get("name"));
		System.out.println(jsonObject.get("ppu"));
		Object object = jsonObject.get("batters");
		JSONObject jsonObject2 = (JSONObject)object;
		Object object2 = jsonObject2.get("batter");
		JSONArray jsonArray = (JSONArray)object2;
		for(int i=0; i<jsonArray.size(); i++) {
			Object object3 = jsonArray.get(i);
			JSONObject jsonObject3 = (JSONObject)object3;
			System.out.println(jsonObject3.get("id"));
			System.out.println(jsonObject3.get("type"));
		}
		
		Object object3 = jsonObject.get("topping");
		JSONArray jsonArray2 = (JSONArray)object3;
		for(int i=0; i<jsonArray2.size(); i++) {
			Object object4 = jsonArray2.get(i);
			JSONObject jsonObject3 = (JSONObject)object4;
			System.out.println(jsonObject3.get("id"));
			System.out.println(jsonObject3.get("type"));
		}
		
		
	}

}
