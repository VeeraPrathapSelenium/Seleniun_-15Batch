package com.selenium.locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SimpleCSSSelector {
	
	public static void main(String[] args) {

		WebDriver driver=new FirefoxDriver();
				
				driver.get("https://www.facebook.com/");
				
				driver.manage().window().maximize();
				
				driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
				
				//By function noted xpath
				driver.findElement(By.cssSelector("select[id='day']")).sendKeys("4");
				
				driver.findElement(By.cssSelector("#day")).sendKeys("6");
				

			}

}
