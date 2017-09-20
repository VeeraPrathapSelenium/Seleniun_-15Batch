package Selenium.TestNg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsImplementations {
	
	public static  Properties prop;
	
	public static WebDriver driver;
	
	
	
	@BeforeTest
	
	public static void getOR()  
	
	{
		File f=new File("ObjectRepository.properties");
		try
		{
		FileInputStream fis=new FileInputStream(f);
		
		prop=new Properties();
		
		prop.load(fis);
		
		}
		catch(Exception e)
		{
			
			System.out.println("OR is not available under the project foolder");
			
		}
		
		
		
		
		
	}
	
	

	
	@Test(testName="Launching FireFox Browser with the HRM application",priority=1)
	
	public static void LaunchBrowser()
	{
		
		driver=new FirefoxDriver();

		driver.get("http://testingmasters.com/hrm/symfony/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		
		
	}
	
	
	@Test(testName="Logging into HRM application",priority=2)
	
	public static void Login()
	{
		driver.findElement(By.id(prop.getProperty("Username_ID"))).sendKeys("User01");
		
		driver.findElement(By.id(prop.getProperty("Password_ID"))).sendKeys("pass1234");
		
		driver.findElement(By.id(prop.getProperty("LoginButton_ID"))).click();

		
	}

}
