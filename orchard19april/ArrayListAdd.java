package com.orchard19april;

import java.util.ArrayList; 


import java.util.Scanner;

public class ArrayListAdd {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();  
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Elements to be added into Arraylist: ");
		
		for(int i =0; i<5;i++) {
			
			String str = sc.next(); 
			
			
			list.add(str);  		// Elements are getting added to Array List
			
		}
		
		//Printing the RayyList Elements
		
		System.out.print("Elements added to ArrayList are: ");
		
		
		for(int i =0; i<5;i++) {
			
			
			
			System.out.print(list.get(i) + " ");
			
		}
		
 
			
			

	}

}
