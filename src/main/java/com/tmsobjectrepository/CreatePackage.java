package com.tmsobjectrepository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.genericlibraries.ExcelUtility;
import com.genericlibraries.FileUtility;
import com.genericlibraries.WebDriverUtility;

public class CreatePackage {

	
		FileUtility f=new FileUtility();
		ExcelUtility e=new ExcelUtility();
		WebDriverUtility w=new WebDriverUtility();
		WebDriver driver;
		
		public CreatePackage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			this.driver=driver;
			
		}
		
		/*@FindBy(xpath="//a[text()='Admin Login']")
		private WebElement admin_login;
		
		@FindBy(xpath="//input[@class='name']")
		private WebElement userNameEdt;
		
		@FindBy(xpath="//input[@class='password']")
		private WebElement userPasswordEdt;
		
		@FindBy(xpath="//input[@class='login']")
//		private WebElement loginBtn;
		*/
		
		

		
		@FindBy(xpath="//span[text()=' Tour Packages']")
		private WebElement t_package;
		
		
		@FindBy(xpath="//a[text()='Create']")
		private WebElement crt;
		
		@FindBy(xpath="//input[@id='packagename']")
		private WebElement pck_name;
		
		@FindBy(xpath="//input[@id='packagetype']")
		private WebElement pck_type;
		
		@FindBy(xpath="//input[@id='packagelocation']")
		private WebElement pck_location;
		
		
		@FindBy(xpath="//input[@id='packageprice']")
		private WebElement pck_price;
		
		
		@FindBy(xpath="//input[@id='packagefeatures']")
		private WebElement pck_feature;
		
		@FindBy(xpath="//textarea[@id='packagedetails']")
		private WebElement pck_detail;
		
		@FindBy(xpath="//input[@id='packageimage']")
		private WebElement pck_img;
		
		@FindBy(xpath="//button[@type='submit']")
		private WebElement pack_submit;
		
		public void createPack() throws Throwable
		{
			
			/*admin_login.click();
			userNameEdt.sendKeys(f.getPropertyKeyValue("username"));
			userPasswordEdt.sendKeys(f.getPropertyKeyValue("password"));
			loginBtn.click();
			*/
			t_package.click();
			Thread.sleep(2000);
			crt.click();
			Thread.sleep(2000);
			pck_name.sendKeys(e.getExcelData("Sheet1", 7, 0));
			pck_type.sendKeys(e.getExcelData("Sheet1", 7, 1));
			pck_location.sendKeys(e.getExcelData("Sheet1", 7, 2));
			pck_price.sendKeys(e.getExcelData("Sheet1", 7, 3));
			pck_feature.sendKeys(e.getExcelData("Sheet1", 7, 4));
			pck_detail.sendKeys(e.getExcelData("Sheet1", 7, 5));
			pck_img.sendKeys("C:\\Users\\HP\\Pictures\\Screenshots\\Screenshot (10).Png");
			Thread.sleep(2000);
			int x=pack_submit.getLocation().getX();
			int y=pack_submit.getLocation().getY();
			Thread.sleep(2000);
			w.scroll(driver, x, y);
			Thread.sleep(2000);

			pack_submit.click();
		}
		
		
		
		

	}

