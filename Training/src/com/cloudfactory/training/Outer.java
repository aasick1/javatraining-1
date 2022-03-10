package com.cloudfactory.training;

public class Outer {
	private  String text =  "I am private";
	
	public  class Inner{
		private String text  = " i am Inner Private";
		
		public void printText() {
			System.out.println(text);
			System.out.println(Outer.this.text);
	}
	}
}
