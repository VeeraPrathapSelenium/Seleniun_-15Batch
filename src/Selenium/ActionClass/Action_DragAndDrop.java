package Selenium.ActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Action_DragAndDrop {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();

		driver.get("https://jqueryui.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

	}

}
