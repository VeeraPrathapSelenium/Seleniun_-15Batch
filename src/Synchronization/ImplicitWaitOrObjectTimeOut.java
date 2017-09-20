package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicitWaitOrObjectTimeOut {

	public static void main(String[] args) {
WebDriver driver=new FirefoxDriver();
		
		driver.get("https://accounts.google.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		
		//identifying email address text box
		
		driver.findElement(By.cssSelector("#identifierId")).sendKeys("veerus.scsvmv@gmail.com");
		driver.findElement(By.cssSelector(".RveJvd.snByac")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'Forgot')]")).click();

	}

}
