package com.selenium.locators;

import org.openqa.selenium.By;

public class LocatorsList {
	
	
	/*
	 * ID
	 * ClassName
	 * TageName
	 * Xpath
	 * CSSSelector
	 * Name
	 * LinkText
	 * PartialLinkText
	
	 */
	
	//Syntax ID:-
	
	//driver.findElement(By.id(""));
	
	
	
	//Syntax ClassName
	
	//driver.findElements(By.className(""));
	
	//Note:When ever findElemenets are used ,we must use some collection object prefer a list and assign to this syntax
	
	
	
	
	//Syntax Tag
	
		//driver.findElements(By.TagName(""));
		
		//Note:When ever findElemenets are used ,we must use some collection object prefer a list and assign to this syntax
	
	//Syntax Xpath:-
	
		//driver.findElement(By.xPath(""));
		
		//Note:
	
	//Xpath can return single element also multiple elements, the above syntax is for single elemnet 
	
	
	//driver.findElements(By.xPath(""));
	
			//Note:
		
		//Xpath can return single element also multiple elements, the above syntax is for multiple elemnet
	
	
	//Syntax Name:-
	//driver.findElement(By.Name(""));
	
	
	
	//Syntax Linktext:-
	//driver.findElement(By.linkText(""));
	
			
}
