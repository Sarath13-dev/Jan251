package org.serilize;

import java.util.ArrayList;

public class Root {
	
	private String name;
	
	private int age;
	
	private boolean status;
	
	private Address address;
	
	private ArrayList<String> courses;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public ArrayList<String> getCourses() {
		return courses;
	}

	public void setCourses(ArrayList<String> courses) {
		this.courses = courses;
	}

	public Root(String name, int age, boolean status, Address address, ArrayList<String> courses) {
		super();
		this.name = name;
		this.age = age;
		this.status = status;
		this.address = address;
		this.courses = courses;
	}
	
	

}
