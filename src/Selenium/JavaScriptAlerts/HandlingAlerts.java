package Selenium.JavaScriptAlerts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();
		
		Alert alert=driver.switchTo().alert();
		
		
		Thread.sleep(2000);
		
		alert.accept();
		
		System.out.println(alert.getText());
		
		
		
		

	}

}
