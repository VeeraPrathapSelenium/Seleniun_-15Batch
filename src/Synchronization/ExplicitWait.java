package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriver driver=new FirefoxDriver();
		
		driver.get("https://accounts.google.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		
		//identifying email address text box
		
		driver.findElement(By.cssSelector("#identifierId")).sendKeys("veerus.scsvmv@gmail.com");
		driver.findElement(By.cssSelector(".RveJvd.snByac")).click();
		
		
		WebDriverWait wait=new WebDriverWait(driver,45);
		
		
		WebElement ele=driver.findElement(By.xpath("//div[contains(text(),'Forgot')]"));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Forgot')]")));
		
		
		
		FluentWait wait2=new FluentWait(ele);
		wait2.withTimeout(45, TimeUnit.SECONDS);
		
		wait2.pollingEvery(3, TimeUnit.SECONDS);
	
		
		

	}

}
