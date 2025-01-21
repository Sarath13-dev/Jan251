package org.serilize;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Sample {
	
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		
		File f = new File("C:\\Users\\LENOVO\\newEclipseWorkspe\\AUgAPI24\\src\\test\\resources\\Write.json");
		ObjectMapper objectMapper = new ObjectMapper();
		ArrayList<String> courses = new ArrayList();
		courses.add("Java");
		courses.add("Selenium");
		Address address = new Address("TN", "IND");
		Root root = new Root("Ram Sarath", 32, true, address, courses);
		objectMapper.writeValue(f, root);
	}

}
