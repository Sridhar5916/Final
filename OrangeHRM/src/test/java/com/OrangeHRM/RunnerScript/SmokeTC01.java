package com.OrangeHRM.RunnerScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.GenericSCripts.BasePage;

public class SmokeTC01 extends BasePage
{
	@Test
	public void CheckAdminDashboard()
	{
		String ExpectedText = "Dashboard";
		String ActualText = homepage.CheckDashBoard().getText();
		Assert.assertEquals(ActualText, ExpectedText, " The verification is Successful");
	}
	@Test
	public void CheckPIMPage() throws InterruptedException
	{
		homepage.ClickPIMButton().click();
		String ExpectedPage="PIM";
		String ActualPage = homepage.CheckPIMPage().getText();
		Assert.assertEquals(ActualPage, ExpectedPage, "PIM page is not valid");
		Thread.sleep(2000);
	}
	@Test
	public void AddEmpBtn() throws InterruptedException
	{
		Thread.sleep(2000);
		boolean res = homepage.VerifyAddEmpBtn().isEnabled();
		Assert.assertTrue(res,  " the element  is not enabled");
		Thread.sleep(2000);
		homepage.VerifyAddEmpBtn().click();
		Thread.sleep(Timeouts);
		boolean res1 = homepage.VerifyAddEmpPage().isDisplayed();
		Assert.assertTrue(res1, " The page is not displayed");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
