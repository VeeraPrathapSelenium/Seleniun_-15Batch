package Selenium.SelectClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) {

		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		
		//Using Select Class
		
		WebElement day=driver.findElement(By.id("day"));
		
		Select daylist=new Select(day);
		
		daylist.selectByIndex(5);
		
		daylist.selectByValue("4");
		
				
		daylist.selectByVisibleText("8");
				
		
		
		

	}

}
