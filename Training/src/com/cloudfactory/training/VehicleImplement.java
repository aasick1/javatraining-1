package com.cloudfactory.training;

public class VehicleImplement {
	public static void main(String[] args) {
		//Non static Class
	Outer outer = new Outer();
		Outer.Inner in = outer.new Inner();
		in.printText();
		
		//static class
		/*Outer.Inner in1 = new Outer.Inner();
		in1.printText();
		*/
		
		Car c1 = new Car();
		c1.setLicensePlate("Ba65Pa");
		c1.updateLicensePlate("abcdd"); 
		System.out.println("LIcense Plate is: " + c1.getLicensePlate());
	}
}
