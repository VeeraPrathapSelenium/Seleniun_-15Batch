package Selenium.WebTables;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindingBrokenLinks {

	public static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		driver=new FirefoxDriver();

		driver.get("http://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		
		
		driver.findElement(By.xpath(".//*[@id='leftcontainer']/table[1]/tbody/tr[1]/td[1]")).click();
		
		String crnturl=driver.getCurrentUrl();
		
		URL url=new URL(crnturl); 
		
		HttpURLConnection con=(HttpURLConnection)url.openConnection();
		
			
		con.connect();
		
		int rescode=con.getResponseCode();
		
		System.out.println("The response code is "+rescode);
		
		
		
		
		
		
		

	}

}
