package com.tmsobjectrepository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.genericlibraries.WebDriverUtility;


public class TouristManagementSystem {
	WebDriverUtility w=new WebDriverUtility();
	@FindBy(xpath = "//ul[@class='nav navbar-nav']/descendant::a[.='Tour Packages']")
	private WebElement TourpackageTab;
	
	@FindBy(xpath="//a[.='/ Sign In' and @href='#']")
	private WebElement signInLink;
	
	@FindBy(xpath = "//a[.=' Enquiry ']")
	private WebElement enquireLink;
	
	@FindBy(xpath = "//a[@href='change-password.php']")
	private WebElement changePasswordLink;
	
	@FindBy(name  = "password")
	private WebElement oldpassword;
	
	@FindBy(name  = "newpassword")
	private WebElement newpassword;
	
	@FindBy(name  = "confirmpassword")
	private WebElement confirmpassword;
	
	
	@FindBy(name  = "submit5")
	private WebElement update;
	
	@FindBy(xpath = "//div[@class='succWrap']")
	private WebElement successfullMessage;
	
	@FindBy(xpath = "//a[@href='logout.php']")
	private WebElement logout;
	
	public TouristManagementSystem(WebDriver driver)
	{
		PageFactory.initElements(driver,this);	
	}


	public void getTourpackageTab() {
		TourpackageTab.click();
	}

	public WebElement getSignInLink() {
		return signInLink;
	}

	public WebElement getEnquireLink() {
		return enquireLink;
	}
	
	
	public WebElement getConfirmationMessage() {
		return successfullMessage;
	}
	
	
	public void logout() {
		logout.click();
	}


	public void updatepassword(String oldPassword, String newPassword, String reenterPassword) throws InterruptedException
	{
		changePasswordLink.click();
		Thread.sleep(2000);
		oldpassword.sendKeys(oldPassword);
		newpassword.sendKeys(newPassword);
		confirmpassword.sendKeys(reenterPassword);
		Thread.sleep(2000);
		update.click();
		
		
	}
	
	

}
