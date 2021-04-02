package com.netvision.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.netvision.qa.base.TestBase;
import com.netvision.qa.page.HomePage;
import com.netvision.qa.page.LoginPage;

import com.netvision.qa.page.Sessionfiters;

public class HomePageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	Sessionfiters sessions;
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		 loginPage=new LoginPage();
		 homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	}

	@Test(priority=1)
	public void verifyHomePageTitleTest()
	{
		String homePageTitle = homePage.verifyHomePageTitle();
		
		Assert.assertEquals(homePageTitle,"Cavisson NetVision (NOC_NV)","Home Page title not matched");
	}
	
	@Test(priority=2)
	public void verifyUnfiedDashBoardPageByAlertCapacity()
	{
	 boolean alertCapacityText = homePage.verifyLoginPage();
	Assert.assertTrue(alertCapacityText);
	}
	
	@Test(priority=3)
	public void clickViewIcon() 
	{
		
	homePage.clickViewButton();
	
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
