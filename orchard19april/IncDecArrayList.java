package com.orchard19april;

import java.util.*;

public class IncDecArrayList {
public static void main(String[] args) {
		
	 ArrayList<Integer> list = new ArrayList<Integer>();  
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Elements to be added into Arraylist: ");
		
		for(int i =0; i<5;i++) {
			
			int element = sc.nextInt(); 
			
			
			list.add(element);  		// Elements are getting added to Array List
			
		}
		
		//Printing the RayyList Elements
		
		System.out.print("Elements added to ArrayList are: ");
		
		
		for(int i =0; i<5;i++) {
			
			
			
			System.out.print(list.get(i) + " ");
			
		}
			
		System.out.println();
		
		
		//Sorting Array into Ascending order using Collections
		
		Collections.sort(list);  
		
		System.out.print("ArrayList Elements  After sorting in Ascendng order: ");
		
		//printing ArrayList elements using iterator
		
		Iterator<Integer> itInc = list.iterator();  
		
		 while (itInc.hasNext())
			 

	            System.out.print(itInc.next() + " ");
		
		
		System.out.println();
		
		
		//Sorting Array into Descending order using Collections
		
		Collections.sort(list, Collections.reverseOrder()); 
		
		System.out.print("ArrayList Elements  After sorting in Descendng order: ");
		
	
		
		Iterator<Integer> itDec = list.iterator();
        while (itDec.hasNext())
 
            System.out.print(itDec.next() + " ");
		
		

	}


}





