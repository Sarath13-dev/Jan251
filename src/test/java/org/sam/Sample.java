package org.sam;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Sample {
	
	public static void main(String[] args) throws IOException {
		FileReader fileReader = new FileReader("C:\\Users\\LENOVO\\newEclipseWorkspe\\AUgAPI24\\src\\test\\resources\\ReadSample.json");
		ObjectMapper objectMapper = new ObjectMapper();
		Root readValue = objectMapper.readValue(fileReader, Root.class);
		System.out.println(readValue.getId());
		System.out.println(readValue.getName());
		System.out.println(readValue.getType());
		System.out.println(readValue.getPpu());
		
		Batters batters = readValue.getBatters();
		ArrayList<Batter> batter = batters.getBatter();
		
		for(int i=0; i<batter.size(); i++) {
			Batter batter2 = batter.get(i);
			System.out.println(batter2.getId());
			System.out.println(batter2.getType());
		}
		
		ArrayList<Topping> topping = readValue.getTopping();
		for(int i=0; i<topping.size(); i++) {
			Topping topping2 = topping.get(i);
			System.out.println(topping2.getId());
			System.out.println(topping2.getType());
		}
		
	}

}
