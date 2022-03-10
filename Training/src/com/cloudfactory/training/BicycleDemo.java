package com.cloudfactory.training;

public class BicycleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating different objects
		Bicycle bike1 = new Bicycle();	
		Bicycle bike2 = new Bicycle();
		
		//trying to access methods 
		bike1.changeCadence(10);
		bike1.speedUp(10);
		bike1.changeGear(2);
		bike1.printStates();
		
		
		//trying to access methods and print 
				bike2.changeCadence(40);
				bike2.speedUp(6);
				bike2.changeGear(5);
				bike2.printStates();
				
		

	}

}
