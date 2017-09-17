package com.selenium.locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BySimpleXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		
		//By xpath
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Hello");

	}

}
