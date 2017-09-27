package com.ExtentReports;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class StartingWithExtentReports {
	
	
	public static ExtentReports extent;
	
	public static ExtentTest test;
	
	public static WebDriver driver;
	
	public static String url="http://testingmasters.com/hrm/symfony/web/index.php/auth/login";
	
	@BeforeTest
	public static void intializeExtentReport()
	{
		
		extent=new ExtentReports(System.getProperty("user.dir")+"\\Results\\Tc_01.html");
		
		extent.addSystemInfo("Project Name","Orange HRM")
		.addSystemInfo("User Name","Prathap")
		.addSystemInfo("User ID","11133797")
		.addSystemInfo("Test Environment","QA");
		
		
		extent.loadConfig(new File("extent-config.xml"));
		
		
		
	}
	
	
	@BeforeMethod
	public static void startExtentReport()
	{
		test=extent.startTest("Launch Application");
				
	}
	
	
	@AfterMethod
	public static void endExtentReports()
	{
		extent.endTest(test);
		
	}
	
	@AfterTest
	public static void generateReport()
	{
		
		extent.flush();
		extent.close();
	}
	
	
	@Test
	
	public static void startTest() throws IOException
	{
		driver=new FirefoxDriver();

		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		
		String currenturl=driver.getCurrentUrl();
		
		if(url.equals(currenturl))
		{
			
			test.log(LogStatus.PASS, "Browser is launched Sucessfully"+test.addScreenCapture(takeScreenshot(driver)));
			
		}
		
		else
		{
			
			test.log(LogStatus.FAIL, "Browser is launched Sucessfully");
		}
		
		
	}
	
	public static String takeScreenshot(WebDriver driver) throws IOException
	{
		TakesScreenshot sht=(TakesScreenshot)driver;
		
		File src=sht.getScreenshotAs(OutputType.FILE);
		
				
		String des="Screenshots\\Tc_01.png";
		
		File destination=new File(des);
		
		
		FileUtils.copyFile(src, destination);
		
		return System.getProperty("user.dir")+"\\Screenshots\\Tc_01.png";
		
		
		
	}
	
	
	


}
