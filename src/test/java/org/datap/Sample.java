package org.datap;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.automation.BaseClass;

public class Sample extends BaseClass{
	
	
	@Test(dataProvider="DemoData")
	private void tc0(String key1, String value1, String key2, String value2) {
		requestObject("https://reqres.in");
		JSONObject jsonObject = new JSONObject();
		jsonObject.put(key1, value1);
		jsonObject.put(key2, value2);
		payload(jsonObject);
		responseObject("POST", "api/users");
		responseCode();
		responseBody();
	}
	
	
	@DataProvider(name="DemoData")
	private Object[][] tc2() throws FileNotFoundException, IOException {
		Object[][] o = new Object[][] {
			{readDataFromExcel(0, 0), readDataFromExcel(1, 0), 
				readDataFromExcel(0, 1), readDataFromExcel(1, 1)},
			{readDataFromExcel(0, 0), readDataFromExcel(2, 0),
					readDataFromExcel(0, 1), readDataFromExcel(2, 1)},
			{readDataFromExcel(0, 0), readDataFromExcel(3, 0),
						readDataFromExcel(0, 1), readDataFromExcel(3, 1)}
		};
		return o;
	}

}
