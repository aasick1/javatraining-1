package com.cloudfactory.training;

public class Daughter extends Father {

	String name;
	Daughter(){
		name = "Susham";
	}
	void printDetails() {
		System.out.println("Hello, my name is "+name + 
				" " + familyName + " and i am from "+ houseAddress);	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Daughter d1 =  new Daughter();
		d1.printDetails();
	}

}
