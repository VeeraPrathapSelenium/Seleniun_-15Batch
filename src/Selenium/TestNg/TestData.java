package Selenium.TestNg;

import org.testng.annotations.DataProvider;

public class TestData {
	

	@DataProvider(name="Login Credentials")
	
	 public static Object[][] loginCredentials()
	 {
		Object[][] obj=new Object[1][2];
		obj[0][0]="user01";
		obj[0][1]="pass1234";
		
		return obj;
		
		
	 }
	
	
	@DataProvider(name="My Info")
	
	 public static Object[][] MyInfo()
	 {
		Object[][] obj=new Object[1][3];
		obj[0][0]="Veera";
		obj[0][1]="Prathap";
		obj[0][2]="Malepati";
		return obj;
		
		
	 }

	

}
