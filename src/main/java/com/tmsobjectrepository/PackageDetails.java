package com.tmsobjectrepository;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.genericlibraries.WebDriverUtility;


public class PackageDetails {
	
	WebDriverUtility w=new WebDriverUtility();
	
	@FindBy(xpath = "//h3[.='Package List']/parent::div[@class='room-bottom']"
			+ "/descendant::h4[contains(.,'Manali')]/parent::div[@class='col-md-6 room-midle wow fadeInUp animated animated']"
			+ "/following-sibling::div[@class='col-md-3 room-right wow fadeInRight animated animated']/child::a[.='Details']")
	private WebElement detailsButton;
	
	@FindBy(xpath = "//div[@class='bnr-right']/label[.='From']/following-sibling::input")
	private WebElement fromWidget;
	
	@FindBy(xpath = "//table[@class='ui-datepicker-calendar']/tbody/descendant::td[@data-month='7' and @data-year='2022']/child::a[.='20']")
	private WebElement from;
	


	@FindBy(xpath = "//div[@class='bnr-right']/label[.='To']/following-sibling::input")
	private WebElement toWidget;
	
	
	@FindBy(xpath = "//table[@class='ui-datepicker-calendar']/tbody/descendant::td[@data-month='7' and @data-year='2022']/child::a[.='21']")
	private WebElement to;
	
	@FindBy(xpath = "//input[@name='comment']")
	private WebElement comm;
	
	@FindBy(xpath = "//button[.='Book']")
	private WebElement submitButton;
	
	@FindBy(xpath = "//div[@class='succWrap']")
	private WebElement success;
	public WebDriver driver;
	public PackageDetails(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
		
	}
	
	public void bookPackage(String comment) throws InterruptedException
	{
		detailsButton.click();
		Thread.sleep(2000);
		fromWidget.click();
		Thread.sleep(2000);
		from.click();
		toWidget.click();
		Thread.sleep(2000);
		to.click();
		Point loc = comm.getLocation();
		Thread.sleep(2000);
		w.scroll(driver, loc.getX(), loc.getY());
		Thread.sleep(2000);
		comm.sendKeys(comment);
		submitButton.click();
	
	}

	public WebElement getSuccess() {
		return success;
	}
	
	
	
	
}
