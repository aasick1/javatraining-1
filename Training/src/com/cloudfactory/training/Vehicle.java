package com.cloudfactory.training;

public class Vehicle {
	Vehicle(){
		System.out.println("I am Vehicel");
	}
	String licensePlate = null;
	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;	
	}	
	public String getLicensePlate() {
		return "Hello i am From " + licensePlate;	
	}
}
