package com.orchard19april;

import java.util.Scanner;

public class FactorialImp {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		int num;								
		
		//Taking User Input 
		
		System.out.println("Enter a Number:");
		
		num = sc.nextInt();
		
		FactorialCal obj = new FactorialCal();
		
		
		 System.out.println("Factorial of "+num+" is: "+ obj.factCal(num)); 
		
		

	}

}

class FactorialCal implements factorial{
			
	public int factCal(int num) {
		 int i,fact=1;  
		  //It is the number to calculate factorial    
		  for(i=1;i<=num;i++){    
		      fact=fact*i;    
		  } 
		  return fact;
		    
		 }  
		
		
	}

