package com.ToolsQA.TestScripts;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class AlternateKills {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int Number_People = sc.nextInt();
		
		ArrayList<Integer> Arr_People =new ArrayList<Integer>(); 
				
		for(int i=0; i<Number_People; i++)
		{
			Arr_People.add(i+1);
		}
	int count = Number_People;	
		
			for(int i = 0; Arr_People.size()>1; i++){
				try {
					if(i == Arr_People.size()){
						
						i = 0;
						System.out.println(Arr_People);
					}
						else if((i+1)== Arr_People.size()){
							
							i=-1;
							System.out.println(Arr_People);
							
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
				Arr_People.remove(i+1);
				//System.out.println(Arr_People);
							
				
			}
				
			System.out.println(Arr_People);
	}

}
