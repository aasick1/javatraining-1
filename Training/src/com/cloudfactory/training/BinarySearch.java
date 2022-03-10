package com.cloudfactory.training;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Lets declare the some arrays
		byte byteArr[] = {10, 20, 15, 22, 35};
		char charArr[] = {'a' , 'e' , 'i', 'o', 'u'};
		int intArr[] = {3, 5, 10, 45, 80};
		double doubleArr[] = {10.3, 16.43, 45.30};
		float floatArr[] = {10.2f, 15.1f, 2.2f, 3.5f};
		short shortArr[] = {10, 20, 15, 22, 35};
		//by using sort() methods array items will sort
		Arrays.sort(byteArr);
		Arrays.sort(charArr);
		Arrays.sort(intArr);
		Arrays.sort(doubleArr);
		Arrays.sort(floatArr);
		Arrays.sort(shortArr);
		//defining the search items
		byte bytekey = 35;
		char charkey = 'b';
		int intkey = 80;
		double doublekey = 3.34;
		float floatkey = 3.5f;
		short shortkey = 35;
		//printing array binarysearch result
		System.out.println(bytekey + " Found at index = "+Arrays.binarySearch(byteArr, bytekey));
		System.out.println(charkey + " Found at index = "+Arrays.binarySearch(charArr, charkey));
		System.out.println(intkey + " Found at index = "+Arrays.binarySearch(intArr, intkey));
		System.out.println(doublekey + " Found at index = "+Arrays.binarySearch(doubleArr, doublekey));
		System.out.println(floatkey + " Found at index = "+Arrays.binarySearch(floatArr, floatkey));
		System.out.println(shortkey + " Found at index = "+Arrays.binarySearch(shortArr, shortkey));
		System.out.println(Arrays.toString(shortArr));
	}
}
