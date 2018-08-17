package org.OrangeHRM.TestScripts;

import java.util.Scanner;

public class TempProg {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		System.out.println("Enter the array limit integer value");
		String[] arr1 = new String[value];
		int[][] arr2 = new int[value][2];
			for(int i = 0; i<value;i++)
			{
				System.out.println("enter the string value" + i);
				arr1[i] = sc.next();
			}
			for(int i = 0; i<value;i++)
			{
				System.out.println("Enter the integer value of" + i);
				arr2[i][0] = sc.nextInt();
				arr2[i][1] = i+1;
			}
			sc.close();
		
	        for (int i = 0; i < value-1; i++)
	            for (int j = 0; j < value - i-1; j++)
	                if (arr2[j][0] > arr2[j+1][0])
	                {
	                    // swap temp and arr[i]
	                    int temp = arr2[j][0];
	                    int temp1 = arr2[j][1];
	                    arr2[j][0] = arr2[j+1][0];
	                    arr2[j][1] = arr2[j+1][1];
	                    arr2[j+1][0] = temp;
	                    arr2[j+1][1] = temp1;
	                }
	        for(int i = 0; i<value;i++)
			{
	        	String value1 = arr1[arr2[i][1]-1];
	        	int value2 = arr2[i][0];
	        	
				System.out.println( value1 + "    " + value2);
			}

	}

}
