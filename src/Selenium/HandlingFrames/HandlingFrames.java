package Selenium.HandlingFrames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingFrames {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();

		driver.get("http://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		WebElement frame=driver.findElement(By.xpath("//iframe"));
		
		driver.switchTo().frame(frame);
		
		
		
		WebElement src=driver.findElement(By.xpath(".//*[@id='draggable']"));
		
		
		WebElement dest=driver.findElement(By.xpath(".//*[@id='droppable']"));
		
		
		Actions acc=new Actions(driver);
		
		acc.dragAndDrop(src, dest).build().perform();
	
		
		
		driver.switchTo().defaultContent();

	}

}
