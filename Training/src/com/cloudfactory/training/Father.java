package com.cloudfactory.training;

public class Father extends GrandFather {
	//Fields
	String familyName;
	String houseAddress;
	//Constructor with no argument
	Father(){
		familyName = "Poudel";
		houseAddress = "Kathmandu";
		System.out.println("I am Father Class extens from GrandFather");
	}
}
