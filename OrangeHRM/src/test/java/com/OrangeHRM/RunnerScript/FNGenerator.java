package com.OrangeHRM.RunnerScript;

import org.testng.annotations.Test;

import com.OrangeHRM.ExcelUtilities.WriteDataIntoExcel;

public class FNGenerator
{
	@Test
	public void Excel() throws Exception 
	{
		WriteDataIntoExcel.CreateSheet("Credentials");
		WriteDataIntoExcel.CreateRow(0, "Credentials");
		WriteDataIntoExcel.CreateCel("Credentials", 0, 0);
		WriteDataIntoExcel.WriteValue("Credentials", 0, 0, "FirstName");
		WriteDataIntoExcel.WriteValue("Credentials", 0, 1, "MiddleName");
		WriteDataIntoExcel.WriteValue("Credentials", 0, 2, "LastName");
	

		
		System.out.println("Data is written");
	}


}
