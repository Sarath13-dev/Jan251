package org.tets;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Sample {
	
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		
		File file = new File("C:\\Users\\LENOVO\\newEclipseWorkspe\\AUgAPI24\\src\\test\\resources\\Write1.json");
		ObjectMapper objectMapper = new ObjectMapper();
		ArrayList<Batter> batter = new ArrayList();
		Batter batter2 = new Batter("1001", "Regular");
		Batter batter3 = new Batter("1002", "Chocalate");
		Batter batter4 = new Batter("1003", "Blueberry");
		Batter batter5 = new Batter("10004", "Devil's Food");
		batter.add(batter2);
		batter.add(batter3);
		batter.add(batter4);
		batter.add(batter5);
		ArrayList<Topping> topping = new ArrayList();
		topping.add(new Topping("5001", "Java"));
		topping.add(new Topping("5002", "Python"));
		topping.add(new Topping("5003", "Selenium"));
		Batters batters = new Batters(batter);
		Root root = new Root("0001", "donut", "cake", 0.55, batters, topping);
		objectMapper.writeValue(file, root);
	}

}
