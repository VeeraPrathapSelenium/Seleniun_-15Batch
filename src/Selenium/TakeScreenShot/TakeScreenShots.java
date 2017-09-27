package Selenium.TakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Selenium.TestNg.TestData;

public class TakeScreenShots {
	
public static WebDriver driver;
	
	public static String url="http://testingmasters.com/hrm/symfony/web/index.php/auth/login";

	@Test(testName="Launching FireFox Browser with the HRM application",priority=1,dataProviderClass=TestData.class,dataProvider="Login Credentials",groups="smoketest")
	
	public static void LaunchBrowser(String username,String Password ) throws IOException
	{
		
		driver=new FirefoxDriver();

		driver.get(url);  
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		takeScreenshot(driver);
		
	}
	
	
	
	
	public static void takeScreenshot(WebDriver driver) throws IOException
	{
		TakesScreenshot sht=(TakesScreenshot)driver;
		
		File src=sht.getScreenshotAs(OutputType.FILE);
		
				
		String des="Screenshots\\Tc_01.png";
		
		File destination=new File(des);
		
		
		FileUtils.copyFile(src, destination);
		
		
		
		
		
	}

}

