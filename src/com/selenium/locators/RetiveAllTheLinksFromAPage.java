package com.selenium.locators;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RetiveAllTheLinksFromAPage {

	public static void main(String[] args) {
		
WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=pvS9WY7_H-iK8QfXpig&gws_rd=ssl");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		
		
		//Using TagName
		
		List<WebElement>alllinks=driver.findElements(By.tagName("a"));
		
		System.out.println(alllinks.size());
		
		
		for(int i=0;i<=alllinks.size()-1;i++)
		{
			
			if(alllinks.get(i).isDisplayed())
			{
				System.out.println(alllinks.get(i).getText());
				
			}
			
			
		}
		


	}

}
