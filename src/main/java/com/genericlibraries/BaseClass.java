package com.genericlibraries;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.tmsobjectrepository.TouristManagementSystem;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver sdriver;
	public WebDriver driver;
	
	FileUtility flib=new FileUtility();
	WebDriverUtility wlib=new WebDriverUtility();


	@BeforeSuite(groups = { "smoke", "regression" })
	public void dbConnection() {
		System.out.println("Connected to Database");
	}
	//@Parameters("browser")
	@BeforeClass(groups = { "smoke", "regression" })
	public void browser() throws Throwable {
		String  browser = flib.getPropertyKeyValue("browser");
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();

		} else {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();		
		}
		driver.get(flib.getPropertyKeyValue("url"));
		wlib.waitForElementInDOM(driver);
		sdriver = driver;

	}

	TouristManagementSystem t;
	/*
	 * @BeforeMethod public void signIn() throws Throwable {
	 * 
	 * driver.get(flib.getPropertyKeyValue("url"));
	 * 
	 * t=new TouristManagementSystem(driver); t.getSignInLink().click();
	 * 
	 * SignIn s=new SignIn(driver); s.logIn(); Thread.sleep(2000); /*AdminLogin
	 * a=new AdminLogin(driver); a.logIn();
	 * 
	 * }
	 * 
	 * @AfterMethod public void logout() { t.logout(); }
	 */

	@AfterClass(groups = { "smoke", "regression" })
	public void closeBrowser() {
		driver.close();
	}

	@AfterSuite(groups = { "smoke", "regression" })
	public void dbConnectionClosing() {
		System.out.println("Database Connection Closed");
	}

}
