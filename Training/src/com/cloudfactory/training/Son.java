package com.cloudfactory.training;

public class Son extends Father  {
	String name;
	Son(){
		name = "Shubham";
	}
	
	void printDetails() {
		System.out.println("Hello, my name is "+name + 
				" " + familyName + " and i am from "+ houseAddress);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s1 =  new Son();
		s1.printDetails();
	}
}
