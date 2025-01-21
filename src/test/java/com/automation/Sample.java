package com.automation;

import java.util.ArrayList;

import org.json.simple.JSONObject;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Sample extends BaseClass{
	
	@BeforeMethod
	private void beforeMethod() {
		requestObject("https://reqres.in");
	}
	
	@Test
	private void tc0() {
		queryParameter("page", "2");
		responseObject("GET", "api/users");
		Root as = response.as(Root.class);
		System.out.println(as.getPage());
		System.out.println(as.getPer_page());
		System.out.println(as.getTotal());
		System.out.println(as.getTotal_pages());
		ArrayList<Data> data = as.getData();
		for(int i=0; i<data.size(); i++) {
			Data data2 = data.get(i);
			System.out.println(data2.getId()+ " "
			+ data2.getFirst_name()+" "
			+ data2.getLast_name()+" "
			+ data2.getEmail()+" "
			+ data2.getAvatar());
		}
		Support support = as.getSupport();
		System.out.println(support.getText());
		System.out.println(support.getUrl());
		
		
	}

	
	@AfterMethod
	private void afterMethod() {
		responseCode();
	}
	
	
	
	
}
