package com.tmsobjectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminLogout {
	@FindBy(xpath = "//div[@class='profile_details w3l']")
	private WebElement adminProfile;
	
	
	@FindBy(xpath = "//a[@href='logout.php']")
	private WebElement logoutLink;
	
	
	@FindBy(xpath = "//a[.='Back to home']")
	private WebElement backToHomeLink;
	
	public AdminLogout(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void logoutAsAdmin()
	{
		adminProfile.click();
		logoutLink.click();
		backToHomeLink.click();
	}
	

}
