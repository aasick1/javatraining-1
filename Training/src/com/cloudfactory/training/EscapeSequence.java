package com.cloudfactory.training;

public class EscapeSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("She Said \n \t \t \"Hello!\" \n to me.");
		System.out.println(Character.isLetter('C'));
		System.out.println(Character.isLetter('5'));
		int x = Integer.parseInt("9");
		double c = Double.parseDouble("5");
		int b = Integer.parseInt("444",16);
		
		System.out.println(x);
		System.out.println(c);
		System.out.println(b);
		
		
		System.out.println(Integer.toString(444,16));
		double d = 100.675;
		double e = 100.456;
		float f = 100;
		float g = 90f;
		System.out.println(Math.round(d));
		System.out.println(Math.round(e));
		System.out.println(Math.round(f));
		System.out.println(Math.round(g));
		
		String welcome = "Welcome to the Class";
		System.out.println(welcome.substring(0));
		System.out.println(welcome.substring(5,10));
		System.out.println(welcome.substring(5,16));
		System.out.println(welcome.toLowerCase());
		System.out.println(welcome.toUpperCase());
		String s1  = "          Test String           ";
		System.out.println(s1);
		System.out.println(s1.trim());
		System.out.println(welcome + s1.trim());
		System.out.println(welcome.concat(s1.trim()));
		 char[] chars = welcome.toCharArray();
		 System.out.println(chars);
		 for(int i=0; i<chars.length; i++) {
			 System.out.println(chars[i]);
		 }
		 System.out.println("_____________________________");
		 
		 System.out.println(welcome.charAt(5));
		 
		 String str1 = "Zeus";
		 String str2 = "Chinese";
		 String str3 = "American";
		 String str4 = "Nepali";
		 System.out.println(str1.compareTo(str2));
		 System.out.println(str3.compareTo(str4));
		 String str5 = "THExyzisagoodforxyzisnZeusotforthexyzandithelpstous";
		 String[] split = str5.split("xyz");
		 for(String obj: split) {
			 System.out.println(obj);
			 
		 }
		 System.out.println("Test is a part of ...."+str5.contains(str1));
		 
		 
				 
		 
		
		
		
		System.out.println(welcome.length());
		
		
		

	}

}
