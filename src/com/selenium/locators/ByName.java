package com.selenium.locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ByName {

	public static void main(String[] args) {
	
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.nopcommerce.com/register.aspx");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		
		//By ID 
		driver.findElement(By.id("ctl00_ctl00_cph1_cph1_ctrlCustomerRegister_CreateUserForm_CreateUserStepContainer_txtFirstName")).sendKeys("Hello");
		
		//ByName
		
		driver.findElement(By.name("ctl00$ctl00$cph1$cph1$ctrlCustomerRegister$CreateUserForm$CreateUserStepContainer$txtLastName")).sendKeys("Prathap");
		
		
		
		
		
		

	}

}
