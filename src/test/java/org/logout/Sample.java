package org.logout;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Sample {
	
	public static void main(String[] args) throws IOException {
		
		FileReader fileReader = new FileReader("C:\\Users\\LENOVO\\newEclipseWorkspe\\AUgAPI24\\src\\test\\resources\\Read.json");
		ObjectMapper objectMapper = new ObjectMapper();
		Root readValue = objectMapper.readValue(fileReader, Root.class);
		System.out.println(readValue.getName());
		System.out.println(readValue.getAge());
		System.out.println(readValue.isStatus());
		Address address = readValue.getAddress();
		System.out.println(address.getState());
		System.out.println(address.getCountry());
		ArrayList<String> courses = readValue.getCourses();
		for(int i=0; i<courses.size(); i++) {
			System.out.println(courses.get(i));
		}
	}

}
