package com.cloudfactory.training;

public class NumberFormat {
	private String cname;
	private String companyName;
	
	//creating constructor
	NumberFormat(){
		
		System.out.println("Constructor Called");
		cname="Cloud Factory";
	}
	
	NumberFormat(String cname){
		companyName = cname;
		System.out.println("The Company Name is : "+ companyName);
		
	}
	
	
	
	
	private String formatNumber(int value) {
		return String.format("%d", value);
	}
	
	private String formatNumber(double value) {
		return String.format("%.3f", value);
		
	}
	private String formatNumber(String value) {
		return String.format("%.2f", Double.parseDouble(value));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		NumberFormat nf = new NumberFormat();
		
		System.out.println(nf.formatNumber(400));
		System.out.println(nf.formatNumber(400.7474644));
		System.out.println(nf.formatNumber("500"));
		
		System.out.println(nf.cname);
		
		NumberFormat nf1 = new NumberFormat("New Horizon");
		NumberFormat nf2 = new NumberFormat("New Boston");
		NumberFormat nf3 = new NumberFormat("IIT");
		NumberFormat nf4 = new NumberFormat("MIT");
		
		
	}

}
