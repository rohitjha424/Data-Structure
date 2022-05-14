package com.orchard19april;

import java.util.Scanner;



public class PalindromeImp {

	public static void main(String[] args) {   //Main method
		
		Scanner sc = new Scanner(System.in);
		
		int num;								
		
		//Taking User Input
		
		System.out.println("Enter a Number:");
		
		num = sc.nextInt();
		
		Palindrome p = new Palindrome();

		 
		int flag = p.checkPalindrome( num);
		
		if(flag ==1) {
			System.out.println("Yes it is a Palindrome Number" );
		}
		else {
			System.out.println("No  It is not a Palindrome Number" );
			
		}
		
		

	}

}

//implementing the interface to check the Palindrome Number

class Palindrome implements palindromeNum{
	
	    @Override
		public int checkPalindrome(int num){       // Function to check palindrome number
	    	
	    	int temp = num;
	    	int rem;
	    	int sum =0;
	    	
	    	while(temp>0) {
	    		
	    		rem = temp%10;
	    		sum= sum*10 + rem;
	    		temp = temp/10;
	    		
	    	}
	    	 if(num==sum) {
	    		   return 1;   //if Palindrome Number then return 1 
	    	 }
	    		
	    		  else  {
	    			  return 0;   //if Not Palindrome Number then return 0 
	    		  }	
			
	
		}
	
}
