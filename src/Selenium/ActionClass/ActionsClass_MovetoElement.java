package Selenium.ActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass_MovetoElement {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();

		driver.get("https://jqueryui.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		
		WebElement download=driver.findElement(By.xpath(".//*[@id='menu-top']/li[2]/a"));
		
		
		Actions acc=new Actions(driver);
		
		acc.moveToElement(download).build().perform();
				

	}

}
