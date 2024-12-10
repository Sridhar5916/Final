package com.OrangeHRM.GenericSCripts;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.OrangeHRM.ObjectRepository.AdminPage;
import com.OrangeHRM.ObjectRepository.HomePage;
import com.OrangeHRM.ObjectRepository.LoginPage;
import com.OrangeHRM.ObjectRepository.LogoutPage;
import com.OrangeHRM.Utilities.CaptureDefects;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage implements ApplicationConstants
{
	public LoginPage lp;
	public LogoutPage logout;
	public HomePage homepage;
	public AdminPage adminpage;
	WebDriver driver;
	@Parameters("Browser")
	@BeforeClass
	public void BrowserSetup(String Browser)
	{
		switch(Browser)
		{
		case "chrome":WebDriverManager.chromedriver().setup();
		break;
		case "fire": WebDriverManager.firefoxdriver().setup();
		break;
		default: System.out.println("Invalid browser");
		
		}
		
	}
	@Parameters("BrowserIntialization")
	@BeforeMethod
	public void LaunchApplication(String Browser) throws Throwable
	{
		switch(Browser)
		{
		case "chrome":driver=new ChromeDriver();
		break;
		case "fire": driver=new FirefoxDriver();
		break;
		default: System.out.println("Invalid driver paths");
		}
		lp=new LoginPage(driver);
		logout=new LogoutPage(driver);
		homepage =new HomePage(driver);
		adminpage=new AdminPage(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Timeouts, TimeUnit.SECONDS);
		Properties property=ReadPropertyValue.ReadProperty();
		driver.get(property.getProperty("LoginPageUrl"));
		lp.enterUsn().sendKeys(property.getProperty("adminUsn"));
		lp.enterPsw().sendKeys(property.getProperty("adminPsw"));
		lp.clickLoginBtn().click();
		Thread.sleep(2000);
	}
	
		
	
	
	@AfterMethod
	public void CloseApplication(ITestResult result) throws Exception
	{
		if(result.FAILURE==result.getStatus())
		{
			CaptureDefects.GetDefects(driver, result.getName());
		}
		logout.clicklogoutDropdown().click();
		logout.clicklogoutBtn().click();
		driver.quit();
	}
	



}
