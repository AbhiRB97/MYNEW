package com.tmsobjectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyTourHistory {
	
	@FindBy(xpath = "//a[.='My Tour History']")
	private WebElement myTourHistoryTab;
	
	@FindBy(xpath = "//table/tbody/tr[last()]/td[last()]//a")
	private WebElement cancleLink;

	@FindBy(xpath = "//div[@class='succWrap']")
	private WebElement successfulMessage;
	

	@FindBy(xpath = "//table[@id='table']/tbody/tr[last()]/td[last()]/span")
	private WebElement status;
	
	public MyTourHistory(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	


	public WebElement getMyTourHistoryTab() {
		return myTourHistoryTab;
	}


	public WebElement getCancleLink() {
		return cancleLink;
	}


	public WebElement getSuccessfulMessage() {
		return successfulMessage;
	}


	public WebElement getStatus() {
		return status;
	}
	
	
	
	

}
