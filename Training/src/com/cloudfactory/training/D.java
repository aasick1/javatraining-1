package com.cloudfactory.training;

public class D extends B{
	D(){
		System.out.println("I am in Class D and extendsion of B classs");
	}
	
	public static void main(String args[])
	{
		D d = new D();
		B b = new B();
		C c = new C();
	}

}
