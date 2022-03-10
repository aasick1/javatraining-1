package com.cloudfactory.training;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student();
		s1.setName("Dipesh");
		System.out.println(s1.getName());
		
		
		Student s2 = new Student();
		s2.setName("Pratap", "Shrestha");
		System.out.println(s2.getFullName());
	}

}
