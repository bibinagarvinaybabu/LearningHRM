package org.OrangeHRM.TestScripts;
import java.util.Scanner;

public class Additionofthree {
	
		public static void main(String args[]){
			
			// fill the code
	        
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the shipping cost of Item 1");
	        int Item1 = sc.nextInt();
	        System.out.println("Enter the shipping cost of Item 2");
	        int Item2 = sc.nextInt();
	        System.out.println("Enter the shipping cost of Item 3");
	        int Item3 = sc.nextInt();
	        int Result = Item1 + Item2 + Item3;
	       System.out.println("Total shipping cost of items is " + Result); 
	       sc.close();
	        
	    }
	}


