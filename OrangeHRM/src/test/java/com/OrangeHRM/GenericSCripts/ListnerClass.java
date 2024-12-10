package com.OrangeHRM.GenericSCripts;

import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListnerClass implements ITestListener
{
	
	ExtentSparkReporter sparkReporter;
	ExtentReports reports;
	
	public void OnStart(ITestContext context)
	
	{
		Date d=new Date();
		String d1=d.toString().replace(":","-");
		sparkReporter=new ExtentSparkReporter("./Reports/EXTENTREPORTS"+d1+".html");
		sparkReporter.config().setTheme(Theme.STANDARD);
		sparkReporter.config().setDocumentTitle("ExecutionReport");
		sparkReporter.config().setReportName("BUILB01");
		reports=new ExtentReports();
		reports.attachReporter(sparkReporter);
		reports.setSystemInfo("OS", "win");
		reports.setSystemInfo("Browser1", "Chrome");
		reports.setSystemInfo("Browser2", "Firefox");
		reports.setSystemInfo("TesterName", "TE001");
		
	}
	public void onTestSuccess(ITestResult result)
	{
		ExtentTest test=reports.createTest(result.getName());
		test.log(Status.PASS, result.getName()+"  Success");
	}
	public void onTestFailure(ITestResult result)
	{
		ExtentTest test=reports.createTest(result.getName());
		test.log(Status.FAIL, result.getName()+" is fail");
		test.log(Status.FAIL, result.getThrowable()+" is fail");
	}
	public void onTestSkipped(ITestResult result)
	{
		ExtentTest test=reports.createTest(result.getName());
		test.log(Status.SKIP, result.getName()+" is skkiped");
		test.log(Status.FAIL, result.getThrowable()+" is fail");
	}
	public void onFinish(ITestContext context)
	{
		reports.flush();
	}
	

}
