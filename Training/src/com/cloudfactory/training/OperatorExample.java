//Operator Exampel
/**
 * Author: Dharma Raj Poudel
 * Company: Laba
 * URL: https://www.labanepal.com
 * 
 *   
 */
package com.cloudfactory.training;

public class OperatorExample {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
		/*
		 * multi line
		 * comments 
		 * in java
		 */
		
		int a = 10;
		int b = 5;
		
		String username="admin";
		String password ="admin";
				if(username=="admin" && password=="P@ssword")
				{
					System.out.println("Password Match");
				}
				else
				{
					System.out.println("Password Not Match");
				}
				
				
		
		//logical Operators
		System.out.println(a>=b && 4>5);
		// true && false
		//true
		System.out.println("------");
		//Relational Operators
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		
		//Arithmetic Operators
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		//incremetn and decrement operator
		System.out.println("---------------");
		int x = 10;
		//System.out.println(x++);
		System.out.println(++x);
		System.out.println(x--);
		System.out.println(--x);
		
	}
}
