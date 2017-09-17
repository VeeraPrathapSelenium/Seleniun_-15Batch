package com.selenium.locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LogicalXpath {

	public static void main(String[] args) {

		
WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		
		//By logical xpath
		driver.findElement(By.xpath("//input[@id='email' or @type='email']")).sendKeys("Hello");
		
		
		
		
		

	}

}
