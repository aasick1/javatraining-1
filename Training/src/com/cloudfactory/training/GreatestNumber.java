package com.cloudfactory.training;

public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Program to calculate the greatest number among three number
		 */
		int num1= 30;
		int num2 = 25;
		int num3 = 15;
		if(num1>num2 && num1>num3) {
			System.out.println(num1 + " is greater than "+ num2 + " "+ num3);
		}
		else if(num2>num3 && num2 >num1) {
			System.out.println(num2 + " is greater");
		}
		else
		{
			System.out.println(num3 +" is greater");
		}
	}

}
