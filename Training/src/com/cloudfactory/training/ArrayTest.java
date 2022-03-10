package com.cloudfactory.training;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0; i<intArray.length;i++) {
			System.out.print(intArray[i]);
			System.out.print("\n");
		}
		
		//Declare the friendsName array and display all friends by using loop
		
		int[] arr =new int[5];
		//arr = new int[5];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("Elements at Index "+i  + " Contains Value = "+arr[i]);
		}
			
	}

}
