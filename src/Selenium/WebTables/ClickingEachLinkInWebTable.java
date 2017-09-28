package Selenium.WebTables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClickingEachLinkInWebTable {
	public static WebDriver driver;
	
	public static void main(String[] args) {

		
		driver=new FirefoxDriver();

		driver.get("http://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		
		//Step 1:Configure WebTable
		
		WebElement webtable=driver.findElement(By.xpath(".//*[@id='leftcontainer']/table[1]"));
		
		
		
		//Step 2:Get RowCount
		
		
		List<WebElement> rowcount=driver.findElements(By.xpath(".//*[@id='leftcontainer']/table[1]/tbody/tr"));
		
		
		System.out.println("The Total Row Count of the table is"+rowcount.size());
		
		
		for(int r=0;r<=rowcount.size()-1;r++)
		{
			
			//Step 3:-Click on the link available in first Column and Navigate Back to the browser
			
			
			
			
			
				
			driver.findElement(By.xpath(".//*[@id='leftcontainer']/table[1]/tbody/tr["+(r+1)+"]/td[1]")).click();
			
			driver.navigate().back();
				
			
			
		}
		
		
		

	}

	}


