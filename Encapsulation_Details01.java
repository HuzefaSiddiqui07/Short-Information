package com.encapsulation01;

public class Encapsulation_Details01 {
	// Declare 01
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// Declare 02
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int emp_age) {
		if (emp_age<0) {
			age=0;
		}
		else {
			age=emp_age;
		}
	}
	
	// Declare 03
	private char gender;

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

 }
	
	
	

	