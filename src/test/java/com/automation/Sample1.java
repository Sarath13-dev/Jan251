package com.automation;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class Sample1 extends BaseClass{
	
	@Test
	private void tc0() {
		requestObject("https://petstore.swagger.io/");
		ArrayList<String> photoUrls = new ArrayList();
		photoUrls.add("string");
		ArrayList<Tags> tags = new ArrayList();
		Tags tags2 = new Tags(0, "string");
		tags.add(tags2);
		Category category = new Category(0, "string");
		RootSwagger root = new RootSwagger(0, category, "doggie", 
				photoUrls, tags, "available");
		requestSpecification.body(root);
		requestSpecification.header("accept", "application/json");
		requestSpecification.header("Content-Type","application/json");
		responseObject("POST", "v2/pet");
		responseCode();
		responseBody();
	}

}
