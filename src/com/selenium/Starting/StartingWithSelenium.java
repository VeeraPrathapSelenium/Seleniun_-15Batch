package com.selenium.Starting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StartingWithSelenium {

	public static void main(String[] args) {
		
		
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.nopcommerce.com/register.aspx");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		

	}

}
