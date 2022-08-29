package com.tmsobjectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.genericlibraries.FileUtility;

public class AdminLogin {
	
	FileUtility f=new FileUtility();
	@FindBy(xpath = "//a[.='Admin Login']")
	private WebElement adminLoginLink;

	@FindBy(xpath = "//input[@type='text']")
	private WebElement adminUserName;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement adminPassword;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submit;
	
	public AdminLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void logIn() throws Throwable
	{
		adminLoginLink.click();
		adminUserName.sendKeys(f.getPropertyKeyValue("admin"));
		adminPassword.sendKeys(f.getPropertyKeyValue("password"));
		submit.click();
	}

}
