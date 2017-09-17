package com.selenium.locators;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSS_GetAllItems {

	public static void main(String[] args) {

		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		
		//By function noted xpath
		List<WebElement> allitems=driver.findElements(By.cssSelector("select[id='day']>option"));
		
		
		System.out.println(allitems.size());
		
		
		
		
		

	}

}
