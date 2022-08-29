package com.tmsobjectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminHome {
	@FindBy(xpath = "//a[@href='manage-bookings.php']")
	private WebElement manageBooking;
	
	@FindBy(xpath = "//a[@class='sidebar-icon']")
	private WebElement hideSideBar;
	
	public AdminHome(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getManageBooking() {
		return manageBooking;
	}

	public WebElement getHideSideBar() {
		return hideSideBar;
	}
	
	

}
