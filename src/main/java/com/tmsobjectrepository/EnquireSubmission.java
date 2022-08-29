package com.tmsobjectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.genericlibraries.ExcelUtility;
import com.genericlibraries.FileUtility;

public class EnquireSubmission {

	FileUtility f=new FileUtility();
	ExcelUtility e=new ExcelUtility();
	
	public EnquireSubmission(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[text()=' Enquiry ']")
	private WebElement enquiry;
	
	@FindBy(xpath="//input[@id='fname']")
	private WebElement f_name;
	
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement e_mail;
	
	
	@FindBy(xpath="//input[@id='mobileno']")
	private WebElement mobile_no;
	
	@FindBy(xpath="//input[@id='subject']")
	private WebElement subject;
	
	@FindBy(xpath="//textarea[@id='description']")
	private WebElement description;
	
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submit_btn;
	
	
	public void enquiry() throws Throwable
	{
		
		enquiry.click();
		f_name.sendKeys(e.getExcelData("Sheet1", 23, 0));
		e_mail.sendKeys(e.getExcelData("Sheet1", 23, 1));
		mobile_no.sendKeys(e.getExcelData("Sheet1", 23, 2));
		subject.sendKeys(e.getExcelData("Sheet1", 23, 3));
		description.sendKeys(e.getExcelData("Sheet1", 23, 4));
	    submit_btn.click();
	}
}
