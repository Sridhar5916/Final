package com.OrangeHRM.ExcelUtilities;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.OrangeHRM.GenericSCripts.ApplicationConstants;

public class WriteDataIntoExcel implements ApplicationConstants
{
    static XSSFWorkbook book;
    static XSSFSheet sheet ;
    static XSSFRow row1;
    static XSSFCell ceL1;
    static FileOutputStream fos;
	 


	public static  void CreateSheet(String SheetName) throws Exception
	{
		book = new XSSFWorkbook();
		sheet = book.createSheet(SheetName);
		fos= new FileOutputStream(Excelpath+"/Credentials123.xlsx");
		
	}
	public static void CreateRow(int Row,String SheetName) throws Exception
	{
		sheet = book.getSheet(SheetName);
		row1 = sheet.createRow(Row);
		fos= new FileOutputStream(Excelpath+"/Credentials123.xlsx");	
	}
	public static void GetRow(String SheetName, int Row) throws IOException
	{
		sheet=book.getSheet(SheetName);
		sheet.getRow(Row);
		fos=new FileOutputStream(Excelpath+"/Credentials123.xlsx");
	}
	public static void GetCell(String SheetName, int Row, int cel) throws IOException
	{
		sheet=book.getSheet(SheetName);
		row1=sheet.getRow(Row);
		row1.getCell(cel);
		fos=new FileOutputStream(Excelpath+"/Credentials123.xlsx");
	}
	public static void SetCelVal(String SheetName, int Row,int cel,String celval) throws IOException
	{
		sheet=book.getSheet(SheetName);
		row1=sheet.getRow(Row);
		ceL1=row1.getCell(cel);
		ceL1.setCellValue(celval);
		
	}
	public static void CreateCel(String SheetName,int Row,int cel) throws Exception
	{
		sheet = book.getSheet(SheetName);
		row1 = sheet.getRow(Row);
		ceL1 = row1.createCell(cel);
		fos= new FileOutputStream(Excelpath+"/Credentials123.xlsx");	
	}
	public static void WriteValue(String SheetName,int Rowvalue,int celvalue, String Val) throws Exception
	{
		sheet = book.getSheet(SheetName);
		row1 = sheet.getRow(Rowvalue);
		ceL1 = row1.createCell(celvalue);
		ceL1.setCellValue(Val);
		fos= new FileOutputStream(Excelpath+"/Credentials123.xlsx");	
		book.write(fos);
		fos.close();
	}
	public static XSSFSheet AccessSheet(String SheetName)
	{
		XSSFSheet AccessedSheet=book.getSheet(SheetName);
		return AccessedSheet;
		
	}	
	
}
	

