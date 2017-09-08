package com.ExcelHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ManageExcel {

	public static void main(String[] args) throws IOException {

		
		
		File f=new File("C:\\Users\\DELL\\Desktop\\Testdata.xlsx");
		
		FileInputStream fis=new FileInputStream(f);
		
		
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=workbook.getSheet("Testcases");
		
		XSSFRow row=sheet.getRow(0);
		
		XSSFCell cell=row.getCell(0);
		
		
		System.out.println(cell.getStringCellValue());
		
		
		
			
		System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());
		
		//row count
		
		System.out.println(sheet.getLastRowNum());
		
		
		//cell count
		
		System.out.println(sheet.getRow(0).getLastCellNum());
		fis.close();
		
		

	}

}
