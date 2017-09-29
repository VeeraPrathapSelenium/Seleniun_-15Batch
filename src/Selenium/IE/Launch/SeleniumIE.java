package Selenium.IE.Launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SeleniumIE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("WebDriver.ie.driver", "IEDriverServer.exe");
		
		
		DesiredCapabilities cap=DesiredCapabilities.internetExplorer();
		cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		
		WebDriver driver=new InternetExplorerDriver(cap);
		
		driver.get("http://testingmasters.com/hrm/symfony/web/index.php/auth/login");
		
		driver.manage().window().maximize();

	}

}
