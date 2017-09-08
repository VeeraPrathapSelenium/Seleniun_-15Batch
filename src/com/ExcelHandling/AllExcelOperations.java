package com.ExcelHandling;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AllExcelOperations {
	
	//Excel Workbook;
	
	public static XSSFWorkbook workbook;
	
	
	public static boolean status=true;
	
	
	public AllExcelOperations()
	{
		
	}
	
	
	
	
//Creating a constructor 	
	
	public AllExcelOperations(String path)
	{
		try
		{
		File f=new File(path);
		
		FileInputStream fis=new FileInputStream(f);
		
		
	workbook=new XSSFWorkbook(fis);
		}
		
		
		catch(Exception e)
		{
			
			status=false;
			
			System.out.println(e);
			
		}
		
		
	}
	
	
	
	/* Function Name:-searchTestCase
	 * Parameters Required:-sheetname,Testcasename,Iteration
	 * ReturnType:-It will the row number where the testcase is found
	 * Designed By:-Prathap
	 */
	
	
	public static int searchTestCase(String sheetname,String tcname)
	{
		
		int tcrow=0;
		int rcnt=workbook.getSheet(sheetname.trim()).getLastRowNum();
		
	
		for (int r=1;r<=rcnt-1;r++)
		{
			
			
			int c=searchcolname(sheetname,"Testcases");
			String crnttcname=workbook.getSheet(sheetname).getRow(r).getCell(c).getStringCellValue();
			
			if(crnttcname.equals(tcname))
			{
				
				tcrow=r;
				
				break;
				
			}
			
		}
		
		return tcrow;
	}
	
	
	/* Function Name:-searchColumnName
	 * Parameters Required:-sheetname,colnum
	 * ReturnType:-It will the column number where the testcase is found
	 * Designed By:-Prathap
	 */
	
	
	public static int searchcolname(String sheetname,String colname)
	{
		
		int colfound=0;
	
		int ccnt=workbook.getSheet(sheetname.trim()).getRow(0).getLastCellNum();
		
	
		for (int c=0;c<=ccnt-1;c++)
		{
			String crntcolname=workbook.getSheet(sheetname).getRow(0).getCell(c).getStringCellValue();
			
			if(crntcolname.equals(colname))
			{
				
				colfound= c;
				
				break;
				
			}
			
		}
		return colfound;
	
	}
	
	
	
	/* Function Name:-searchTestCase
	 * Parameters Required:-sheetname,Testcasename,Iteration
	 * ReturnType:-It will the row number where the testcase is found
	 * Designed By:-Prathap
	 */
	
	
	public static List searchTestCase_Iteration(String sheetname,String tcname,int itr)
	{
		
		int tcrow=0;
		
		List data=new ArrayList();
		int rcnt=workbook.getSheet(sheetname.trim()).getLastRowNum();
		
	
		for (int r=1;r<=rcnt-1;r++)
		{
			
			
			int c=searchcolname(sheetname,"Testcases");
			String crnttcname=workbook.getSheet(sheetname).getRow(r).getCell(c).getStringCellValue();
			
			c=searchcolname(sheetname,"Iteration");
			
			int crntitr=(int) workbook.getSheet(sheetname).getRow(r).getCell(c).getNumericCellValue();
			 
			
			if(crnttcname.equals(tcname) && crntitr==itr)
			{
				c=searchcolname(sheetname,"Username");
				data.add(workbook.getSheet(sheetname).getRow(r).getCell(c).getStringCellValue());
				
				c=searchcolname(sheetname,"Password");
				data.add(workbook.getSheet(sheetname).getRow(r).getCell(c).getStringCellValue());
				
				tcrow=r;
				
				break;
				
			}
			
		}
		
		return data;
	}
	
	
	

}
