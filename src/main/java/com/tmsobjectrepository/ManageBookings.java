package com.tmsobjectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageBookings {
	
	
	@FindBy(xpath = "//a[@href='manage-bookings.php']")
	private WebElement manageBooking;
	
	@FindBy(xpath = "//table[@id='table']/tbody/tr[last()]/td[last()]//a[.='Cancel']")
	private WebElement cancleLink;
	
	@FindBy(xpath = "//table[@id='table']/tbody/tr[last()]/td[last()]/span")
	private WebElement cancleStatus;
	
	
	public ManageBookings(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getCancleStatus() {
		return cancleStatus;
	}

	public void getManageBooking() {
		manageBooking.click();;
	}

	public WebElement getCancleLink() {
		return cancleLink;
	}
	
	

}
