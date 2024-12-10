package com.OrangeHRM.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage 
{
	@FindBy(xpath="//span[.='Admin']")
	private WebElement adminbtn;
	@FindBy(xpath="//h6[.='Admin']")
	private WebElement adminvalidation;
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement usernametxt;
	@FindBy(xpath="(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")
	private WebElement userroledrpdwn;
	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	private WebElement empname;
	@FindBy(xpath="(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")
	private WebElement statusdrpdwn;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submitbtn;
	public  AdminPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public  WebElement Enteradmn()
	{
		return adminbtn;
	}
	public WebElement Validadmin()
	{
		return adminvalidation;
	}
	public WebElement enterusn()
	{
		return usernametxt;
	}
	public WebElement clickdrop()
	{
		return userroledrpdwn;
	}
	public WebElement enterempname()
	{
		return empname;
	}
	public WebElement clickstatusdrp()
	{
		return statusdrpdwn;
	}
	public WebElement clicksubmit()
	{
		return submitbtn;
	}
	

}
