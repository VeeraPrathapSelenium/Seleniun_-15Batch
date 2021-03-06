package Selenium.TestNg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AnnotationsImplementations {
	
	public static  Properties prop;
	
	public static WebDriver driver;
	
	public static String url="http://testingmasters.com/hrm/symfony/web/index.php/auth/login";
	
	public static SoftAssert asserts=new SoftAssert();
	
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

		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		asserts.assertEquals(url, "https://www.testingmasters.com");
		System.out.println("Browser is launched sucessfully");
	}
	
	
	@Test(testName="Logging into HRM application",priority=2,dataProviderClass=TestData.class,dataProvider="Login Credentials",dependsOnMethods="LaunchBrowser")
	
	public static void Login(String username,String Password)
	{
		driver.findElement(By.id(prop.getProperty("Username_ID"))).sendKeys(username);
		
		driver.findElement(By.id(prop.getProperty("Password_ID"))).sendKeys(Password);
		
		driver.findElement(By.id(prop.getProperty("LoginButton_ID"))).click();
		
	

		
	}
	
	
	@Test(testName="MyInfo",dependsOnMethods="Login",priority=3)
	
	public static void MyInfo()
	{
		WebElement ele=driver.findElement(By.id("menu_pim_viewMyDetails"));
		Actions acc=new Actions(driver);
		acc.moveToElement(ele).build().perform();
		ele.click();
		 
		asserts.assertAll();
	}

	
	
	
	
	
}
