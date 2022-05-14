package com.orchard19april;
import java.io.*;
import java.util.*;

public class IncDecHashSet {
	
	// Java program to illustrate the concept
	// of Collection objects storage in a HashSet




		public static void main(String[] args)
		{
			HashSet<Integer> num = new HashSet<Integer>();
			Scanner sc = new Scanner(System.in);
			
			for(int i =0; i<5;i++) {
				
				int element = sc.nextInt(); 
				
				
				num.add(element);  		// Elements are getting added to Array List
				
			}
			
		 
		   
		    System.out.println(num);
			
		
			
			Iterator<Integer> itDec = num.iterator();
	        while (itDec.hasNext())
	 
	            System.out.print(itDec.next() + " ");



}
}