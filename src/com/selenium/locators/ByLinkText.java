package com.selenium.locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ByLinkText {

	public static void main(String[] args) {

WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=458206487572991&placement=&creative=163275352284&keyword=Facebook&extra_1=fc60131e-7edc-4232-8fc1-d7bddb060ce5&partner_id=googlesem&extra_2=network%3Dg%26matchtype%3De%26target%3D%26source%3D%26adposition%3D1t1%26aceid%3D&gclid=EAIaIQobChMIzPKU59Ke1gIVxw9oCh2VHABGEAAYASAAEgLfM_D_BwE");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		
		//ByLinkText 
		driver.findElement(By.linkText("Terms")).click();
		
		
		
		
		
		
		
		

	}

}
