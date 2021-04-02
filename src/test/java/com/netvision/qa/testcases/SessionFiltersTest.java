package com.netvision.qa.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.netvision.qa.base.TestBase;
import com.netvision.qa.page.HomePage;
import com.netvision.qa.page.LoginPage;
import com.netvision.qa.page.Sessionfiters;

public class SessionFiltersTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	Sessionfiters session;
	
	public SessionFiltersTest() {
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
	public void SessionWindowTitleTest()
	{
		homePage.clickViewButton();
		String sessionPageTitle = session.verifySessionWindowTitle();
		System.out.println(sessionPageTitle);
		Assert.assertEquals(sessionPageTitle, "Cavisson NetVision (NOC_NV)","Session page Title not matched");
	}
	
	
	@Test(priority=2)
	public void SessionWindowTest()
	{
		homePage.clickViewButton();
		System.out.println("vishal g");
		
		boolean flag1 = session.verifySessionWindow();
		Assert.assertTrue(flag1);
	}
	
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

	
	
}
