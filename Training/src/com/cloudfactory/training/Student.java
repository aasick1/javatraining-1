package com.cloudfactory.training;

public class Student {
	
	private String name;
	public String lastName;
	
	//Type of functions with return type and no arguments
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setName(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
	}
	
	public String getFullName() {
		return name + " "  + lastName;
	}
	
	/*
	public String concat(String string1, String String2) throws MyException {
		if(string1 == null) {
			throw new MyException("String1 is null");
		}
		if  (string2 == null) {
			throw new MyException("String2 is null");
		}
		return string1 + string2;
		
		
	}
	*/

}