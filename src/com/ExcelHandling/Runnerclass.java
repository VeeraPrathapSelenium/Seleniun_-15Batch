package com.ExcelHandling;

import java.util.List;

public class Runnerclass extends AllExcelOperations{

	
	public Runnerclass()
	{
		
		super("C:\\Users\\DELL\\Desktop\\Testdata.xlsx");
		
	}


	public static void main(String[] args) {

		Runnerclass runner=new Runnerclass();
		
		int rownum=runner.searchTestCase("Testcases", "Tc_04");
		
		System.out.println("The test case has found at "+ rownum);
		
		List credentials=runner.searchTestCase_Iteration("Login", "Tc_01",2);
		
		System.out.println(credentials.get(0));
		System.out.println(credentials.get(1));

	}

}
