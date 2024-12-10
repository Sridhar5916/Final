package com.OrangeHRM.RunnerScript.Admin;

import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.GenericSCripts.BasePage;
import com.OrangeHRM.GenericSCripts.ReadPropertyValue;
import com.OrangeHRM.ObjectRepository.AdminPage;
import com.OrangeHRM.Utilities.HandlingDropdowns;
import com.OrangeHRM.Utilities.UtilityObjects;
import com.google.j2objc.annotations.Property;

public class AdminSmokeTest extends BasePage
{
	@Test
	public void Enteradmn() throws Exception 
		{
		adminpage.Enteradmn().click();
		Thread.sleep(2000);
		adminpage.Validadmin().click();
		String ExpectedPage="Admin";
		String ActualPage = adminpage.Validadmin().getText();
		Assert.assertEquals(ActualPage, ExpectedPage, "Admin page is valid");
		System.out.println("Valid");
		Thread.sleep(2000);
		Properties property=ReadPropertyValue.ReadProperty();
		adminpage.enterusn().sendKeys(property.getProperty("username"));
		adminpage.enterempname().sendKeys(property.getProperty("employeename"));
		System.out.println("enteredname");
		}
	public void enterusn()
	{
		adminpage.enterusn().sendKeys("Ram");
		System.out.println("enteredname");
	}
	public void clickdrop()
	{
		adminpage.clickdrop().click();
		System.out.println("clickondropdown");
	}
	public void enterempname()
	{
		adminpage.enterempname().sendKeys("Hello");
		System.out.println("keyssent");
	}
	public void clickstatusdrp()
	{
		adminpage.clickstatusdrp().click();
		System.out.println("statusdropdown");
	}
	public void clicksubmit()
	{
		adminpage.clicksubmit().click();
		System.out.println("submited");
	}
	

}
