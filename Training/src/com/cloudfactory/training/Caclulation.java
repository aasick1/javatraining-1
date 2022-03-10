package com.cloudfactory.training;
import java.util.*;

public class Caclulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int num;
		int sumnum=0;
		int k = 0;
		for(int l=5; l>=1; l--) {
			for(int m=1; m<=l; m++)
			{
				System.out.print( " * ");
			}
			System.out.println("");
		}
		
		/**
		 *     *
		 *     * *
		 *     * * *
		 *     * * * *
		 *     * * * * *
		 */
		
		for(int l=1; l<=5; l++) {
			for(int m=1; m<=l; m++)
			{
				System.out.print( " * ");
			}
			System.out.println("");
		}
		
		System.out.println("Prinint the list of first 10 evennumbers \n");
		while(k<=10) {
			if(k%2==0) {
			System.out.println(k);
			}
			k++;
			//k = k+2;
		}
			
		
		for(int j = 1;  j<=10; j++) {
			sum = sum + j;
		}
		System.out.println("The Sum of first 10 natural number is "+sum);
		
		
		System.out.println("---------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		num = sc.nextInt();
		for(int i =1; i<=num; i++) {
			sumnum= sumnum+i;
		}
		System.out.println("The sum of First "+num + " natural number is " + sumnum);
		
		
		
	}
}
