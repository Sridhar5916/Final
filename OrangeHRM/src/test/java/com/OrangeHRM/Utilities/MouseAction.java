package com.OrangeHRM.Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MouseAction 
{
	public static void RightClick(WebDriver driver, WebElement element)
	{
		UtilityObjects.MouseActions(driver).contextClick().perform();
	}
	public static void DoubeClick(WebDriver driver, WebElement element)
	{
		UtilityObjects.MouseActions(driver).doubleClick().perform();
	}
	public static void MouseHover(WebDriver driver, WebElement element)
	{
		UtilityObjects.MouseActions(driver).moveToElement(element).perform();
	}
	public static void DragAndDrop(WebDriver driver, WebElement src, WebElement dst)
	{
		UtilityObjects.MouseActions(driver).dragAndDrop(src, dst).perform();
	}

}
