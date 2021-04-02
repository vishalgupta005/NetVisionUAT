package com.netvision.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.netvision.qa.base.TestBase;
import com.netvision.qa.page.HomePage;
import com.netvision.qa.page.LoginPage;



public class LoginPageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	
 public LoginPageTest() {
	super();
}
	
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		 loginPage=new LoginPage();
	}
	
	
	
	@Test(priority=1)
	public void netvisionLogoTest()
	{
		boolean flag = loginPage.validateNetvisionLogo();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=2)
	public void loginTest()
	{
		homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		
		
	}
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
	

}
