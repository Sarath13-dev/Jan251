package org.login;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Sample {

	public static void main(String[] args) throws IOException, ParseException {
		FileReader fileReader = new FileReader("C:\\Users\\LENOVO\\newEclipseWorkspe\\AUgAPI24\\src\\test\\resources\\Read.json");
		JSONParser jsonParser = new JSONParser();
		Object parse = jsonParser.parse(fileReader);
		//Type casting between Java Object and JSONObject
		//Syntax lowerOrder objname = (lowerOrder) higherOrderObjeName;
		JSONObject jsonObject = (JSONObject)parse;
		System.out.println(jsonObject.get("name"));
		System.out.println(jsonObject.get("age"));
		System.out.println(jsonObject.get("status"));
		Object object = jsonObject.get("address");
		JSONObject jsonObject2 = (JSONObject)object;
		System.out.println(jsonObject2.get("state"));
		System.out.println(jsonObject2.get("country"));
		
		Object object2 = jsonObject.get("courses");
		JSONArray jsonArray = (JSONArray)object2;
		
		for(int i=0; i<jsonArray.size(); i++) {
			System.out.println(jsonArray.get(i));
		}
		
		
		
	
	}

}
