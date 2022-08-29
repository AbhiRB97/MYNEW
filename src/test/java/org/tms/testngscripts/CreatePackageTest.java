package org.tms.testngscripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.genericlibraries.BaseClass;
import com.genericlibraries.ExcelUtility;
import com.genericlibraries.FileUtility;
import com.genericlibraries.JavaUtility;
import com.genericlibraries.WebDriverUtility;
import com.tmsobjectrepository.AdminLogin;
import com.tmsobjectrepository.AdminLogout;
import com.tmsobjectrepository.CreatePackage;
import com.tmsobjectrepository.EnquireSubmission;
import com.tmsobjectrepository.PackageDetails;
import com.tmsobjectrepository.SignIn;
import com.tmsobjectrepository.TouristManagementSystem;


public class CreatePackageTest extends BaseClass {
		
				WebDriverUtility wlib=new WebDriverUtility();
				FileUtility flib=new FileUtility();
				JavaUtility jlib=new JavaUtility();
				ExcelUtility elib=new ExcelUtility();
				TouristManagementSystem t;
				PackageDetails p;
				SignIn s;
				

				@Test(groups = "smoke")
				public void Verify_CreatepackageTest() throws Throwable
				{
					String URL=flib.getPropertyKeyValue("url");
					driver.get(URL);
					
					AdminLogin adminLogin = new AdminLogin(driver);
					adminLogin.logIn();
				
					
				
					CreatePackage pack=new CreatePackage(driver);
					
					pack.createPack();
					
				

					
					WebElement b = driver.findElement(By.xpath("//div[text()=':Package Created Successfully ']"));
					String text = b.getText();
					System.out.println(b);
					Assert.assertEquals(text, "SUCCESS:Package Created Successfully");
						
						
					AdminLogout logout=new AdminLogout(driver);
					logout.logoutAsAdmin();
				
			}
				
				
				@Test(groups = "regression")
				
				public void verify_enquirysubmissionTest() throws Throwable
				{    
					String URL = flib.getPropertyKeyValue("url");
					driver.get(URL);
					//step:4--login to app
					EnquireSubmission es=new EnquireSubmission(driver);
					es.enquiry();
					
					WebElement b = driver.findElement(By.xpath("//div[text()=':Enquiry  Successfully submited ']"));
					if(b.isDisplayed())
					{
						System.out.println("Test case pass");
					}
					else
					{
						System.out.println("Test case fail");
					}
				
					

			}
				
				@Test(groups = "smoke")
				public void testCase() throws Throwable {
					t=new TouristManagementSystem(driver);
					p=new PackageDetails(driver);
					t.getSignInLink().click();
					s=new SignIn(driver);
					s.logIn();
					
				t.getTourpackageTab();
				Thread.sleep(2000);
				p.bookPackage("I want to book 2 seats");
				if(p.getSuccess().isDisplayed())
				{
					System.out.println("Booked Successfully");
				}
				else
				{
					System.out.println("Not Booked");
				}

				t.logout();
			}


	}



