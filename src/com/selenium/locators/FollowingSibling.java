package com.selenium.locators;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FollowingSibling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		
//	List<WebElement> allvalues=driver.findElements(By.xpath("//select[@id='day']/option"));
//	
//	
//	
//for(int i=0;i<=allvalues.size()-1;i++)
//{
//	
//	System.out.println(allvalues.get(i).getText());
//	
//}
		
		//driver.findElement(By.xpath("//select[@id='day']")).sendKeys("4");
		
		List<WebElement> allvalues=driver.findElements(By.xpath("//select[@id='day']/option/following-sibling::option"));
		
		
		
	for(int i=0;i<=allvalues.size()-1;i++)
	{
		
		System.out.println(allvalues.get(i).getText());
		
	}	
		
		

	}

}
