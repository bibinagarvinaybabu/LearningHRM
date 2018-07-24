package com.ToolsQA.TestScripts;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SpaceNormalize {
	static WebDriver driver;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String words[] = input.split(" ");
		for (String string : words) {
			if(!string.equals("")){
			System.out.println("+" + string + "+");
	   	    }
		}	
		
		String after = input.trim().replaceAll("( )+", " ");
		System.out.println(after);
		
		WebDriverWait wait = new WebDriverWait(driver,10);

	}

}
