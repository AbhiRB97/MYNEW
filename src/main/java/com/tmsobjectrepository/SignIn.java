package com.tmsobjectrepository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.genericlibraries.FileUtility;

public class SignIn {
	FileUtility f=new FileUtility();
	
	
	@FindBy(xpath = "//h3[.='Signin with your account ']/following-sibling::input[@id='email']")
	private WebElement userName;
	
	@FindBy(xpath = "//h3[.='Signin with your account ']/following-sibling::input[@id='password']")
	private WebElement pass;
	
	@FindBy(name = "signin")
	private WebElement button;
	
	public SignIn(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void logIn() throws Throwable
	{
		String userId = f.getPropertyKeyValue("user");
		String password=f.getPropertyKeyValue("pwd");
		userName.sendKeys(userId);
		pass.sendKeys(password);
		button.click();
		
	}

}
